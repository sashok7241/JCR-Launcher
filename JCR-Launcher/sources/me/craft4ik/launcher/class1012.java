package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class class1012 implements ActionListener
{
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame var2 = LauncherAuthFrame.frame;
		var2.entry0(1);
		var2.savePassword.setSelected(class1019.entry1016[0]);
		var2.redownloadClient.setSelected(class1019.entry1016[1]);
		var2.fullscreen.setSelected(class1019.entry1016[2]);
		var2.offline.setSelected(class1019.entry1016[3]);
		var2.memory.setText(class1019.entry1017);
		class1019.entry1016 = null;
		class1019.entry1017 = "";
	}
}
