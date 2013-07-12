package me.craft4ik.launcher;

import java.io.IOException;
import java.io.OutputStream;

public class class1020 extends OutputStream
{
	public OutputStream entry0 = null;
	public int entry1 = 0;
	public int entry10 = 0;
	public static String entry100 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
	public static char entry1000 = 61;
	public int entry1001 = 0;
	public int entry1002 = 0;
	
	public class1020(OutputStream var1, int var2)
	{
		entry0 = var1;
		entry1002 = var2;
	}
	
	@Override public final void close() throws IOException
	{
		entry0();
		entry0.close();
	}
	
	public final void entry0() throws IOException
	{
		if(entry10 > 0)
		{
			if(entry1002 > 0 && entry1001 == entry1002)
			{
				entry0.write("\r\n".getBytes());
				entry1001 = 0;
			}
			char var1 = entry100.charAt(entry1 << 8 >>> 26);
			char var2 = entry100.charAt(entry1 << 14 >>> 26);
			char var3 = entry10 < 2 ? entry1000 : entry100.charAt(entry1 << 20 >>> 26);
			char var4 = entry10 < 3 ? entry1000 : entry100.charAt(entry1 << 26 >>> 26);
			entry0.write(var1);
			entry0.write(var2);
			entry0.write(var3);
			entry0.write(var4);
			entry1001 += 4;
			entry10 = 0;
			entry1 = 0;
		}
	}
	
	@Override public final void write(int var1) throws IOException
	{
		int var2 = (var1 & 255) << 16 - entry10 * 8;
		entry1 |= var2;
		++entry10;
		if(entry10 == 3)
		{
			entry0();
		}
	}
}
