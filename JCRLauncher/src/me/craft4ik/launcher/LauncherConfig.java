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

public class LauncherConfig
{
	private File file;
	private Boolean useCached = Boolean.valueOf(false);
	private String filepath = null;
	private HashMap<String, Object> properties;
	private InputStream inputstream = null;
	
	public LauncherConfig(String name, String path)
	{
		filepath = name;
		file = new File(path + "/" + name);
	}
	
	private void copyStream(InputStream stream)
	{
		if(stream != null)
		{
			FileOutputStream output = null;
			try
			{
				output = new FileOutputStream(file);
				byte[] buffer = new byte[8192];
				int length;
				while((length = stream.read(buffer)) > 0)
				{
					output.write(buffer, 0, length);
				}
			} catch(Exception var17)
			{
			} finally
			{
				try
				{
					stream.close();
				} catch(Exception var16)
				{
				}
				try
				{
					if(output != null)
					{
						output.close();
					}
				} catch(Exception e)
				{
				}
			}
		}
	}
	
	private void delete(File file)
	{
		if(file.exists())
		{
			file.delete();
		}
	}
	
	public final void entry0(String var1, Object var2)
	{
		HashMap<Integer, Object> var3 = this.entry10();
		var3.put(Integer.valueOf(var3.size() + 1), var1 + ": " + var2.toString());
		writeMapToFile(var3);
	}
	
	public final Integer entry1(String var1)
	{
		try
		{
			if(useCached.booleanValue()) return Integer.valueOf(Integer.parseInt((String) properties.get(var1)));
			HashMap<String, Object> var2 = getMapFromFile();
			return Integer.valueOf(Integer.parseInt((String) var2.get(var1)));
		} catch(Exception var3)
		{
			return null;
		}
	}
	
	public final void entry1(String var1, Object var2)
	{
		HashMap<Integer, Object> var3 = this.entry10();
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
			writeMapToFile(var3);
		}
	}
	
	private HashMap<Integer, Object> entry10()
	{
		HashMap<Integer, Object> var1 = new HashMap<>();
		BufferedReader var2 = null;
		Integer var3 = Integer.valueOf(1);
		try
		{
			var2 = new BufferedReader(new FileReader(file));
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
			}
		}
		return var1;
	}
	
	public final Boolean entry10(String var1)
	{
		try
		{
			String var2;
			if(useCached.booleanValue())
			{
				var2 = (String) properties.get(var1);
			} else
			{
				HashMap<String, Object> var3 = getMapFromFile();
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
			if(useCached.booleanValue())
			{
				var2 = (String) properties.get(var1);
			} else
			{
				HashMap<String, Object> var3 = getMapFromFile();
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
		HashMap<Integer, Object> var2 = this.entry10();
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
			writeMapToFile(var2);
		}
	}
	
	public final String get(String key)
	{
		try
		{
			if(useCached.booleanValue()) return (String) properties.get(key);
			HashMap<String, Object> map = getMapFromFile();
			return (String) map.get(key);
		} catch(Exception var3)
		{
			return null;
		}
	}
	
	private HashMap<String, Object> getMapFromFile()
	{
		HashMap<String, Object> var1 = new HashMap<>();
		BufferedReader var2 = null;
		try
		{
			var2 = new BufferedReader(new FileReader(file));
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
		} finally
		{
			try
			{
				var2.close();
			} catch(Exception var12)
			{
			}
		}
		return var1;
	}
	
	public final void saveConfig()
	{
		if(filepath != null && !file.exists())
		{
			write();
		}
		if(inputstream != null && !file.exists())
		{
			copyStream(inputstream);
		}
		if(useCached.booleanValue())
		{
			properties = getMapFromFile();
		}
	}
	
	private void write()
	{
		FileOutputStream output = null;
		try
		{
			file.getParentFile().mkdirs();
			output = new FileOutputStream(file);
			byte[] buffer = new byte[8192];
			int length;
			while((length = inputstream.read(buffer)) > 0)
			{
				output.write(buffer, 0, length);
			}
		} catch(Exception e)
		{
		} finally
		{
			try
			{
				inputstream.close();
			} catch(Exception var16)
			{
			}
			try
			{
				if(output != null)
				{
					output.close();
				}
			} catch(Exception e)
			{
			}
		}
	}
	
	private void writeMapToFile(HashMap<Integer, Object> map)
	{
		try
		{
			delete(file);
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(int index = 1; index <= map.size(); ++index)
			{
				String var4 = (String) map.get(Integer.valueOf(index));
				if(var4 == null)
				{
					writer.append("\n");
				} else
				{
					writer.append(var4);
					writer.append("\n");
				}
			}
			writer.flush();
			writer.close();
			if(useCached.booleanValue())
			{
				saveConfig();
			}
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
