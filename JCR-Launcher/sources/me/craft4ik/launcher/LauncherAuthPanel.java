package me.craft4ik.launcher;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;
import javax.swing.Timer;

public class LauncherAuthPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	public static class1043 entry0;
	public static class1036 entry1;
	public int entry10 = 0;
	public Timer entry100;
	public int entry1000 = 0;
	public String entry1001 = "";
	public boolean entry1002 = false;
	public BufferedImage entry1003;
	public static boolean entry1004 = false;
	public static boolean entry1005 = false;
	public boolean entry1006;
	public boolean entry1007;
	private boolean entry101 = true;
	public int entry1008 = 367;
	public int entry1009 = 376;
	private int entry1010 = 0;
	private int entry1011;
	private static int entry1012;
	private static int entry1013;
	private static int entry1014;
	private static int entry1015;
	
	public LauncherAuthPanel()
	{
		entry0 = new class1043();
		entry1 = new class1036();
		setDoubleBuffered(true);
		setLayout((LayoutManager) null);
		setFocusable(true);
	}
	
	public final void entry0()
	{
		entry10 = 0;
	}
	
	public final void entry0(boolean var1)
	{
		entry1002();
		if(var1)
		{
			entry1006 = true;
			entry100 = new Timer(450, new class1031(this));
			entry100.start();
		} else
		{
			entry1006 = false;
			this.repaint();
		}
	}
	
	public final void entry0(boolean var1, int var2)
	{
		entry1008 = var2;
		this.entry0(var1);
	}
	
	private void entry0(int var1, Graphics2D var2) throws NumberFormatException, FontFormatException
	{
		int var3 = new Integer(LauncherSettignsStorage.version_settings[1]).intValue();
		var2.setFont(LauncherFontManager.createFont(var3, new Integer(LauncherSettignsStorage.version_settings[2].replace("#", "")).intValue()));
		var2.setColor(new Color(0, 0, 0));
		entry0(LauncherSettignsStorage.version_settings[0], var1, 165, (Color) null, var2);
	}
	
	public final void entry0(int var1, int var2)
	{
		entry1012 = var1;
		entry1013 = var2;
	}
	
	public final void entry0(String var1, int var2)
	{
		entry1007 = entry101 = true;
		entry1001 = var1;
		if(var2 == 0)
		{
			entry101 = false;
		} else if(var2 == 1)
		{
			entry1011 = 0;
		} else if(var2 == 2)
		{
			entry1011 = 13;
		} else if(var2 == 3)
		{
			entry1011 = 26;
		}
		this.repaint();
	}
	
	private void entry0(String var1, int var2, Graphics2D var3) throws FontFormatException
	{
		var3.setFont(LauncherFontManager.createFont(36.0F, 2));
		var3.setColor(new Color(0, 72, 25, entry0(100)));
		entry0(var1, var2, 117, (Color) null, var3);
	}
	
	public final void entry0(String var1, int var2, int var3)
	{
		entry1007 = entry101 = true;
		entry1001 = var1;
		entry1009 = var3;
		if(var2 == 0)
		{
			entry101 = false;
		} else if(var2 == 1)
		{
			entry1011 = 0;
		} else if(var2 == 2)
		{
			entry1011 = 13;
		} else if(var2 == 3)
		{
			entry1011 = 26;
		}
		this.repaint();
	}
	
	public final void entry1()
	{
		entry10 = 3;
	}
	
	public final void entry1(boolean var1)
	{
		if(var1)
		{
			entry1007 = false;
		} else if(!var1 && !entry1001.equals(""))
		{
			entry1007 = true;
		}
		this.repaint();
	}
	
	public final void entry1(int var1)
	{
		entry1014 = var1;
	}
	
	public final void entry10()
	{
		entry10 = 1;
	}
	
	public final void entry100()
	{
		entry10 = 4;
	}
	
	public final void entry1000()
	{
		entry10 = 2;
		entry100 = new Timer(300, new class1040(this));
		entry100.start();
	}
	
	public final void entry1001()
	{
		LauncherAuthFrame.frame.setSize(346 + LauncherUtils.newsBackground.getWidth(), 498);
		entry1015 = LauncherUtils.newsBackground.getWidth();
		entry1004 = true;
		entry100 = new Timer(50, new class1025(this));
		entry100.start();
	}
	
	public final void entry1002()
	{
		if(entry100 != null)
		{
			entry100.stop();
		}
		entry100 = null;
	}
	
	public final void entry1003()
	{
		this.entry0(false);
		entry1007 = false;
		entry101 = true;
		entry1001 = "";
	}
	
	@Override public final void paintComponent(Graphics var1)
	{
		Graphics2D var2 = (Graphics2D) var1;
		var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		short var3 = 346;
		short var4 = 498;
		if(entry1004)
		{
			var2.drawImage(LauncherUtils.newsBackground, 346 - entry1015, 0, (ImageObserver) null);
		}
		var2.drawImage(LauncherUtils.background, 0, 0, var3, var4, (ImageObserver) null);
		if(entry10 == 0)
		{
			try
			{
				this.entry0(var3, var2);
			} catch(NumberFormatException | FontFormatException e)
			{
				e.printStackTrace();
			}
			entry0(LauncherUtils.logotype, var3, 67, Color.RED, var2);
			entry0(class1035.entry1.entry1000, var3, entry1013, Color.RED, var2);
			entry0(class1035.entry10.entry1000, var3, entry1013 + entry1012, (Color) null, var2);
			entry0(class1035.entry100.entry1000, var3, entry1014, Color.RED, var2);
		} else if(entry10 == 1)
		{
			try
			{
				this.entry0("Обновление", var3, var2);
			} catch(FontFormatException e1)
			{
				e1.printStackTrace();
			}
			try
			{
				this.entry0(var3, var2);
			} catch(NumberFormatException | FontFormatException e)
			{
				e.printStackTrace();
			}
			var2.setColor(new Color(0, 0, 0, entry0(5)));
			entry0(ImageUtils.genPanel(232, 139, LauncherUtils.modalBackground), var3, 179, Color.BLACK, var2);
			var2.setColor(new Color(0, 0, 0, entry0(100)));
			try
			{
				var2.setFont(LauncherFontManager.createFont(13.0F, 1));
			} catch(FontFormatException e)
			{
				e.printStackTrace();
			}
			var2.drawString("Пожалуйста, обновите лаунчер", 66, 202);
			var2.drawString("до более новой версии.", 66, 217);
			var2.drawString("Обновление содержит исправления", 66, 245);
			var2.drawString("и улучшения, необходимые для более", 66, 260);
			var2.drawString("удобной игры на наших серверах.", 66, 275);
			var2.drawString("Для обновления нажмите «Обновить»", 66, 303);
		} else if(entry10 == 2)
		{
			int var5 = 0;
			try
			{
				var5 = (int) ((LauncherUtils.entry0.entry1 - LauncherUtils.entry0.entry10) / (LauncherUtils.entry0.entry1000 * 100));
			} catch(Exception var10)
			{
			}
			try
			{
				this.entry0("Обновление", var3, var2);
			} catch(FontFormatException e1)
			{
				e1.printStackTrace();
			}
			try
			{
				this.entry0(var3, var2);
			} catch(NumberFormatException | FontFormatException e)
			{
				e.printStackTrace();
			}
			var2.setColor(new Color(0, 0, 0, entry0(5)));
			entry0(ImageUtils.genPanel(232, 139, LauncherUtils.modalBackground), var3, 179, Color.BLACK, var2);
			var2.setColor(new Color(0, 0, 0));
			try
			{
				var2.setFont(LauncherFontManager.createFont(13.0F, 1));
			} catch(FontFormatException e)
			{
				e.printStackTrace();
			}
			var2.drawString("Файл: " + LauncherUtils.entry0.entry100, 66, 202);
			var2.drawString("Скорость: " + LauncherUtils.entry0.entry1000 + " kB/s", 66, 217);
			var2.drawString("Состояние: " + LauncherUtils.entry0.entry1002, 66, 232);
			var2.drawString("Размер обновления: " + LauncherUtils.entry0.entry1 / 1024L + " kB", 66, 260);
			var2.drawString("Загружено: " + LauncherUtils.entry0.entry10 / 1024L + " kB", 66, 275);
			var2.drawString("До завершения: " + var5 + " секунд", 66, 303);
			var2.drawImage(ImageUtils.genProgressbar(0, 232, 24, 26, 100, LauncherUtils.progressbar), 57, 324, 232, 26, (ImageObserver) null);
			var2.setColor(new Color(245, 245, 245));
			try
			{
				var2.setFont(LauncherFontManager.createFont(12.0F, 1));
			} catch(FontFormatException e)
			{
			}
			BufferedImage var6 = ImageUtils.genProgressbar(24, 232, 24, 26, LauncherUtils.entry0.entry0, LauncherUtils.progressbar);
			try
			{
				int var7 = LauncherUtils.entry0.entry0 * 232 / 100;
				entry0.entry0(var6.getSubimage(0, 0, var7, 26), 57, 324, var7, 26, Color.WHITE, var2);
				var2.drawString(LauncherUtils.entry0.entry0 + "%", 251, 341);
			} catch(Exception var9)
			{
			}
		} else if(entry10 == 3)
		{
			try
			{
				this.entry0("Настройки", var3, var2);
			} catch(FontFormatException e1)
			{
				e1.printStackTrace();
			}
			try
			{
				this.entry0(var3, var2);
			} catch(NumberFormatException | FontFormatException e)
			{
				e.printStackTrace();
			}
			entry0(ImageUtils.genPanel(232, 139, LauncherUtils.modalBackground), var3, 179, Color.BLACK, var2);
			var2.setColor(new Color(0, 0, 0));
			try
			{
				var2.setFont(LauncherFontManager.createFont(13.0F, 1));
			} catch(FontFormatException e)
			{
				e.printStackTrace();
			}
			var2.drawString("- выделено памяти (mB)", 125, 305);
		} else if(entry10 == 4)
		{
			try
			{
				class1034.entry0(var2);
			} catch(FontFormatException e)
			{
				e.printStackTrace();
			}
		}
		try
		{
			var2.drawImage(entry1003, 0, 0, (ImageObserver) null);
		} catch(Exception var8)
		{
		}
		if(entry1006)
		{
			entry0.entry0(LauncherUtils.waitAnimation.getSubimage(entry1010, 0, 36, 12), 154, entry1008, Color.PINK, var2);
		}
		if(entry1007)
		{
			var2.setColor(new Color(41, 102, 53));
			try
			{
				var2.setFont(LauncherFontManager.createFont(14.0F, 1));
			} catch(FontFormatException e)
			{
				e.printStackTrace();
			}
			entry0(entry1001, var3, 50, (Color) null, var2);
			if(entry101)
			{
				entry0.entry0(LauncherUtils.alertIcons.getSubimage(entry1011, 0, 13, 13), (var3 - var2.getFontMetrics().stringWidth(entry1001)) / 2 - 19, 38, Color.PINK, var2);
			}
		}
	}
	
	public static final void entry0(BufferedImage var0, int var1, int var2, Color var3, Graphics2D var4)
	{
		entry0(var0, var1, var2, var0.getWidth(), var0.getHeight(), var3, var4);
	}
	
	public static final void entry0(BufferedImage var0, int var1, int var2, int var3, int var4, Color var5, Graphics2D var6)
	{
		int var7 = (var1 - var3) / 2;
		var6.drawImage(var0, var7, var2, (ImageObserver) null);
	}
	
	public static final int entry0(int var0)
	{
		return (int) (2.55F * var0);
	}
	
	// $FF: synthetic method
	static final int entry0(LauncherAuthPanel var0)
	{
		return var0.entry1010;
	}
	
	// $FF: synthetic method
	static final int entry0(LauncherAuthPanel var0, int var1)
	{
		return var0.entry1010 = var1;
	}
	
	public static final void entry0(String var0, int var1, int var2, Color var3, Graphics2D var4)
	{
		FontMetrics var5 = var4.getFontMetrics();
		int var6 = (var1 - var5.stringWidth(var0)) / 2;
		var4.drawString(var0, var6, var2);
	}
	
	public static final void entry1(BufferedImage var0, int var1, int var2, Color var3, Graphics2D var4)
	{
		int var5 = (var1 - var0.getWidth()) / 2;
		int var6 = (var2 - var0.getHeight()) / 2;
		var4.drawImage(var0, var5, var6, (ImageObserver) null);
	}
	
	// $FF: synthetic method
	static final int entry10(int var0)
	{
		return entry1015 -= var0;
	}
	
	// $FF: synthetic method
	static final int entry1004()
	{
		return entry1015;
	}
}
