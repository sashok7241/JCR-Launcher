package me.craft4ik.launcher;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

public class class1021 extends Applet implements AppletStub
{
	private static final long serialVersionUID = 1L;
	private Applet entry1 = null;
	public Map entry0 = new HashMap();
	private int entry10 = 0;
	private boolean entry100 = false;
	private URL[] entry1000;
	private String entry1001;
	
	public class1021(String var1, URL[] var2)
	{
		entry1001 = var1;
		entry1000 = var2;
	}
	
	@Override public final void appletResize(int var1, int var2)
	{
	}
	
	@Override public final void destroy()
	{
		if(entry1 != null)
		{
			entry1.destroy();
		}
	}
	
	public final void entry0(Applet var1)
	{
		entry1 = var1;
		var1.setStub(this);
		var1.setSize(getWidth(), getHeight());
		setLayout(new BorderLayout());
		this.add(var1, "Center");
		var1.init();
		entry100 = true;
		var1.start();
		validate();
	}
	
	public final void entry0(int var1)
	{
		URLClassLoader var2 = new URLClassLoader(entry1000);
		System.setProperty("org.lwjgl.librarypath", entry1001 + "natives");
		System.setProperty("net.java.games.input.librarypath", entry1001 + "natives");
		try
		{
			LauncherUtils.patchMinecraft(var2);
			Class var3 = var2.loadClass("net.minecraft.client.MinecraftApplet");
			Applet var4 = (Applet) var3.newInstance();
			entry1 = var4;
			var4.setStub(this);
			var4.setSize(getWidth(), getHeight());
			setLayout(new BorderLayout());
			this.add(var4, "Center");
			var4.init();
			entry100 = true;
			validate();
		} catch(Exception var5)
		{
			var5.printStackTrace();
		}
	}
	
	@Override public final URL getDocumentBase()
	{
		try
		{
			return new URL("http://www.minecraft.net/game/");
		} catch(MalformedURLException var2)
		{
			var2.printStackTrace();
			return null;
		}
	}
	
	@Override public final String getParameter(String var1)
	{
		String var2 = (String) entry0.get(var1);
		if(var2 != null) return var2;
		else
		{
			try
			{
				return super.getParameter(var1);
			} catch(Exception var4)
			{
				entry0.put(var1, (Object) null);
				return null;
			}
		}
	}
	
	@Override public final void init()
	{
		if(entry1 != null)
		{
			entry1.init();
		} else
		{
			this.entry0(0);
		}
	}
	
	@Override public final boolean isActive()
	{
		if(entry10 == 0)
		{
			entry10 = -1;
			try
			{
				if(getAppletContext() != null)
				{
					entry10 = 1;
				}
			} catch(Exception var2)
			{
				;
			}
		}
		return entry10 == -1 ? entry100 : super.isActive();
	}
	
	@Override public final void start()
	{
		if(entry1 != null)
		{
			LauncherAuthFrame.log("-------------------------------");
			LauncherAuthFrame.log("Перенаправление на Minecraft...");
			LauncherAuthFrame.log("-------------------------------");
			entry1.start();
		}
	}
	
	@Override public final void stop()
	{
		if(entry1 != null)
		{
			entry100 = false;
			entry1.stop();
		}
	}
}
