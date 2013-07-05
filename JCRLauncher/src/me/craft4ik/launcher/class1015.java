package me.craft4ik.launcher;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class class1015 implements ActionListener
{
	@Override public final void actionPerformed(ActionEvent var1)
	{
		Frame.entry1001.entry1003.entry1003();
		if(!Frame.entry1001.entry1007.getText().equals("Логин") && !new String(Frame.entry1001.entry1008.getPassword()).equals("Пароль"))
		{
			class1008.entry0();
		} else
		{
			Frame.entry1001.entry0("Неверный логин или пароль", 3);
		}
	}
}
