package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

public class LauncherSplashPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	public static final BufferedImage splash = LauncherUtils.loadLocalImage(LauncherUtils.getSettings().getSplashImage());
	public static String state = "";
	
	public LauncherSplashPanel()
	{
		setLayout((LayoutManager) null);
		setFocusable(false);
	}
	
	@Override public final void paintComponent(Graphics output)
	{
		Graphics2D graphics = (Graphics2D) output;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.drawImage(splash, 0, 0, getWidth(), getHeight(), (ImageObserver) null);
		graphics.setColor(new Color(245, 245, 245));
		try
		{
			graphics.setFont(LauncherFontManager.createFont(12.0F, 1));
		} catch(FontFormatException e)
		{
			e.printStackTrace();
		}
		graphics.drawString(state, 30, 172);
	}
}
