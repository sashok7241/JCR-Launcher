import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.JComponent;

public class class103 extends JComponent implements MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	public final String[] entry0;
	public int entry1 = 0;
	public boolean entry10 = false;
	public boolean entry100 = false;
	private final int entry1004 = 6;
	private boolean entry1005 = false;
	private boolean entry1006 = false;
	private int entry1007 = 0;
	private int entry1008 = 0;
	public static final BufferedImage entry1000 = class100.entry1006.getSubimage(0, 0, 232, 19);
	public static final BufferedImage entry1001 = class100.entry1006.getSubimage(0, 25, 232, 19);
	public static final BufferedImage entry1002 = class100.entry1006.getSubimage(0, 50, 232, 19);
	public static final BufferedImage entry1003 = class100.entry1006.getSubimage(0, 75, 232, 70);
	
	public class103(String[] var1, int var2)
	{
		entry0 = var1;
		entry1 = var2;
		setForeground(new Color(0, 0, 0));
		try
		{
			setFont(class1009.entry0(12.0F, 1));
		} catch(FontFormatException e)
		{
			e.printStackTrace();
		}
		setCursor(Cursor.getPredefinedCursor(12));
		this.setBounds(120, 327, 232, 19);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public final int entry0()
	{
		return entry1007;
	}
	
	public final void entry0(int var1)
	{
		entry1007 = var1;
	}
	
	public final boolean entry1()
	{
		return entry10;
	}
	
	public final boolean entry10()
	{
		return entry1006;
	}
	
	@Override public final void mouseClicked(MouseEvent var1)
	{
		boolean var2 = false;
		if(entry1008 > entry1002.getHeight() + 6)
		{
			entry1008 = (entry1008 - (entry1002.getHeight() + 6 + 2)) / 15;
			var2 = true;
			entry10 = true;
		} else
		{
			entry10 = false;
		}
		if(entry1006 && var2 && entry1008 < entry0.length)
		{
			entry1007 = entry1008;
			class1033.entry1001.entry1003.entry1003();
		}
		entry1006 = !entry1006;
		this.repaint();
	}
	
	@Override public final void mouseDragged(MouseEvent var1)
	{
	}
	
	@Override public final void mouseEntered(MouseEvent var1)
	{
		entry1005 = true;
		this.repaint();
	}
	
	@Override public final void mouseExited(MouseEvent var1)
	{
		entry1005 = false;
		this.repaint();
	}
	
	@Override public final void mouseMoved(MouseEvent var1)
	{
		entry1008 = var1.getY();
		this.repaint();
	}
	
	@Override public final void mousePressed(MouseEvent var1)
	{
	}
	
	@Override public final void mouseReleased(MouseEvent var1)
	{
	}
	
	@Override public final void paintComponent(Graphics var1)
	{
		Graphics2D var2 = (Graphics2D) var1;
		var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int var3 = getWidth();
		if(entry0.length == 2 && entry0[1].equals("error"))
		{
			entry100 = true;
			setCursor(Cursor.getPredefinedCursor(0));
		}
		int var4;
		if(entry1006 && !entry100)
		{
			var2.drawImage(entry1002, 0, 0, var3, entry1002.getHeight(), (ImageObserver) null);
			var4 = entry1002.getHeight() + entry0.length * 8 + entry0.length * 7 - 7 + 18 - 2;
			int var5 = entry1;
			if(getY() != var5 || getHeight() != var4)
			{
				this.setLocation(getX(), var5);
				this.setSize(getWidth(), var4);
				return;
			}
			var2.drawImage(entry1003, 0, entry1002.getHeight() + 6, var3, entry0.length * 8 + entry0.length * 7 - 7 + 12 - 2, (ImageObserver) null);
			var2.setComposite(AlphaComposite.Src);
			for(int var6 = 0; var6 < entry0.length; ++var6)
			{
				var2.drawString(entry0[var6], 7, entry1002.getHeight() * (var6 + 1) + entry1002.getHeight() - var6 * 4);
			}
			var2.drawString(entry0[entry1007], 7, entry1000.getHeight() - var2.getFontMetrics().getHeight() / 2 + 1);
		} else if(entry1005)
		{
			var4 = entry1001.getHeight();
			if(getY() != entry1 || getHeight() != var4)
			{
				this.setLocation(getX(), entry1);
				this.setSize(getWidth(), var4);
				return;
			}
			var2.drawImage(entry1001, 0, 0, var3, entry1001.getHeight(), (ImageObserver) null);
			var2.drawString(entry0[entry1007], 7, entry1001.getHeight() - var2.getFontMetrics().getHeight() / 2 + 1);
		} else
		{
			var4 = entry1000.getHeight();
			if(getY() != entry1 || getHeight() != var4)
			{
				this.setLocation(getX(), entry1);
				this.setSize(getWidth(), var4);
				return;
			}
			var2.drawImage(entry1000, 0, 0, var3, entry1000.getHeight(), (ImageObserver) null);
			var2.drawString(entry0[entry1007], 7, entry1000.getHeight() - var2.getFontMetrics().getHeight() / 2 + 1);
		}
		var2.dispose();
	}
}
