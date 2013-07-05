package me.craft4ik.launcher;

final class class1030 implements Runnable
{
	// $FF: synthetic field
	final LauncherFrame entry0;
	
	class1030(LauncherFrame var1)
	{
		entry0 = var1;
	}
	
	@Override public final void run()
	{
		if(entry0 != null)
		{
			entry0.dispose();
		}
	}
}
