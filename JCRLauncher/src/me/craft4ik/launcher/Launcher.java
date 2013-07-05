package me.craft4ik.launcher;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class Launcher
{
	private static LauncherFrame entry0;
	
	static final LauncherFrame entry0(LauncherFrame var0)
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
	
	private static final void entry10()
	{
		Frame.log("Подготовка к запуску программы...");
		SwingUtilities.invokeLater(new LauncherInitializer());
	}
	
	private static final void entry100() throws InterruptedException
	{
		entry0("загрузка изображений...");
		Frame.entry0();
		entry0("запуск программы...");
	}
	
	private static final void entry1000()
	{
		SwingUtilities.invokeLater(new class1052());
	}
	
	// $FF: synthetic method
	static final LauncherFrame getFrame()
	{
		return entry0;
	}
	
	public static final void start() throws InterruptedException
	{
		entry10();
		entry100();
		entry1000();
	}
}
