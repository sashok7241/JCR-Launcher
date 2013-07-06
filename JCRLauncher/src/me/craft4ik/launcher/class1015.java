package me.craft4ik.launcher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class class1015 implements ActionListener
{
	@Override public final void actionPerformed(ActionEvent var1)
	{
		LauncherAuthFrame.frame.entry1003.entry1003();
		if(!LauncherAuthFrame.frame.login.getText().equals("Логин") && !new String(LauncherAuthFrame.frame.password.getPassword()).equals("Пароль"))
		{
			class1008.entry0();
		} else
		{
			LauncherAuthFrame.frame.setState("Неверный логин или пароль", 3);
		}
	}
}
