package me.craft4ik.launcher;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class class10
{
	private File entry0;
	private Boolean entry1 = Boolean.valueOf(false);
	private String entry10 = null;
	private HashMap entry100;
	private InputStream entry1000 = null;
	
	public class10(String var1, String var2)
	{
		entry10 = var1;
		entry0 = new File(var2 + "/" + var1);
	}
	
	public final void entry0()
	{
		if(entry10 != null && !entry0.exists())
		{
			entry1001(entry10);
		}
		if(entry1000 != null && !entry0.exists())
		{
			this.entry0(entry1000);
		}
		if(entry1.booleanValue())
		{
			entry100 = this.entry1();
		}
	}
	
	private void entry0(File var1)
	{
		if(var1.exists())
		{
			var1.delete();
		}
	}
	
	private void entry0(HashMap var1)
	{
		try
		{
			this.entry0(entry0);
			entry0.createNewFile();
			BufferedWriter var2 = new BufferedWriter(new FileWriter(entry0));
			for(int var3 = 1; var3 <= var1.size(); ++var3)
			{
				String var4 = (String) var1.get(Integer.valueOf(var3));
				if(var4 == null)
				{
					var2.append("\n");
				} else
				{
					var2.append(var4);
					var2.append("\n");
				}
			}
			var2.flush();
			var2.close();
			if(entry1.booleanValue())
			{
				this.entry0();
			}
		} catch(Exception var5)
		{
			var5.printStackTrace();
		}
	}
	
	private void entry0(InputStream var1)
	{
		if(var1 != null)
		{
			FileOutputStream var2 = null;
			try
			{
				var2 = new FileOutputStream(entry0);
				byte[] var3 = new byte[8192];
				int var4;
				while((var4 = var1.read(var3)) > 0)
				{
					var2.write(var3, 0, var4);
				}
			} catch(Exception var17)
			{
				;
			} finally
			{
				try
				{
					var1.close();
				} catch(Exception var16)
				{
					;
				}
				try
				{
					if(var2 != null)
					{
						var2.close();
					}
				} catch(Exception var15)
				{
					;
				}
			}
		}
	}
	
	public final String entry0(String var1)
	{
		try
		{
			if(entry1.booleanValue()) return (String) entry100.get(var1);
			else
			{
				HashMap var2 = this.entry1();
				return (String) var2.get(var1);
			}
		} catch(Exception var3)
		{
			return null;
		}
	}
	
	public final void entry0(String var1, Object var2)
	{
		HashMap var3 = this.entry10();
		var3.put(Integer.valueOf(var3.size() + 1), var1 + ": " + var2.toString());
		this.entry0(var3);
	}
	
	private HashMap entry1()
	{
		HashMap var1 = new HashMap();
		BufferedReader var2 = null;
		try
		{
			var2 = new BufferedReader(new FileReader(entry0));
			String var3;
			while((var3 = var2.readLine()) != null)
			{
				if(!var3.isEmpty() && !var3.startsWith("#") && var3.contains(": "))
				{
					String[] var4 = var3.split(": ");
					if(var4.length < 2)
					{
						var1.put(var4[0], (Object) null);
					} else
					{
						var1.put(var4[0], var4[1]);
					}
				}
			}
		} catch(IOException var13)
		{
			;
		} finally
		{
			try
			{
				var2.close();
			} catch(Exception var12)
			{
				;
			}
		}
		return var1;
	}
	
	public final Integer entry1(String var1)
	{
		try
		{
			if(entry1.booleanValue()) return Integer.valueOf(Integer.parseInt((String) entry100.get(var1)));
			HashMap var2 = this.entry1();
			return Integer.valueOf(Integer.parseInt((String) var2.get(var1)));
		} catch(Exception var3)
		{
			return null;
		}
	}
	
	public final void entry1(String var1, Object var2)
	{
		HashMap var3 = this.entry10();
		if(var3 != null)
		{
			for(int var4 = 1; var4 <= var3.size(); ++var4)
			{
				if(var3.get(Integer.valueOf(var4)) != null)
				{
					String var5 = (String) var3.get(Integer.valueOf(var4));
					if(var5.startsWith(var1))
					{
						var5 = var5.replace(var1, "");
						if(var5.startsWith(": "))
						{
							var3.remove(Integer.valueOf(var4));
							var3.put(Integer.valueOf(var4), var1 + ": " + var2.toString());
						}
					}
				}
			}
			this.entry0(var3);
		}
	}
	
	private HashMap entry10()
	{
		HashMap var1 = new HashMap();
		BufferedReader var2 = null;
		Integer var3 = Integer.valueOf(1);
		try
		{
			var2 = new BufferedReader(new FileReader(entry0));
			String var4;
			while((var4 = var2.readLine()) != null)
			{
				if(var4.isEmpty())
				{
					var1.put(var3, (Object) null);
					var3 = Integer.valueOf(var3.intValue() + 1);
				} else
				{
					var1.put(var3, var4);
					var3 = Integer.valueOf(var3.intValue() + 1);
				}
			}
		} catch(Exception var15)
		{
			var15.printStackTrace();
		} finally
		{
			try
			{
				var2.close();
			} catch(Exception var14)
			{
				;
			}
		}
		return var1;
	}
	
	public final Boolean entry10(String var1)
	{
		try
		{
			String var2;
			if(entry1.booleanValue())
			{
				var2 = (String) entry100.get(var1);
			} else
			{
				HashMap var3 = this.entry1();
				var2 = (String) var3.get(var1);
			}
			return var2 != null && var2.equalsIgnoreCase("true") ? Boolean.valueOf(true) : Boolean.valueOf(false);
		} catch(Exception var4)
		{
			return null;
		}
	}
	
	public final Boolean entry100(String var1)
	{
		try
		{
			String var2;
			if(entry1.booleanValue())
			{
				var2 = (String) entry100.get(var1);
			} else
			{
				HashMap var3 = this.entry1();
				var2 = (String) var3.get(var1);
			}
			if(var2 != null) return Boolean.valueOf(true);
		} catch(Exception var4)
		{
			return Boolean.valueOf(false);
		}
		return Boolean.valueOf(false);
	}
	
	public final void entry1000(String var1)
	{
		HashMap var2 = this.entry10();
		if(var2 != null)
		{
			for(int var3 = 1; var3 <= var2.size(); ++var3)
			{
				if(var2.get(Integer.valueOf(var3)) != null)
				{
					String var4 = (String) var2.get(Integer.valueOf(var3));
					if(var4.startsWith(var1))
					{
						var4 = var4.replace(var1, "");
						if(var4.startsWith(": "))
						{
							var2.remove(Integer.valueOf(var3));
						}
					}
				}
			}
			this.entry0(var2);
		}
	}
	
	private void entry1001(String var1)
	{
		FileOutputStream var2 = null;
		try
		{
			entry0.getParentFile().mkdirs();
			var2 = new FileOutputStream(entry0);
			byte[] var3 = new byte[8192];
			int var4;
			while((var4 = entry1000.read(var3)) > 0)
			{
				var2.write(var3, 0, var4);
			}
		} catch(Exception var17)
		{
			;
		} finally
		{
			try
			{
				entry1000.close();
			} catch(Exception var16)
			{
				;
			}
			try
			{
				if(var2 != null)
				{
					var2.close();
				}
			} catch(Exception var15)
			{
				;
			}
		}
	}
}
