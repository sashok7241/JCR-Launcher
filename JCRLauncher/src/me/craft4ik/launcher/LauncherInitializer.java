package me.craft4ik.launcher;

final class LauncherInitializer implements Runnable
{
	@Override public final void run()
	{
		Launcher.entry0(new LauncherFrame());
		Launcher.getFrame().setVisible(true);
	}
}
