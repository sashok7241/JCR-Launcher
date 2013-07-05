package me.craft4ik.launcher;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class102
{
	public static final void entry0()
	{
		try
		{
			String var0 = class100.entry1004() + File.separator;
			String var1 = var0 + File.separator + "extra.zip";
			Vector var2 = new Vector();
			ZipFile var3 = new ZipFile(var1);
			Throwable var4 = null;
			try
			{
				Enumeration var5 = var3.entries();
				while(var5.hasMoreElements())
				{
					var2.addElement(var5.nextElement());
				}
				for(int var6 = 0; var6 < var2.size(); ++var6)
				{
					ZipEntry var7 = (ZipEntry) var2.elementAt(var6);
					entry0(var1, var0, var7.getName(), var3, var7);
				}
			} catch(Throwable var16)
			{
				var4 = var16;
				throw var16;
			} finally
			{
				if(var3 != null)
				{
					if(var4 != null)
					{
						try
						{
							var3.close();
						} catch(Throwable var15)
						{
							var4.addSuppressed(var15);
						}
					} else
					{
						var3.close();
					}
				}
			}
			new File(var1).delete();
		} catch(Exception var18)
		{
			Frame.log(var18.toString());
		}
	}
	
	private static final String entry0(String var0)
	{
		char[] var2 = new char[var0.length()];
		for(int var1 = 0; var1 < var0.length(); ++var1)
		{
			if(var0.charAt(var1) == 47)
			{
				var2[var1] = File.separatorChar;
			} else
			{
				var2[var1] = var0.charAt(var1);
			}
		}
		String var3 = new String(var2);
		return var3;
	}
	
	private static final void entry0(String var0, String var1, String var2, ZipFile var3, ZipEntry var4) throws IOException
	{
		if(!var4.isDirectory())
		{
			String var5 = entry0(var2);
			String var6;
			if(var5.lastIndexOf(File.separator) != -1)
			{
				var6 = var5.substring(0, var5.lastIndexOf(File.separator));
			} else
			{
				var6 = "";
			}
			File var7 = new File(var1 + File.separator + var6);
			var7.mkdirs();
			FileOutputStream var8 = new FileOutputStream(var1 + File.separator + var5);
			InputStream var9 = var3.getInputStream(var4);
			byte[] var10 = new byte[1024];
			while(true)
			{
				int var11 = var9.read(var10);
				if(var11 < 0)
				{
					var9.close();
					var8.close();
					return;
				}
				var8.write(var10, 0, var11);
			}
		}
	}
}
