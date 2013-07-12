package me.craft4ik.launcher;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class class1047 implements WindowListener
{
	// $FF: synthetic field
	final class1045 entry0;
	
	class1047(class1045 var1)
	{
		entry0 = var1;
	}
	
	@Override public final void windowActivated(WindowEvent var1)
	{
	}
	
	@Override public final void windowClosed(WindowEvent var1)
	{
	}
	
	@Override public final void windowClosing(WindowEvent var1)
	{
		class1045.entry0.stop();
		class1045.entry0.destroy();
		System.exit(0);
	}
	
	@Override public final void windowDeactivated(WindowEvent var1)
	{
	}
	
	@Override public final void windowDeiconified(WindowEvent var1)
	{
	}
	
	@Override public final void windowIconified(WindowEvent var1)
	{
	}
	
	@Override public final void windowOpened(WindowEvent var1)
	{
	}
}
