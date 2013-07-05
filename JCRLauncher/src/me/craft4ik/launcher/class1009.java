package me.craft4ik.launcher;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class class1009
{
	public static Font entry0;
	public static String entry1 = class100.entry0().getImagesDirectory();
	
	public static final Color entry0()
	{
		try
		{
			String var0 = class100.entry0(class100.entry10("jcr_theme.php"), "?action=theme&request=color", false);
			return Color.decode(var0);
		} catch(Exception var1)
		{
			Frame.entry1("Не удалось загрузить online цветовую схему программы");
			return Color.decode(class100.entry0().getColorScheme());
		}
	}
	
	public static final Font entry0(float var0, int var1) throws FontFormatException
	{
		try
		{
			switch(var1)
			{
				case 1:
					entry0 = Font.createFont(0, class1009.class.getResourceAsStream(entry1 + class100.entry0().getFont(1))).deriveFont(var0);
					break;
				case 2:
					entry0 = Font.createFont(0, class1009.class.getResourceAsStream(entry1 + class100.entry0().getFont(2))).deriveFont(var0);
					break;
				case 3:
					entry0 = Font.createFont(0, class1009.class.getResourceAsStream(entry1 + class100.entry0().getFont(3))).deriveFont(var0);
					break;
				default:
					entry0 = new Font("Arial", 0, (int) var0);
					Frame.entry1("Шрифт #" + var1 + " не обнаружен, установлен шрифт " + entry0.getFontName());
			}
		} catch(IOException var3)
		{
			entry0 = new Font("Arial", 0, (int) var0);
			Frame.entry1("Установка шрифта #" + var1 + " не удалась, установлен шрифт " + entry0.getFontName());
		}
		return entry0.deriveFont(var0);
	}
}
