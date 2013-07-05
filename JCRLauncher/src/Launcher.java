import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class Launcher
{
	private static class1050 entry0;
	
	public static final void start() throws InterruptedException
	{
		entry10();
		entry100();
		entry1000();
	}
	
	// $FF: synthetic method
	static final class1050 entry0(class1050 var0)
	{
		entry0 = var0;
		return var0;
	}
	
	private static final void entry0(String var0) throws InterruptedException
	{
		try
		{
			SwingUtilities.invokeAndWait(new class1049(var0));
		} catch(InvocationTargetException var2)
		{
			;
		}
	}
	
	// $FF: synthetic method
	static final class1050 entry1()
	{
		return entry0;
	}
	
	private static final void entry10()
	{
		class1033.entry0("Подготовка к запуску программы...");
		SwingUtilities.invokeLater(new class105());
	}
	
	private static final void entry100() throws InterruptedException
	{
		entry0("загрузка изображений...");
		class1033.entry0();
		entry0("запуск программы...");
	}
	
	private static final void entry1000()
	{
		SwingUtilities.invokeLater(new class1052());
	}
}
