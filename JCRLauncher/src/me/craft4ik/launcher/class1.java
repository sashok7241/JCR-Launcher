package me.craft4ik.launcher;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class class1
{
	public int entry0 = 0;
	public int entry1 = 0;
	public int entry10 = 0;
	public int entry100 = 0;
	public BufferedImage entry1000;
	public BufferedImage entry1001;
	public BufferedImage entry1002;
	
	public class1(int var1, int var2, int var3, int var4, int var5, int var6, BufferedImage var7)
	{
		entry0 = var3;
		entry1 = var4;
		entry10 = var1;
		entry100 = var2;
		entry1000 = var7.getSubimage(var5, var6, var3, var4);
	}
	
	public class1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, BufferedImage var11)
	{
		entry0 = var3;
		entry1 = var4;
		entry10 = var1;
		entry100 = var2;
		entry1000 = var11.getSubimage(var5, var6, var3, var4);
		entry1001 = var11.getSubimage(var7, var8, var3, var4);
		entry1002 = var11.getSubimage(var9, var10, var3, var4);
	}
	
	public static final BufferedImage entry0(BufferedImage var0)
	{
		AffineTransform var1 = AffineTransform.getScaleInstance(-1.0D, 1.0D);
		var1.translate(-var0.getWidth(), 0.0D);
		AffineTransformOp var2 = new AffineTransformOp(var1, 1);
		return var2.filter(var0, (BufferedImage) null);
	}
	
	public static final BufferedImage entry0(BufferedImage var0, int var1, int var2)
	{
		int var3 = var0.getWidth();
		int var4 = var0.getHeight();
		BufferedImage var5 = new BufferedImage(var1, var2, 2);
		for(int var6 = 0; var6 <= var1 / var3; ++var6)
		{
			for(int var7 = 0; var7 <= var2 / var4; ++var7)
			{
				var5.getGraphics().drawImage(var0, var6 * var3, var7 * var4, (ImageObserver) null);
			}
		}
		return var5;
	}
	
	public static final BufferedImage entry0(int var0, int var1, BufferedImage var2)
	{
		int var3 = var2.getWidth() / 3;
		int var4 = var2.getHeight() / 3;
		BufferedImage var5 = new BufferedImage(var0, var1, 2);
		BufferedImage var6 = var2.getSubimage(0, 0, var3, var4);
		BufferedImage var7 = var2.getSubimage(var3, 0, var3, var4);
		BufferedImage var8 = var2.getSubimage(var3 * 2, 0, var3, var4);
		BufferedImage var9 = var2.getSubimage(0, var4, var3, var4);
		BufferedImage var10 = var2.getSubimage(var3, var4, var3, var4);
		BufferedImage var11 = var2.getSubimage(var3 * 2, var4, var3, var4);
		BufferedImage var12 = var2.getSubimage(0, var4 * 2, var3, var4);
		BufferedImage var13 = var2.getSubimage(var3, var4 * 2, var3, var4);
		BufferedImage var14 = var2.getSubimage(var3 * 2, var4 * 2, var3, var4);
		var5.getGraphics().drawImage(var6, 0, 0, var3, var4, (ImageObserver) null);
		var5.getGraphics().drawImage(entry0(var7, var0 - var3 * 2, var4), var3, 0, var0 - var3 * 2, var4, (ImageObserver) null);
		var5.getGraphics().drawImage(var8, var0 - var3, 0, var3, var4, (ImageObserver) null);
		var5.getGraphics().drawImage(entry0(var9, var3, var1 - var4 * 2), 0, var4, var3, var1 - var4 * 2, (ImageObserver) null);
		var5.getGraphics().drawImage(entry0(var10, var0 - var3 * 2, var1 - var4 * 2), var3, var4, var0 - var3 * 2, var1 - var4 * 2, (ImageObserver) null);
		var5.getGraphics().drawImage(entry0(var11, var3, var1 - var4 * 2), var0 - var3, var4, var3, var1 - var4 * 2, (ImageObserver) null);
		var5.getGraphics().drawImage(var12, 0, var1 - var4, var3, var4, (ImageObserver) null);
		var5.getGraphics().drawImage(entry0(var13, var0 - var3 * 2, var4), var3, var1 - var4, var0 - var3 * 2, var4, (ImageObserver) null);
		var5.getGraphics().drawImage(var14, var0 - var3, var1 - var4, var3, var4, (ImageObserver) null);
		return var5;
	}
	
	public static final BufferedImage entry0(int var0, int var1, int var2, int var3, int var4, BufferedImage var5)
	{
		int var6 = (int) (var1 / 100.0F * var4);
		BufferedImage var7 = new BufferedImage(var1, var3, 2);
		BufferedImage var8 = var5.getSubimage(var0, 0, var2 / 3, var5.getHeight());
		BufferedImage var9 = var5.getSubimage(var0 + var2 / 3, 0, var2 / 3, var5.getHeight());
		BufferedImage var10 = var5.getSubimage(var0 + var2 / 3 * 2, 0, var2 / 3, var5.getHeight());
		var7.getGraphics().drawImage(var8, 0, 0, var8.getWidth(), var3, (ImageObserver) null);
		var7.getGraphics().drawImage(entry0(var9, var1 - var8.getWidth() - var10.getWidth(), var3), var8.getWidth(), 0, var1 - var8.getWidth() - var10.getWidth(), var3, (ImageObserver) null);
		var7.getGraphics().drawImage(var10, var1 - var10.getWidth(), 0, var10.getWidth(), var3, (ImageObserver) null);
		try
		{
			var7 = var7.getSubimage(0, 0, var6, var3);
		} catch(Exception var12)
		{
			;
		}
		return var7;
	}
	
	public static final BufferedImage entry0(JComponent var0)
	{
		int var1 = var0.getWidth();
		int var2 = var0.getHeight();
		BufferedImage var3 = new BufferedImage(var1, var2, 2);
		Graphics2D var4 = var3.createGraphics();
		var0.paint(var4);
		var4.dispose();
		return var3;
	}
	
	public static final BufferedImage entry0(URL var0, boolean var1)
	{
		try
		{
			BufferedImage var2 = ImageIO.read(var0);
			if(var1)
			{
				class1033.entry0("Загружено изображение: " + var0.toString());
			}
			return var2;
		} catch(IOException var3)
		{
			if(var1)
			{
				class1033.entry1("Не удалось загрузить изображение: " + var0.toString());
			}
			return null;
		}
	}
}
