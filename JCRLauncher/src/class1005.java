import java.io.IOException;
import java.io.InputStream;

public class class1005 extends InputStream
{
	public InputStream entry0;
	public int[] entry1;
	public int entry10 = 0;
	public boolean entry100 = false;
	public static String entry1000 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
	public static char entry1001 = 61;
	
	public class1005(InputStream var1)
	{
		entry0 = var1;
	}
	
	@Override public final void close() throws IOException
	{
		entry0.close();
	}
	
	public final void entry0() throws IOException
	{
		char[] var1 = new char[4];
		int var2 = 0;
		do
		{
			int var3 = entry0.read();
			if(var3 == -1)
			{
				if(var2 != 0) throw new IOException("Bad base64 stream");
				entry1 = new int[0];
				entry100 = true;
				return;
			}
			char var4 = (char) var3;
			if(entry1000.indexOf(var4) == -1 && var4 != entry1001)
			{
				if(var4 != 13 && var4 != 10) throw new IOException("Bad base64 stream");
			} else
			{
				var1[var2++] = var4;
			}
		} while(var2 < 4);
		boolean var6 = false;
		for(var2 = 0; var2 < 4; ++var2)
		{
			if(var1[var2] != entry1001)
			{
				if(var6) throw new IOException("Bad base64 stream");
			} else if(!var6)
			{
				var6 = true;
			}
		}
		byte var7;
		if(var1[3] == entry1001)
		{
			if(entry0.read() != -1) throw new IOException("Bad base64 stream");
			entry100 = true;
			if(var1[2] == entry1001)
			{
				var7 = 1;
			} else
			{
				var7 = 2;
			}
		} else
		{
			var7 = 3;
		}
		int var5 = 0;
		for(var2 = 0; var2 < 4; ++var2)
		{
			if(var1[var2] != entry1001)
			{
				var5 |= entry1000.indexOf(var1[var2]) << 6 * (3 - var2);
			}
		}
		entry1 = new int[var7];
		for(var2 = 0; var2 < var7; ++var2)
		{
			entry1[var2] = var5 >>> 8 * (2 - var2) & 255;
		}
	}
	
	@Override public final int read() throws IOException
	{
		if(entry1 == null || entry10 == entry1.length)
		{
			if(entry100) return -1;
			entry0();
			if(entry1.length == 0)
			{
				entry1 = null;
				return -1;
			}
			entry10 = 0;
		}
		return entry1[entry10++];
	}
}
