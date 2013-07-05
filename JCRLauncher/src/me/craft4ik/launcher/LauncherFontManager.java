package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class LauncherFontManager
{
	public static Font currentFont;
	public static String directory = LauncherUtils.getSettings().getImagesDirectory();
	
	public static final Font createFont(float size, int index) throws FontFormatException
	{
		try
		{
			switch(index)
			{
				case 1:
					currentFont = Font.createFont(0, LauncherFontManager.class.getResourceAsStream(directory + LauncherUtils.getSettings().getFont(1))).deriveFont(size);
					break;
				case 2:
					currentFont = Font.createFont(0, LauncherFontManager.class.getResourceAsStream(directory + LauncherUtils.getSettings().getFont(2))).deriveFont(size);
					break;
				case 3:
					currentFont = Font.createFont(0, LauncherFontManager.class.getResourceAsStream(directory + LauncherUtils.getSettings().getFont(3))).deriveFont(size);
					break;
				default:
					currentFont = new Font("Arial", 0, (int) size);
					LauncherAuthFrame.error("Шрифт #" + index + " не обнаружен, установлен шрифт " + currentFont.getFontName());
			}
		} catch(IOException e)
		{
			currentFont = new Font("Arial", 0, (int) size);
			LauncherAuthFrame.error("Установка шрифта #" + index + " не удалась, установлен шрифт " + currentFont.getFontName());
		}
		return currentFont.deriveFont(size);
	}
	
	public static final Color entry0()
	{
		try
		{
			return Color.decode(LauncherUtils.execute(LauncherUtils.resolve("jcr_theme.php"), "?action=theme&request=color", false));
		} catch(Exception var1)
		{
			LauncherAuthFrame.error("Не удалось загрузить online цветовую схему программы");
			return Color.decode(LauncherUtils.getSettings().getColorScheme());
		}
	}
}
