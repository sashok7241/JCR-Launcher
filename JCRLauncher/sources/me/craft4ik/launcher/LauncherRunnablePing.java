package me.craft4ik.launcher;

final class LauncherRunnablePing extends Thread
{
	@Override public final void run()
	{
		try
		{
			String[] server = LauncherUtils.getSelectedServer();
			String result = LauncherUtils.execute(LauncherUtils.resolveScript("jcr_status.php"), "?action=status&ip=" + server[1] + "&port=" + server[2], false);
			LauncherAuthFrame.frame.panel.entry1003();
			if(result == null)
			{
				LauncherAuthFrame.error("Ошибка подключения к серверу: " + result);
				LauncherAuthFrame.frame.setState("Ошибка подключения", 2);
				LauncherAuthFrame.frame.panel.entry0(false);
			} else if(result.contains("<::>"))
			{
				String[] var3 = result.split("<::>");
				if(new Integer(var3[0]).intValue() >= new Integer(var3[1]).intValue())
				{
					LauncherAuthFrame.frame.setState("Сервер полон " + var3[0] + " из " + var3[1], 3);
				} else
				{
					LauncherAuthFrame.frame.setState("Сервер онлайн " + var3[0] + " из " + var3[1], 1);
				}
				LauncherAuthFrame.frame.panel.entry0(false);
			} else if(result.trim().equals("OFF"))
			{
				LauncherAuthFrame.frame.setState("Сервер недоступен", 2);
				LauncherAuthFrame.frame.panel.entry0(false);
			} else if(result.trim().equals("TechWork"))
			{
				LauncherAuthFrame.frame.setState("Профилактика", 3);
				LauncherAuthFrame.frame.panel.entry0(false);
			} else
			{
				LauncherAuthFrame.error("Внутренняя ошибка");
				LauncherAuthFrame.frame.setState("Внутренняя ошибка", 2);
			}
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}