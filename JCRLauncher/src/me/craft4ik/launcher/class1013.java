package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class class1013 implements ActionListener
{
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame var2 = LauncherAuthFrame.entry1001;
		String var3 = var2.entry1019.getText();
		if(!class1019.entry1017.equals(var3))
		{
			int var4 = 0;
			try
			{
				var4 = new Integer(var3).intValue();
			} catch(Exception var6)
			{
				;
			}
			if(var4 >= 256)
			{
				LauncherUtils.entry0("memory", Integer.valueOf(var4));
				LauncherUtils.entry1010();
			} else
			{
				var2.entry1019.setText(class1019.entry1017);
				var2.entry0(1);
			}
		} else
		{
			var2.entry0(1);
		}
	}
}
