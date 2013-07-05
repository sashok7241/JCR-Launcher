package me.craft4ik.launcher;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class class1037 extends MouseAdapter
{
	// $FF: synthetic field
	final LauncherAuthFrame entry0;
	
	class1037(LauncherAuthFrame var1)
	{
		entry0 = var1;
	}
	
	@Override public final void mousePressed(MouseEvent var1)
	{
		LauncherAuthFrame.entry0(entry0, var1.getX());
		LauncherAuthFrame.entry1(entry0, var1.getY());
	}
}
