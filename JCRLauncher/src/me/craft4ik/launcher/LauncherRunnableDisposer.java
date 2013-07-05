package me.craft4ik.launcher;

final class LauncherRunnableDisposer implements Runnable
{
	public final LauncherSplashFrame frame;
	
	public LauncherRunnableDisposer(LauncherSplashFrame var1)
	{
		frame = var1;
	}
	
	@Override public final void run()
	{
		if(frame != null)
		{
			frame.dispose();
		}
	}
}
