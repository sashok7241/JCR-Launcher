package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class class1025 implements ActionListener
{
	// $FF: synthetic field
	final class1039 entry0;
	
	class1025(class1039 var1)
	{
		entry0 = var1;
	}
	
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame.frame.buttonLaunch.setEnabled(false);
		if(class1039.entry1004() == 0)
		{
			entry0.entry100.stop();
			LauncherAuthFrame.frame.newsScroller.setViewportView(LauncherAuthFrame.frame.newsPane);
			entry0.add(LauncherAuthFrame.frame.newsScroller);
			LauncherAuthFrame.frame.buttonLaunch.setEnabled(true);
			entry0.repaint();
		} else
		{
			class1039.entry10(5);
			entry0.repaint();
		}
	}
}
