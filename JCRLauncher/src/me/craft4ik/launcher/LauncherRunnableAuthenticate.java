package me.craft4ik.launcher;

import java.io.IOException;

final class LauncherRunnableAuthenticate extends Thread
{
	@Override public final void run()
	{
		LauncherAuthFrame.log("Авторизация...");
		LauncherAuthFrame.frame.buttonSettings.setEnabled(false);
		LauncherAuthFrame.frame.buttonLaunch2.setEnabled(false);
		LauncherAuthFrame.frame.entry1003.entry0(true);
		String var1 = LauncherUtils.execute(LauncherUtils.resolveScript("jcr_auth.php"), "?action=auth&login=" + LauncherAuthFrame.frame.login.getText() + "&password=" + new String(LauncherAuthFrame.frame.password.getPassword()) + "&hash=" + LauncherAuthFrame.entry10 + "&format=" + LauncherUtils.resolveExtension() + "&client=" + LauncherUtils.resolveClient() + "&code=" + LauncherGuard.entry1("89@vbs\'21R_BHq;05"), true);
		LauncherUtils.sleep(1.0D);
		LauncherAuthFrame.frame.entry1003.entry1003();
		if(var1 == null)
		{
			LauncherAuthFrame.frame.entry0("Ошибка подключения", 2);
		} else if(!var1.trim().equals("BadParams") && !var1.toLowerCase().contains("error"))
		{
			if(var1.trim().equals("BadCode"))
			{
				LauncherAuthFrame.frame.entry0("Внутренняя ошибка", 2);
				LauncherAuthFrame.error("Неверный код доступа на web-сервер");
			} else if(var1.contains("<::>"))
			{
				LauncherAuthFrame.settings = var1.replaceAll("<br>", "").split("<::>");
				try
				{
					LauncherUtils.entry1006();
				} catch(IOException e)
				{
					e.printStackTrace();
				}
				LauncherAuthFrame.frame.entry0("Вход выполнен успешно", 1);
				LauncherUtils.sleep(1.0D);
				if(LauncherAuthFrame.settings[8].equals("true"))
				{
					LauncherUtils.entry1007();
				} else
				{
					class1039.entry1005 = LauncherAuthFrame.settings[5].equals(LauncherGuard.entry1("v5.0"));
					if(class1039.entry1005)
					{
						LauncherAuthFrame.frame.buttonExit.setText("Продолжить");
					}
					LauncherAuthFrame.frame.entry0(3);
				}
				class1034.entry0(LauncherAuthFrame.settings);
				LauncherAuthFrame.frame.entry1003.repaint();
			} else
			{
				LauncherAuthFrame.frame.entry0("Неверный логин или пароль", 3);
			}
		} else
		{
			LauncherAuthFrame.frame.entry0("Внутренняя ошибка", 2);
			LauncherAuthFrame.error("Ошибка в переданных параметрах");
		}
		LauncherAuthFrame.frame.buttonSettings.setEnabled(true);
		LauncherAuthFrame.frame.buttonLaunch2.setEnabled(true);
	}
}
