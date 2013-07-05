package me.craft4ik.launcher;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class class1044 extends Thread
{
	public int entry0 = 0;
	public long entry1 = 0L;
	public long entry10 = 0L;
	public String entry100 = "...";
	public int entry1000 = 0;
	public List entry1001 = new ArrayList();
	public String entry1002 = "...";
	public boolean entry1003 = false;
	public String[] entry1004;
	
	public class1044(List var1, boolean var2, String[] var3)
	{
		entry1001 = var1;
		entry1003 = var2;
		entry1004 = var3;
	}
	
	@Override public final void run()
	{
		try
		{
			String var1 = class100.entry1004() + File.separator;
			String var2 = class100.entry1("files/clients/" + class100.entry1002() + "/");
			File var3 = new File(var1 + "bin" + File.separator);
			if(!var3.exists())
			{
				var3.mkdirs();
			}
			var3 = new File(var1 + "bin" + File.separator + "natives" + File.separator);
			if(!var3.exists())
			{
				var3.mkdirs();
			}
			var3 = new File(var1 + "mods" + File.separator);
			if(!var3.exists())
			{
				var3.mkdirs();
			}
			var3 = new File(var1 + "coremods" + File.separator);
			if(!var3.exists())
			{
				var3.mkdirs();
			}
			entry1002 = "вычисление размера...";
			for(int var4 = 0; var4 < entry1001.size(); ++var4)
			{
				URLConnection var5 = new URL(var2 + (String) entry1001.get(var4)).openConnection();
				var5.setDefaultUseCaches(false);
				entry1 += var5.getContentLength();
			}
			entry1002 = "загрузка файлов...";
			if(!entry1001.isEmpty())
			{
				Frame.log("Запуск процесса загрузки файлов: ");
			}
			byte[] var16 = new byte[65536];
			for(int var17 = 0; var17 < entry1001.size(); ++var17)
			{
				entry100 = (String) entry1001.get(var17);
				Frame.log(" * Загрузка файла: " + entry100);
				BufferedInputStream var6 = new BufferedInputStream(new URL(var2 + (String) entry1001.get(var17)).openStream());
				FileOutputStream var7 = new FileOutputStream(var1 + (String) entry1001.get(var17));
				long var8 = System.currentTimeMillis();
				int var10 = 0;
				boolean var11 = false;
				MessageDigest var12 = MessageDigest.getInstance("MD5");
				int var19;
				while((var19 = var6.read(var16, 0, var16.length)) != -1)
				{
					var7.write(var16, 0, var19);
					var12.update(var16, 0, var19);
					entry10 += var19;
					entry0 = (int) (entry10 * 100L / entry1);
					var10 += var19;
					long var13 = System.currentTimeMillis() - var8;
					if(var13 >= 1000L)
					{
						entry1000 = (int) ((int) ((float) var10 / (float) var13 * 100.0F) / 100.0F);
						var10 = 0;
						var8 += 1000L;
					}
				}
				var6.close();
				var7.close();
				Frame.log(" * * Файл " + entry100 + " загружен");
			}
			entry1002 = "завершение...";
			if(entry1003)
			{
				String var18 = class1014.entry10(class100.entry1004() + File.separator + "extra.zip");
				class100.entry0(class100.entry1002() + "_hashZip", (Object) class1014.entry1(var18));
				class102.entry0();
			}
			new class1045(entry1004);
		} catch(Exception var15)
		{
			var15.printStackTrace();
			entry1002 = var15.toString();
		}
	}
}
