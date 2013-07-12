package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class class1046 implements ActionListener
{
	// $FF: synthetic field
	final class1045 entry0;
	
	class1046(class1045 var1)
	{
		entry0 = var1;
	}
	
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherGuard.entry0(LauncherAuthFrame.settings, false);
	}
}
