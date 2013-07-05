package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.net.URL;

public class class1034
{
	public static BufferedImage entry0;
	public static BufferedImage entry1;
	
	public static final BufferedImage entry0(BufferedImage var0, int var1)
	{
		if(var0 == null)
		{
			var0 = class100.entry1015;
		}
		int var2 = var0.getWidth() / 64;
		int var3 = var0.getHeight() / 32;
		BufferedImage var4 = new BufferedImage(16 * var1, 32 * var1 + var1, 2);
		Graphics var5 = var4.getGraphics();
		var5.drawImage(var0.getSubimage(var2 * 8, var3 * 8, var2 * 8, var3 * 8), 4 * var1, var1, 8 * var1, 8 * var1, (ImageObserver) null);
		var5.drawImage(var0.getSubimage(var2 * 20, var3 * 20, var2 * 8, var3 * 12), 4 * var1, 8 * var1 + var1, 8 * var1, 12 * var1, (ImageObserver) null);
		var5.drawImage(var0.getSubimage(var2 * 44, var3 * 20, var2 * 4, var3 * 12), 0, 8 * var1 + var1, 4 * var1, 12 * var1, (ImageObserver) null);
		var5.drawImage(ImageUtils.flipVertical(var0.getSubimage(var2 * 44, var3 * 20, var2 * 4, var3 * 12)), 12 * var1, 8 * var1 + var1, 4 * var1, 12 * var1, (ImageObserver) null);
		var5.drawImage(var0.getSubimage(var2 * 4, var3 * 20, var2 * 4, var3 * 12), 4 * var1, 20 * var1 + var1, 4 * var1, 12 * var1, (ImageObserver) null);
		var5.drawImage(ImageUtils.flipVertical(var0.getSubimage(var2 * 4, var3 * 20, var2 * 4, var3 * 12)), 8 * var1, 20 * var1 + var1, 4 * var1, 12 * var1, (ImageObserver) null);
		var5.drawImage(var0.getSubimage(var2 * 40, var3 * 8, var2 * 8, var3 * 8), 3 * var1, 0, 10 * var1, 10 * var1, (ImageObserver) null);
		return var4;
	}
	
	public static final void entry0(Graphics2D var0) throws FontFormatException
	{
		var0.drawImage(ImageUtils.genPanel(104, 189, class100.entry1011), 65, 65, (ImageObserver) null);
		var0.drawImage(ImageUtils.genPanel(74, 104, class100.entry1011), 207, 65, (ImageObserver) null);
		var0.setColor(new Color(245, 245, 245, class1039.entry0(40)));
		var0.setFont(class1009.entry0(13.0F, 1));
		var0.drawString("Плащ не", 219, 113);
		var0.drawString("куплен", 224, 129);
		var0.drawImage(entry0(entry0, 5), 77, 77, (ImageObserver) null);
		var0.drawImage(entry1(entry1, 5), 219, 77, (ImageObserver) null);
	}
	
	public static final void entry0(String[] var0)
	{
		try
		{
			entry0 = ImageUtils.load(new URL(class100.entry100("skins/") + var0[11]), false);
			entry1 = ImageUtils.load(new URL(class100.entry100("cloaks/") + var0[12]), false);
		} catch(Exception var2)
		{
			;
		}
	}
	
	public static final BufferedImage entry1(BufferedImage var0, int var1)
	{
		if(var0 == null) return null;
		else
		{
			BufferedImage var2 = new BufferedImage(22 * var1, 17 * var1, 2);
			int var3 = var0.getWidth();
			int var4 = var0.getHeight();
			if(var0.getWidth() % 64 == 0 && var0.getHeight() % 32 == 0)
			{
				var3 /= 64;
				var4 /= 32;
			} else
			{
				var3 /= 22;
				var4 /= 17;
			}
			var2.getGraphics().drawImage(var0.getSubimage(var3, var4, var3 * 10, var4 * 16), 0, 0, 10 * var1, 16 * var1, (ImageObserver) null);
			return var2;
		}
	}
}
