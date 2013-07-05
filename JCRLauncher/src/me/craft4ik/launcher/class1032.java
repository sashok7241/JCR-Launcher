package me.craft4ik.launcher;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class class1032 extends MouseMotionAdapter
{
	// $FF: synthetic field
	final Frame entry0;
	
	class1032(Frame var1)
	{
		entry0 = var1;
	}
	
	@Override public final void mouseDragged(MouseEvent var1)
	{
		entry0.setLocation(entry0.getX() + var1.getX() - Frame.entry0(entry0), entry0.getY() + var1.getY() - Frame.entry1(entry0));
	}
}
