package me.craft4ik.launcher;

final class class1004 extends Thread
{
	@Override public final void run()
	{
		String var1 = LauncherGuard.entry10(LauncherGuard.getJarPath());
		if(!var1.isEmpty())
		{
			LauncherAuthFrame.entry10 = var1;
		}
	}
}
