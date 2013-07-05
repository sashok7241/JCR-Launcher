package me.craft4ik.launcher;

import java.io.UnsupportedEncodingException;

final class class1052 implements Runnable
{
	@Override public final void run()
	{
		try
		{
			LauncherAuthFrame.showLauncherFrame(Launcher.getFrame());
		} catch(UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}
}
