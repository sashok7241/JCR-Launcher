package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class class1025 implements ActionListener
{
	// $FF: synthetic field
	final LauncherAuthPanel entry0;
	
	class1025(LauncherAuthPanel var1)
	{
		entry0 = var1;
	}
	
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame.frame.buttonLaunch.setEnabled(false);
		if(LauncherAuthPanel.entry1004() == 0)
		{
			entry0.entry100.stop();
			LauncherAuthFrame.frame.newsScroller.setViewportView(LauncherAuthFrame.frame.newsPane);
			entry0.add(LauncherAuthFrame.frame.newsScroller);
			LauncherAuthFrame.frame.buttonLaunch.setEnabled(true);
			entry0.repaint();
		} else
		{
			LauncherAuthPanel.entry10(5);
			entry0.repaint();
		}
	}
}
