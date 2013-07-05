package me.craft4ik.launcher;

public class class1008
{
	public static Thread entry0 = null;
	
	public static final void entry0()
	{
		entry0(entry0);
		entry0 = new class1001();
		entry0.setName("doLogin");
		entry0.start();
	}
	
	public static final void entry0(Thread var0)
	{
		if(var0 != null)
		{
			try
			{
				var0.join();
			} catch(InterruptedException var2)
			{
				Frame.log("Не удалось дождаться завершения потока: " + var0.getName());
			}
		}
	}
	
	public static final void entry1()
	{
		entry0(entry0);
		entry0 = new class1003();
		entry0.setName("getServerOnline");
		entry0.start();
	}
	
	public static final void entry10()
	{
		entry0(entry0);
		entry0 = new class1004();
		entry0.setName("setAppHash");
		entry0.start();
	}
	
	public static final void entry100()
	{
		entry0(entry0);
		entry0 = new class1007();
		entry0.setName("actionTakeUpdate");
		entry0.start();
	}
}
