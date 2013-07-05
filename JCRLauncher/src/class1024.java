import java.util.ArrayList;

public class class1024
{
	public static final void entry0(String[] var0) throws InterruptedException
	{
		try
		{
			String var1 = class1014.entry0();
			int var2 = class100.entry1003("memory");
			if(var2 == 0)
			{
				var2 = 1024;
			}
			ArrayList var3 = new ArrayList();
			if(class100.entry1005() == 2)
			{
				var3.add("javaw");
			} else
			{
				var3.add("java");
			}
			var3.add("-Xmx" + var2 + "m");
			var3.add("-Xms" + var2 + "m");
			var3.add("-Dsun.java2d.noddraw=true");
			var3.add("-Dsun.java2d.d3d=false");
			var3.add("-Dsun.java2d.opengl=false");
			var3.add("-Dsun.java2d.pmoffscreen=false");
			var3.add("-classpath");
			var3.add(var1);
			var3.add("ru.er_log.Main");
			ProcessBuilder var4 = new ProcessBuilder(var3);
			Process var5 = var4.start();
			if(var5 == null) throw new Exception("Не удалось запустить программу!");
			System.exit(0);
		} catch(Exception var6)
		{
			var6.printStackTrace();
			Launcher.start();
		}
	}
}
