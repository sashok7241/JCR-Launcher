package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ButtonModel;
import javax.swing.JButton;

public class class1027 extends JButton
{
	private static final long serialVersionUID = 1L;
	public int entry0 = 0;
	public int entry1 = 0;
	public int entry10 = 0;
	public int entry100 = 0;
	public BufferedImage entry1000;
	public BufferedImage entry1001;
	public BufferedImage entry1002;
	public static BufferedImage entry1003 = LauncherUtils.entry1005.getSubimage(0, 0, 112, 38);
	public static BufferedImage entry1004 = LauncherUtils.entry1005.getSubimage(0, 38, 112, 38);
	public static BufferedImage entry1005 = LauncherUtils.entry1005.getSubimage(0, 76, 112, 38);
	public static BufferedImage entry1006 = LauncherUtils.entry1005.getSubimage(0, 114, 112, 38);
	
	public class1027(ImageUtils var1, String var2) throws FontFormatException
	{
		setText(var2);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setOpaque(false);
		setFocusable(false);
		setForeground(new Color(245, 245, 245));
		setFont(LauncherFontManager.createFont(13.0F, 1));
		setCursor(Cursor.getPredefinedCursor(12));
		this.setBounds(var1.entry10, var1.entry100, var1.entry0, var1.entry1);
		entry10 = var1.entry0;
		entry100 = var1.entry1;
		entry0 = var1.entry10;
		entry1 = var1.entry100;
		entry1000 = var1.entry1000;
		entry1001 = var1.entry1001;
		entry1002 = var1.entry1002;
	}
	
	public class1027(String var1, int var2, int var3, int var4, int var5) throws FontFormatException
	{
		setText(var1);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setOpaque(false);
		setFocusable(false);
		setForeground(new Color(245, 245, 245));
		setFont(LauncherFontManager.createFont(13.0F, 1));
		setCursor(Cursor.getPredefinedCursor(12));
		this.setBounds(var2, var3, var4, var5);
		entry10 = var4;
		entry100 = var5;
		entry0 = var2;
		entry1 = var3;
	}
	
	@Override public final void paintComponent(Graphics var1)
	{
		ButtonModel var2 = getModel();
		Graphics2D var3 = (Graphics2D) var1.create();
		var3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(entry1000 != null && entry1001 != null && entry1002 != null)
		{
			if(var2.isRollover() && isEnabled())
			{
				if(var2.isPressed())
				{
					var3.drawImage(entry1002, 0, 0, entry10, entry100, (ImageObserver) null);
				} else
				{
					var3.drawImage(entry1001, 0, 0, entry10, entry100, (ImageObserver) null);
				}
			} else
			{
				var3.drawImage(entry1000, 0, 0, entry10, entry100, (ImageObserver) null);
			}
		} else if(!isEnabled())
		{
			var3.drawImage(entry1006, 0, 0, entry10, entry100, (ImageObserver) null);
		} else if(var2.isRollover())
		{
			if(var2.isPressed())
			{
				var3.drawImage(entry1005, 0, 0, entry10, entry100, (ImageObserver) null);
			} else
			{
				var3.drawImage(entry1004, 0, 0, entry10, entry100, (ImageObserver) null);
			}
		} else
		{
			var3.drawImage(entry1003, 0, 0, entry10, entry100, (ImageObserver) null);
		}
		var3.dispose();
		super.paintComponent(var1);
	}
}
