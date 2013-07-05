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

public class class1051 extends JPanel
{
	private static final long serialVersionUID = 1L;
	public static String entry0 = "";
	public static final BufferedImage entry1 = class100.loadLocalImage(class100.getSettings().getSplashImage());
	
	public class1051()
	{
		setLayout((LayoutManager) null);
		setFocusable(false);
	}
	
	@Override public final void paintComponent(Graphics var1)
	{
		Graphics2D var2 = (Graphics2D) var1;
		var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		var2.drawImage(entry1, 0, 0, getWidth(), getHeight(), (ImageObserver) null);
		var2.setColor(new Color(245, 245, 245));
		try
		{
			var2.setFont(class1009.entry0(12.0F, 1));
		} catch(FontFormatException e)
		{
			e.printStackTrace();
		}
		var2.drawString(entry0, 30, 172);
	}
}
