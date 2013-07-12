package me.craft4ik.launcher;

final class LauncherRunnableSetState implements Runnable
{
	public final String state;
	
	public LauncherRunnableSetState(String value)
	{
		state = value;
	}
	
	@Override public final void run()
	{
		Launcher.getFrame().setState(state);
	}
}
