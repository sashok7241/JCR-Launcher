package me.craft4ik.launcher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.Timer;

public class class1045 extends JFrame
{
	private static final long serialVersionUID = 1L;
	public static class1021 entry0;
	
	public class1045(String[] var1)
	{
		String login = LauncherAuthFrame.frame.offline.isSelected() ? "Player" : LauncherAuthFrame.frame.login.getText();
		String session = LauncherAuthFrame.frame.offline.isSelected() ? "123456" : LauncherGuard.getMD5String(var1[7]);
		LauncherGuard.entry0(LauncherAuthFrame.settings, true);
		new Timer(30000, new class1046(this)).start();
		try
		{
			addWindowListener(new class1047(this));
			String var4 = LauncherUtils.getMinecraftDirectory() + File.separator + "bin" + File.separator;
			setForeground(Color.BLACK);
			setBackground(Color.BLACK);
			URL[] urls = new URL[] { new File(var4, "minecraft.jar").toURI().toURL(), new File(var4, "lwjgl.jar").toURI().toURL(), new File(var4, "jinput.jar").toURI().toURL(), new File(var4, "lwjgl_util.jar").toURI().toURL() };
			entry0 = new class1021(var4, urls);
			entry0.entry0.put("username", login);
			entry0.entry0.put("sessionid", session);
			entry0.entry0.put("stand-alone", "true");
			if(!LauncherAuthFrame.frame.offline.isSelected())
			{
				entry0.entry0.put("server", LauncherUtils.getSelectedServer()[1]);
				entry0.entry0.put("port", LauncherUtils.getSelectedServer()[2]);
			}
			setTitle("qoobworld.ru - уютные майнкрафт сервера");
			this.setSize(880, 520);
			setLocationRelativeTo((Component) null);
			setLayout(new BorderLayout());
			setIconImage(LauncherUtils.loadLocalImage(LauncherUtils.getSettings().getClientFaviconImage()));
			if(LauncherUtils.entry1002("full_screen"))
			{
				setExtendedState(6);
			}
			entry0.setForeground(Color.BLACK);
			entry0.setBackground(Color.BLACK);
			this.add(entry0, "Center");
			validate();
			LauncherAuthFrame.frame.setVisible(false);
			setVisible(true);
			entry0.init();
			entry0.start();
		} catch(Exception var6)
		{
			var6.printStackTrace();
		}
	}
}
