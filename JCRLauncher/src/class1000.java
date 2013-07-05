import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class class1000
{
	private static byte[] entry0(byte[] var0) throws IOException
	{
		return entry0(var0, 0);
	}
	
	private static byte[] entry0(byte[] var0, int var1) throws IOException
	{
		ByteArrayInputStream var2 = new ByteArrayInputStream(var0);
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		try
		{
			entry0(var2, var3, var1);
		} finally
		{
			try
			{
				var2.close();
			} catch(Throwable var14)
			{
				;
			}
			try
			{
				var3.close();
			} catch(Throwable var13)
			{
				;
			}
		}
		return var3.toByteArray();
	}
	
	private static void entry0(InputStream var0, OutputStream var1) throws IOException
	{
		entry1(new class1005(var0), var1);
	}
	
	private static void entry0(InputStream var0, OutputStream var1, int var2) throws IOException
	{
		class1020 var3 = new class1020(var1, var2);
		entry1(var0, var3);
		var3.entry0();
	}
	
	public static final String entry0(String var0) throws IOException
	{
		byte[] var1 = var0.getBytes();
		byte[] var2 = entry0(var1);
		try
		{
			return new String(var2, "ASCII");
		} catch(UnsupportedEncodingException var4)
		{
			throw new RuntimeException("ASCII is not supported!", var4);
		}
	}
	
	private static byte[] entry1(byte[] var0)
	{
		ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
		ByteArrayOutputStream var2 = new ByteArrayOutputStream();
		try
		{
			entry0(var1, var2);
		} catch(IOException var11)
		{
			throw new RuntimeException("Unexpected I/O error", var11);
		} finally
		{
			try
			{
				var1.close();
			} catch(Throwable var10)
			{
				;
			}
		}
		return var2.toByteArray();
	}
	
	private static void entry1(InputStream var0, OutputStream var1) throws IOException
	{
		byte[] var2 = new byte[1024];
		int var3;
		while((var3 = var0.read(var2)) != -1)
		{
			var1.write(var2, 0, var3);
		}
	}
	
	public static final String entry1(String var0) throws UnsupportedEncodingException
	{
		try
		{
			byte[] var1 = entry1(var0.getBytes("ASCII"));
			return new String(var1);
		} catch(RuntimeException var2)
		{
			return "";
		}
	}
}
