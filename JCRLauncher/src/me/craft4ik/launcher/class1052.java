package me.craft4ik.launcher;

import java.io.UnsupportedEncodingException;

final class class1052 implements Runnable
{
	@Override public final void run()
	{
		try
		{
			Frame.entry0(Launcher.getFrame());
		} catch(UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}
}
