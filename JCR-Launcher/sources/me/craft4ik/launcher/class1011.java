package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class class1011 implements ActionListener
{
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame var2 = LauncherAuthFrame.frame;
		var2.entry0(2);
		class1019.entry1016 = new boolean[] { var2.savePassword.isSelected(), var2.redownloadClient.isSelected(), var2.fullscreen.isSelected(), var2.offline.isSelected() };
		class1019.entry1017 = var2.memory.getText();
	}
}
