package me.craft4ik.launcher;
import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPasswordField;
import javax.swing.border.Border;

public class class104 extends JPasswordField
{
	private static final long serialVersionUID = 1L;
	public class1039 entry0;
	public int entry1 = 0;
	public int entry10 = 0;
	public int entry100 = 0;
	public int entry1000 = 0;
	
	public class104(int var1, int var2, int var3, int var4, Color var5) throws FontFormatException
	{
		setOpaque(false);
		setBorder((Border) null);
		setCaretColor(var5);
		setForeground(var5);
		setSelectionColor(new Color(51, 153, 255));
		setSelectedTextColor(Color.WHITE);
		setHorizontalAlignment(2);
		setFont(class1009.entry0(14.0F, 1));
		this.setBounds(var1 + 16, var2, var3 - 32, var4);
		entry1 = var3 - 32;
		entry10 = var4;
		entry100 = var1;
		entry1000 = var2;
		entry0 = new class1039();
		entry0.entry1(var2);
	}
	
	@Override protected final void paintComponent(Graphics var1)
	{
		Graphics2D var2 = (Graphics2D) var1.create();
		var2.dispose();
		super.paintComponent(var1);
	}
}
