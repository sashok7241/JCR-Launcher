package me.craft4ik.launcher;

final class LauncherRunnableInitializer implements Runnable
{
	@Override public final void run()
	{
		Launcher.setSplashFrame(new LauncherSplashFrame());
		Launcher.getFrame().setVisible(true);
	}
}
