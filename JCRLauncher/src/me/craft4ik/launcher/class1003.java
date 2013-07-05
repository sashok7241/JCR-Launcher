package me.craft4ik.launcher;

final class class1003 extends Thread
{
	@Override public final void run()
	{
		try
		{
			String[] var1 = LauncherUtils.entry1001();
			String var2 = LauncherUtils.execute(LauncherUtils.resolveScript("jcr_status.php"), "?action=status&ip=" + var1[1] + "&port=" + var1[2], false);
			LauncherAuthFrame.entry1001.entry1003.entry1003();
			if(var2 == null)
			{
				LauncherAuthFrame.error("Ошибка подключения к серверу: " + var2);
				LauncherAuthFrame.entry1001.entry0("Ошибка подключения", 2);
				LauncherAuthFrame.entry1001.entry1003.entry0(false);
			} else if(var2.contains("<::>"))
			{
				String[] var3 = var2.split("<::>");
				if(new Integer(var3[0]).intValue() >= new Integer(var3[1]).intValue())
				{
					LauncherAuthFrame.entry1001.entry0("Сервер полон " + var3[0] + " из " + var3[1], 3);
				} else
				{
					LauncherAuthFrame.entry1001.entry0("Сервер онлайн " + var3[0] + " из " + var3[1], 1);
				}
				LauncherAuthFrame.entry1001.entry1003.entry0(false);
			} else if(var2.trim().equals("OFF"))
			{
				LauncherAuthFrame.entry1001.entry0("Сервер недоступен", 2);
				LauncherAuthFrame.entry1001.entry1003.entry0(false);
			} else if(var2.trim().equals("TechWork"))
			{
				LauncherAuthFrame.entry1001.entry0("Профилактика", 3);
				LauncherAuthFrame.entry1001.entry1003.entry0(false);
			} else
			{
				LauncherAuthFrame.error("Внутренняя ошибка");
				LauncherAuthFrame.entry1001.entry0("Внутренняя ошибка", 2);
			}
		} catch(Exception var4)
		{
			var4.printStackTrace();
		}
	}
}
