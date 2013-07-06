package me.craft4ik.launcher;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class class1026 implements MouseListener
{
	// $FF: synthetic field
	final LauncherAuthFrame entry0;
	
	class1026(LauncherAuthFrame var1)
	{
		entry0 = var1;
	}
	
	@Override public final void mouseClicked(MouseEvent var1)
	{
		if(!entry0.entry1004.entry100)
		{
			entry0.panel.entry1(true);
			if(entry0.entry1004.entry10() || var1.getButton() != 1) return;
			if(entry0.entry1004.entry1())
			{
				entry0.panel.entry0(true);
				class1008.entry1();
			}
			entry0.panel.entry1(false);
		}
	}
	
	@Override public final void mouseEntered(MouseEvent var1)
	{
	}
	
	@Override public final void mouseExited(MouseEvent var1)
	{
	}
	
	@Override public final void mousePressed(MouseEvent var1)
	{
	}
	
	@Override public final void mouseReleased(MouseEvent var1)
	{
	}
}
