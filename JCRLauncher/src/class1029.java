import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class class1029 extends JCheckBox
{
	private static final long serialVersionUID = 1L;
	public BufferedImage entry0;
	public BufferedImage entry1;
	public int entry10 = 0;
	public int entry100 = 0;
	public int entry1000 = 0;
	public int entry1001 = 0;
	
	public class1029(int var1, int var2, int var3, int var4, String var5, boolean var6) throws FontFormatException
	{
		super(var5);
		setOpaque(false);
		setFocusable(false);
		setSelected(var6);
		setForeground(new Color(0, 0, 0));
		setFont(class1009.entry0(13.0F, 1));
		setCursor(Cursor.getPredefinedCursor(12));
		this.setBounds(var1, var2, var3, var4);
		entry10 = var3;
		entry100 = var4;
		setIcon(new ImageIcon(class100.entry1007.getSubimage(0, 0, 16, 16)));
		setRolloverIcon(new ImageIcon(class100.entry1007.getSubimage(32, 0, 16, 16)));
		setSelectedIcon(new ImageIcon(class100.entry1007.getSubimage(16, 0, 16, 16)));
		setRolloverSelectedIcon(new ImageIcon(class100.entry1007.getSubimage(48, 0, 16, 16)));
	}
	
	@Override protected final void paintComponent(Graphics var1)
	{
		super.paintComponent(var1);
	}
}
