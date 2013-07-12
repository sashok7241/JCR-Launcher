package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class class1043
{
	private int entry1003 = 0;
	public int entry0 = 0;
	public int entry1 = 0;
	public int entry10 = 0;
	public int entry100 = 0;
	public int entry1000 = 0;
	public BufferedImage entry1001;
	public String entry1002 = "";
	
	public final void entry0(BufferedImage var1, int var2, int var3, Color var4, Graphics var5)
	{
		entry1003 = 1;
		entry1001 = var1;
		entry0 = var2;
		entry1 = var3;
		entry10 = var1.getWidth();
		entry100 = var1.getHeight();
		this.entry0(var5, var4);
	}
	
	public final void entry0(BufferedImage var1, int var2, int var3, int var4, int var5, Color var6, Graphics var7)
	{
		entry1003 = 1;
		entry1001 = var1;
		entry0 = var2;
		entry1 = var3;
		entry10 = var4;
		entry100 = var5;
		this.entry0(var7, var6);
	}
	
	public final void entry0(Graphics var1, Color var2)
	{
		Graphics2D var3 = (Graphics2D) var1.create();
		var3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(entry1003 == 1)
		{
			var3.drawImage(entry1001, entry0, entry1, entry10, entry100, (ImageObserver) null);
		}
		if(entry1003 == 2)
		{
			var3.fillRoundRect(entry0, entry1, entry10, entry100, entry1000, entry1000);
		}
		var3.dispose();
	}
}
