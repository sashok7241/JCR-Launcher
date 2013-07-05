package me.craft4ik.launcher;
final class class1007 extends Thread
{
	@Override public final void run()
	{
		try
		{
			Frame.entry1001.entry1010.setEnabled(false);
			Frame.entry1001.entry1003.entry0(true, 382);
			Frame.entry1001.entry0("", 0);
			class100.entry0(1.0D);
			class100.entry1009();
		} catch(Exception var2)
		{
			Frame.entry1001.entry0("Ошибка при обновлении", 3, 391);
			Frame.entry1("Ошибка при обновлении программы");
			Frame.entry1001.entry1010.setEnabled(true);
			Frame.entry1001.entry1010.setText("Еще раз");
			Frame.entry1001.entry1003.entry0(false);
		}
	}
}
