package me.craft4ik.launcher;

import java.io.IOException;

final class class1001 extends Thread
{
	@Override public final void run()
	{
		Frame.log("Авторизация...");
		Frame.entry1001.entry1012.setEnabled(false);
		Frame.entry1001.entry1011.setEnabled(false);
		Frame.entry1001.entry1003.entry0(true);
		String var1 = class100.entry0(class100.entry10("jcr_auth.php"), "?action=auth&login=" + Frame.entry1001.entry1007.getText() + "&password=" + new String(Frame.entry1001.entry1008.getPassword()) + "&hash=" + Frame.entry10 + "&format=" + class100.entry101() + "&client=" + class100.entry1002() + "&code=" + class1014.entry1("89@vbs\'21R_BHq;05"), true);
		class100.entry0(1.0D);
		Frame.entry1001.entry1003.entry1003();
		if(var1 == null)
		{
			Frame.entry1001.entry0("Ошибка подключения", 2);
		} else if(!var1.trim().equals("BadParams") && !var1.toLowerCase().contains("error"))
		{
			if(var1.trim().equals("BadCode"))
			{
				Frame.entry1001.entry0("Внутренняя ошибка", 2);
				Frame.entry1("Неверный код доступа на web-сервер");
			} else if(var1.contains("<::>"))
			{
				Frame.entry0 = var1.replaceAll("<br>", "").split("<::>");
				try
				{
					class100.entry1006();
				} catch(IOException e)
				{
					e.printStackTrace();
				}
				Frame.entry1001.entry0("Вход выполнен успешно", 1);
				class100.entry0(1.0D);
				if(Frame.entry0[8].equals("true"))
				{
					class100.entry1007();
				} else
				{
					class1039.entry1005 = Frame.entry0[5].equals(class1014.entry1("v5.0"));
					if(class1039.entry1005)
					{
						Frame.entry1001.entry101.setText("Продолжить");
					}
					Frame.entry1001.entry0(3);
				}
				class1034.entry0(Frame.entry0);
				Frame.entry1001.entry1003.repaint();
			} else
			{
				Frame.entry1001.entry0("Неверный логин или пароль", 3);
			}
		} else
		{
			Frame.entry1001.entry0("Внутренняя ошибка", 2);
			Frame.entry1("Ошибка в переданных параметрах");
		}
		Frame.entry1001.entry1012.setEnabled(true);
		Frame.entry1001.entry1011.setEnabled(true);
	}
}
