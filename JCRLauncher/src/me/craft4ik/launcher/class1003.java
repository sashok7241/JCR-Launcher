package me.craft4ik.launcher;
final class class1003 extends Thread
{
	@Override public final void run()
	{
		try
		{
			String[] var1 = class100.entry1001();
			String var2 = class100.entry0(class100.entry10("jcr_status.php"), "?action=status&ip=" + var1[1] + "&port=" + var1[2], false);
			Frame.entry1001.entry1003.entry1003();
			if(var2 == null)
			{
				Frame.entry1("Ошибка подключения к серверу: " + var2);
				Frame.entry1001.entry0("Ошибка подключения", 2);
				Frame.entry1001.entry1003.entry0(false);
			} else if(var2.contains("<::>"))
			{
				String[] var3 = var2.split("<::>");
				if(new Integer(var3[0]).intValue() >= new Integer(var3[1]).intValue())
				{
					Frame.entry1001.entry0("Сервер полон " + var3[0] + " из " + var3[1], 3);
				} else
				{
					Frame.entry1001.entry0("Сервер онлайн " + var3[0] + " из " + var3[1], 1);
				}
				Frame.entry1001.entry1003.entry0(false);
			} else if(var2.trim().equals("OFF"))
			{
				Frame.entry1001.entry0("Сервер недоступен", 2);
				Frame.entry1001.entry1003.entry0(false);
			} else if(var2.trim().equals("TechWork"))
			{
				Frame.entry1001.entry0("Профилактика", 3);
				Frame.entry1001.entry1003.entry0(false);
			} else
			{
				Frame.entry1("Внутренняя ошибка");
				Frame.entry1001.entry0("Внутренняя ошибка", 2);
			}
		} catch(Exception var4)
		{
			var4.printStackTrace();
		}
	}
}
