package me.craft4ik.launcher;

final class class1007 extends Thread
{
	@Override public final void run()
	{
		try
		{
			LauncherAuthFrame.entry1001.entry1010.setEnabled(false);
			LauncherAuthFrame.entry1001.entry1003.entry0(true, 382);
			LauncherAuthFrame.entry1001.entry0("", 0);
			LauncherUtils.entry0(1.0D);
			LauncherUtils.entry1009();
		} catch(Exception var2)
		{
			LauncherAuthFrame.entry1001.entry0("Ошибка при обновлении", 3, 391);
			LauncherAuthFrame.error("Ошибка при обновлении программы");
			LauncherAuthFrame.entry1001.entry1010.setEnabled(true);
			LauncherAuthFrame.entry1001.entry1010.setText("Еще раз");
			LauncherAuthFrame.entry1001.entry1003.entry0(false);
		}
	}
}
