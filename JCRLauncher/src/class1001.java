import java.io.IOException;

final class class1001 extends Thread
{
	@Override public final void run()
	{
		class1033.entry0("Авторизация...");
		class1033.entry1001.entry1012.setEnabled(false);
		class1033.entry1001.entry1011.setEnabled(false);
		class1033.entry1001.entry1003.entry0(true);
		String var1 = class100.entry0(class100.entry10("jcr_auth.php"), "?action=auth&login=" + class1033.entry1001.entry1007.getText() + "&password=" + new String(class1033.entry1001.entry1008.getPassword()) + "&hash=" + class1033.entry10 + "&format=" + class100.entry101() + "&client=" + class100.entry1002() + "&code=" + class1014.entry1("89@vbs\'21R_BHq;05"), true);
		class100.entry0(1.0D);
		class1033.entry1001.entry1003.entry1003();
		if(var1 == null)
		{
			class1033.entry1001.entry0("Ошибка подключения", 2);
		} else if(!var1.trim().equals("BadParams") && !var1.toLowerCase().contains("error"))
		{
			if(var1.trim().equals("BadCode"))
			{
				class1033.entry1001.entry0("Внутренняя ошибка", 2);
				class1033.entry1("Неверный код доступа на web-сервер");
			} else if(var1.contains("<::>"))
			{
				class1033.entry0 = var1.replaceAll("<br>", "").split("<::>");
				try
				{
					class100.entry1006();
				} catch(IOException e)
				{
					e.printStackTrace();
				}
				class1033.entry1001.entry0("Вход выполнен успешно", 1);
				class100.entry0(1.0D);
				if(class1033.entry0[8].equals("true"))
				{
					class100.entry1007();
				} else
				{
					class1039.entry1005 = class1033.entry0[5].equals(class1014.entry1("v5.0"));
					if(class1039.entry1005)
					{
						class1033.entry1001.entry101.setText("Продолжить");
					}
					class1033.entry1001.entry0(3);
				}
				class1034.entry0(class1033.entry0);
				class1033.entry1001.entry1003.repaint();
			} else
			{
				class1033.entry1001.entry0("Неверный логин или пароль", 3);
			}
		} else
		{
			class1033.entry1001.entry0("Внутренняя ошибка", 2);
			class1033.entry1("Ошибка в переданных параметрах");
		}
		class1033.entry1001.entry1012.setEnabled(true);
		class1033.entry1001.entry1011.setEnabled(true);
	}
}
