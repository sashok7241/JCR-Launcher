package me.craft4ik.launcher;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class Launcher
{
	private static LauncherSplashFrame splashFrame;
	
	private static final void entry1000()
	{
		SwingUtilities.invokeLater(new class1052());
	}
	
	static final LauncherSplashFrame getFrame()
	{
		return splashFrame;
	}
	
	private static final void runImageLoading() throws InterruptedException
	{
		setState("загрузка изображений...");
		LauncherAuthFrame.setLookAndFeel();
		setState("запуск программы...");
	}
	
	private static final void runInitializer()
	{
		LauncherAuthFrame.log("Подготовка к запуску программы...");
		SwingUtilities.invokeLater(new LauncherRunnableInitializer());
	}
	
	static final LauncherSplashFrame setSplashFrame(LauncherSplashFrame frame)
	{
		splashFrame = frame;
		return frame;
	}
	
	private static final void setState(String state) throws InterruptedException
	{
		try
		{
			SwingUtilities.invokeAndWait(new LauncherRunnableSetState(state));
		} catch(InvocationTargetException var2)
		{
		}
	}
	
	public static final void start() throws InterruptedException
	{
		runInitializer();
		runImageLoading();
		entry1000();
	}
}
