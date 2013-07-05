package me.craft4ik.launcher;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class class1037 extends MouseAdapter
{
	// $FF: synthetic field
	final Frame entry0;
	
	class1037(Frame var1)
	{
		entry0 = var1;
	}
	
	@Override public final void mousePressed(MouseEvent var1)
	{
		Frame.entry0(entry0, var1.getX());
		Frame.entry1(entry0, var1.getY());
	}
}
