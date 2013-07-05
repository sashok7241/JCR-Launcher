package me.craft4ik.launcher;
final class class1030 implements Runnable
{
	// $FF: synthetic field
	final class1050 entry0;
	
	class1030(class1050 var1)
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
