package me.craft4ik.launcher;

final class class1007 extends Thread
{
	@Override public final void run()
	{
		try
		{
			LauncherAuthFrame.frame.buttonRefresh.setEnabled(false);
			LauncherAuthFrame.frame.entry1003.entry0(true, 382);
			LauncherAuthFrame.frame.setState("", 0);
			LauncherUtils.sleep(1.0D);
			LauncherUtils.entry1009();
		} catch(Exception var2)
		{
			LauncherAuthFrame.frame.entry0("Ошибка при обновлении", 3, 391);
			LauncherAuthFrame.error("Ошибка при обновлении программы");
			LauncherAuthFrame.frame.buttonRefresh.setEnabled(true);
			LauncherAuthFrame.frame.buttonRefresh.setText("Еще раз");
			LauncherAuthFrame.frame.entry1003.entry0(false);
		}
	}
}
