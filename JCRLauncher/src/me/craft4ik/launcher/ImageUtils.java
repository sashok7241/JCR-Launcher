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

public class ImageUtils
{
	public int entry0 = 0;
	public int entry1 = 0;
	public int entry10 = 0;
	public int entry100 = 0;
	public BufferedImage entry1000;
	public BufferedImage entry1001;
	public BufferedImage entry1002;
	
	public ImageUtils(int var1, int var2, int var3, int var4, int var5, int var6, BufferedImage var7)
	{
		entry0 = var3;
		entry1 = var4;
		entry10 = var1;
		entry100 = var2;
		entry1000 = var7.getSubimage(var5, var6, var3, var4);
	}
	
	public ImageUtils(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, BufferedImage var11)
	{
		entry0 = var3;
		entry1 = var4;
		entry10 = var1;
		entry100 = var2;
		entry1000 = var11.getSubimage(var5, var6, var3, var4);
		entry1001 = var11.getSubimage(var7, var8, var3, var4);
		entry1002 = var11.getSubimage(var9, var10, var3, var4);
	}
	
	public static final BufferedImage flipVertical(BufferedImage input)
	{
		AffineTransform transform = AffineTransform.getScaleInstance(-1.0D, 1.0D);
		transform.translate(-input.getWidth(), 0.0D);
		return new AffineTransformOp(transform, 1).filter(input, (BufferedImage) null);
	}
	
	public static final BufferedImage genBackground(BufferedImage texture, int bgWidth, int bgHeigth)
	{
		int width = texture.getWidth();
		int heigth = texture.getHeight();
		BufferedImage result = new BufferedImage(bgWidth, bgHeigth, 2);
		for(int x = 0; x <= bgWidth / width; ++x)
		{
			for(int y = 0; y <= bgHeigth / heigth; ++y)
			{
				result.getGraphics().drawImage(texture, x * width, y * heigth, (ImageObserver) null);
			}
		}
		return result;
	}
	
	public static final BufferedImage genPanel(int panelWidth, int panelHeigth, BufferedImage texture)
	{
		int width = texture.getWidth() / 3;
		int heigth = texture.getHeight() / 3;
		BufferedImage result = new BufferedImage(panelWidth, panelHeigth, 2);
		BufferedImage var6 = texture.getSubimage(0, 0, width, heigth);
		BufferedImage var7 = texture.getSubimage(width, 0, width, heigth);
		BufferedImage var8 = texture.getSubimage(width * 2, 0, width, heigth);
		BufferedImage var9 = texture.getSubimage(0, heigth, width, heigth);
		BufferedImage var10 = texture.getSubimage(width, heigth, width, heigth);
		BufferedImage var11 = texture.getSubimage(width * 2, heigth, width, heigth);
		BufferedImage var12 = texture.getSubimage(0, heigth * 2, width, heigth);
		BufferedImage var13 = texture.getSubimage(width, heigth * 2, width, heigth);
		BufferedImage var14 = texture.getSubimage(width * 2, heigth * 2, width, heigth);
		result.getGraphics().drawImage(var6, 0, 0, width, heigth, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(var7, panelWidth - width * 2, heigth), width, 0, panelWidth - width * 2, heigth, (ImageObserver) null);
		result.getGraphics().drawImage(var8, panelWidth - width, 0, width, heigth, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(var9, width, panelHeigth - heigth * 2), 0, heigth, width, panelHeigth - heigth * 2, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(var10, panelWidth - width * 2, panelHeigth - heigth * 2), width, heigth, panelWidth - width * 2, panelHeigth - heigth * 2, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(var11, width, panelHeigth - heigth * 2), panelWidth - width, heigth, width, panelHeigth - heigth * 2, (ImageObserver) null);
		result.getGraphics().drawImage(var12, 0, panelHeigth - heigth, width, heigth, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(var13, panelWidth - width * 2, heigth), width, panelHeigth - heigth, panelWidth - width * 2, heigth, (ImageObserver) null);
		result.getGraphics().drawImage(var14, panelWidth - width, panelHeigth - heigth, width, heigth, (ImageObserver) null);
		return result;
	}
	
	public static final BufferedImage genProgressbar(int progress, int percents, int heigth, int progressHeigth, int progressWidth, BufferedImage var5)
	{
		int width = (int) (percents / 100.0F * progressWidth);
		BufferedImage result = new BufferedImage(percents, progressHeigth, 2);
		BufferedImage left = var5.getSubimage(progress, 0, heigth / 3, var5.getHeight());
		BufferedImage center = var5.getSubimage(progress + heigth / 3, 0, heigth / 3, var5.getHeight());
		BufferedImage right = var5.getSubimage(progress + heigth / 3 * 2, 0, heigth / 3, var5.getHeight());
		result.getGraphics().drawImage(left, 0, 0, left.getWidth(), progressHeigth, (ImageObserver) null);
		result.getGraphics().drawImage(genBackground(center, percents - left.getWidth() - right.getWidth(), progressHeigth), left.getWidth(), 0, percents - left.getWidth() - right.getWidth(), progressHeigth, (ImageObserver) null);
		result.getGraphics().drawImage(right, percents - right.getWidth(), 0, right.getWidth(), progressHeigth, (ImageObserver) null);
		try
		{
			result = result.getSubimage(0, 0, width, progressHeigth);
		} catch(Exception var12)
		{
			// Игнор
		}
		return result;
	}
	
	public static final BufferedImage load(URL from, boolean debug)
	{
		try
		{
			BufferedImage var2 = ImageIO.read(from);
			if(debug)
			{
				Frame.log("Загружено изображение: " + from.toString());
			}
			return var2;
		} catch(IOException e)
		{
			if(debug)
			{
				Frame.entry1("Не удалось загрузить изображение: " + from.toString());
			}
			return null;
		}
	}
	
	public static final BufferedImage screenshot(JComponent comp)
	{
		BufferedImage image = new BufferedImage(comp.getWidth(), comp.getHeight(), 2);
		Graphics2D graphics = image.createGraphics();
		comp.paint(graphics);
		graphics.dispose();
		return image;
	}
}
