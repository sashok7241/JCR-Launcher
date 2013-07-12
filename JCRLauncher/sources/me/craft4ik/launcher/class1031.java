package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class class1031 implements ActionListener
{
	// $FF: synthetic field
	final LauncherAuthPanel entry0;
	
	class1031(LauncherAuthPanel var1)
	{
		entry0 = var1;
	}
	
	@Override public final void actionPerformed(ActionEvent var1)
	{
		if(LauncherAuthPanel.entry0(entry0) == 72)
		{
			LauncherAuthPanel.entry0(entry0, 0);
		} else if(LauncherAuthPanel.entry0(entry0) == 36 && LauncherAuthPanel.entry0(entry0) != 0 && LauncherAuthPanel.entry0(entry0) != 72)
		{
			LauncherAuthPanel.entry0(entry0, 72);
		} else if(LauncherAuthPanel.entry0(entry0) == 0)
		{
			LauncherAuthPanel.entry0(entry0, 36);
		}
		entry0.repaint();
	}
}
