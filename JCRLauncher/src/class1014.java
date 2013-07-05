import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Formatter;

public class class1014
{
	public static final String entry0()
	{
		try
		{
			return class1024.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		} catch(Exception var1)
		{
			var1.printStackTrace();
			return null;
		}
	}
	
	public static final String entry0(String var0)
	{
		String var1 = null;
		try
		{
			MessageDigest var2 = MessageDigest.getInstance("MD5");
			var2.update(var0.getBytes(), 0, var0.length());
			var1 = new BigInteger(1, var2.digest()).toString(16);
		} catch(Exception var3)
		{
			var3.printStackTrace();
		}
		return var1;
	}
	
	public static final boolean entry0(String[] var0)
	{
		boolean var1 = true;
		String[] var2 = var0[9].split("<:m:>");
		String[] var3 = new String[var2.length];
		String[] var4 = new String[var2.length];
		if(!var0[9].equals("nomods"))
		{
			for(int var5 = 0; var5 < var2.length; ++var5)
			{
				var3[var5] = var2[var5].split("<:h:>")[0];
				var4[var5] = var2[var5].split("<:h:>")[1];
			}
		}
		class1033.entry0("GUARD: Проверка модификаций в папке \"mods\"...");
		File var11 = new File(class100.entry1004() + File.separator + "mods");
		String[] var6 = var11.list();
		if(var6 != null && var6.length != 0)
		{
			int var7;
			File var8;
			String var9;
			if(var0[9].equals("nomods"))
			{
				for(var7 = 0; var7 < var6.length; ++var7)
				{
					var8 = new File(var11 + File.separator + var6[var7]);
					class100.entry0(var8);
					var9 = "";
					if(!var8.exists())
					{
						var9 = "и удален ";
					}
					class1033.entry0("GUARD: Обнаружен " + var9 + "сторонний объект: " + var6[var7]);
					var1 = false;
				}
			} else
			{
				String[] var12 = var11.list(new class1002());
				for(String element : var12)
				{
					if(class100.entry0(var3, element) == -1)
					{
						File var14 = new File(var11 + File.separator + element);
						class100.entry0(var14);
						String var10 = "";
						if(!var14.exists())
						{
							var10 = "и удалена ";
						}
						class1033.entry0("GUARD: Обнаружена " + var10 + "сторонняя модификация: " + element);
						var1 = false;
					}
				}
			}
			for(var7 = 0; var7 < var3.length; ++var7)
			{
				var8 = new File(var11 + File.separator + var3[var7]);
				if(!var4[var7].equals(entry10(var8.toString())))
				{
					var8.delete();
					var9 = "";
					if(!var8.exists())
					{
						var9 = "и удален ";
					}
					class1033.entry0("GUARD: Обнаружен " + var9 + "файл подменённого мода: " + var3[var7]);
					var1 = false;
				}
			}
			return var1;
		} else return true;
	}
	
	public static final void entry0(String[] var0, boolean var1)
	{
		if(!class1033.entry1001.entry1018.isSelected())
		{
			class1033.entry0("GUARD: Проверка файлов игры...");
			boolean var2 = true;
			String var3 = class100.entry1004() + File.separator + "bin" + File.separator;
			if(!var0[1].equals(entry10(var3 + "minecraft.jar")))
			{
				var2 = false;
			}
			if(!var0[2].equals(entry10(var3 + "lwjgl.jar")))
			{
				var2 = false;
			}
			if(!var0[3].equals(entry10(var3 + "lwjgl_util.jar")))
			{
				var2 = false;
			}
			if(!var0[4].equals(entry10(var3 + "jinput.jar")))
			{
				var2 = false;
			}
			if(!entry0(var0) || !entry1(var0))
			{
				var2 = false;
			}
			if(var2)
			{
				class1033.entry0("GUARD: Проверка завершена успешно");
				return;
			}
			if(!var1 && !var2)
			{
				class1033.entry0("GUARD: Обнаружены посторонние объекты, игровой процесс будет прерван");
				if(class1045.entry0 != null)
				{
					class1045.entry0.stop();
					class1045.entry0.destroy();
				}
				System.exit(0);
			}
		}
	}
	
	public static final String entry1(String var0)
	{
		String var1 = null;
		try
		{
			MessageDigest var2 = MessageDigest.getInstance("SHA1");
			byte[] var3 = var2.digest(var0.getBytes());
			StringBuilder var4 = new StringBuilder();
			for(byte element : var3)
			{
				var4.append(Integer.toString((element & 255) + 256, 16).substring(1));
			}
			var1 = var4.toString();
		} catch(Exception var6)
		{
			var6.printStackTrace();
		}
		return var1;
	}
	
	public static final boolean entry1(String[] var0)
	{
		boolean var1 = true;
		String[] var2 = var0[13].split("<:m:>");
		String[] var3 = new String[var2.length];
		String[] var4 = new String[var2.length];
		if(!var0[13].equals("nocoremods"))
		{
			for(int var5 = 0; var5 < var2.length; ++var5)
			{
				var3[var5] = var2[var5].split("<:h:>")[0];
				var4[var5] = var2[var5].split("<:h:>")[1];
			}
		}
		class1033.entry0("GUARD: Проверка модификаций в папке \"coremods\"...");
		File var11 = new File(class100.entry1004() + File.separator + "coremods");
		String[] var6 = var11.list();
		if(var6 != null && var6.length != 0)
		{
			int var7;
			File var8;
			String var9;
			if(var0[13].equals("nocoremods"))
			{
				for(var7 = 0; var7 < var6.length; ++var7)
				{
					var8 = new File(var11 + File.separator + var6[var7]);
					class100.entry0(var8);
					var9 = "";
					if(!var8.exists())
					{
						var9 = "и удален ";
					}
					class1033.entry0("GUARD: Обнаружен " + var9 + "сторонний объект: " + var6[var7]);
					var1 = false;
				}
			} else
			{
				String[] var12 = var11.list(new class1006());
				for(String element : var12)
				{
					if(class100.entry0(var3, element) == -1)
					{
						File var14 = new File(var11 + File.separator + element);
						class100.entry0(var14);
						String var10 = "";
						if(!var14.exists())
						{
							var10 = "и удалена ";
						}
						class1033.entry0("GUARD: Обнаружена " + var10 + "сторонняя модификация: " + element);
						var1 = false;
					}
				}
			}
			for(var7 = 0; var7 < var3.length; ++var7)
			{
				var8 = new File(var11 + File.separator + var3[var7]);
				if(!var4[var7].equals(entry10(var8.toString())))
				{
					var8.delete();
					var9 = "";
					if(!var8.exists())
					{
						var9 = "и удален ";
					}
					class1033.entry0("GUARD: Обнаружен " + var9 + "файл подменённого мода: " + var3[var7]);
					var1 = false;
				}
			}
			return var1;
		} else return true;
	}
	
	public static final String entry10(String var0)
	{
		FileInputStream var1 = null;
		DigestInputStream var2 = null;
		BufferedInputStream var3 = null;
		Formatter var4 = null;
		String var6;
		try
		{
			MessageDigest var5 = MessageDigest.getInstance("MD5");
			var1 = new FileInputStream(var0);
			var3 = new BufferedInputStream(var1);
			var2 = new DigestInputStream(var3, var5);
			while(var2.read() != -1)
			{
				;
			}
			byte[] var33 = var5.digest();
			var4 = new Formatter();
			byte[] var7 = var33;
			int var8 = var33.length;
			for(int var9 = 0; var9 < var8; ++var9)
			{
				byte var10 = var7[var9];
				var4.format("%02x", new Object[] { Byte.valueOf(var10) });
			}
			String var34 = var4.toString();
			return var34;
		} catch(Exception var31)
		{
			var6 = "";
		} finally
		{
			try
			{
				var1.close();
			} catch(Exception var30)
			{
				;
			}
			try
			{
				var2.close();
			} catch(Exception var29)
			{
				;
			}
			try
			{
				var3.close();
			} catch(Exception var28)
			{
				;
			}
			try
			{
				var4.close();
			} catch(Exception var27)
			{
				;
			}
		}
		return var6;
	}
}
