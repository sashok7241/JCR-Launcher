package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JTextField;
import javax.swing.border.Border;

public class class1041 extends JTextField
{
	private static final long serialVersionUID = 1L;
	public LauncherAuthPanel entry0;
	public BufferedImage entry1;
	public int entry10 = 0;
	public int entry100 = 0;
	public int entry1000 = 0;
	public int entry1001 = 0;
	
	public class1041(int var1, int var2, int var3, int var4, Color var5) throws FontFormatException
	{
		setOpaque(false);
		setBorder((Border) null);
		setCaretColor(var5);
		setForeground(var5);
		setSelectionColor(new Color(51, 153, 255));
		setSelectedTextColor(Color.WHITE);
		setHorizontalAlignment(2);
		setFont(LauncherFontManager.createFont(18.0F, 1));
		this.setBounds(var1 + 16, var2, var3 - 32, var4);
		entry10 = var3 - 32;
		entry100 = var4;
		entry1000 = var1;
		entry1001 = var2;
		entry0 = new LauncherAuthPanel();
		entry0.entry0(var4, var2);
	}
	
	public class1041(int var1, int var2, int var3, int var4, String var5, int var6, Color var7) throws FontFormatException
	{
		setOpaque(false);
		setBorder((Border) null);
		setCaretColor(var7);
		setForeground(var7);
		setSelectionColor(new Color(51, 153, 255));
		setSelectedTextColor(Color.WHITE);
		setHorizontalAlignment(0);
		setFont(LauncherFontManager.createFont(12.0F, 1));
		this.setBounds(var1, var2, var3, var4);
		setDocument(new class1042(this, var6));
		setText(var5);
		entry1 = LauncherUtils.field;
		entry10 = var3;
		entry100 = var4;
		entry1000 = var1;
		entry1001 = var2;
	}
	
	@Override protected final void paintComponent(Graphics var1)
	{
		Graphics2D var2 = (Graphics2D) var1.create();
		var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(entry1 != null)
		{
			var2.drawImage(entry1, 0, 0, (ImageObserver) null);
		}
		var2.dispose();
		super.paintComponent(var1);
	}
}
