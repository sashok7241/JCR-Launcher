package me.craft4ik.launcher;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;

public class LauncherFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private class1051 entry0 = new class1051();
	
	public LauncherFrame()
	{
		if(class100.entry1005() != 0)
		{
			setUndecorated(true);
			AWTUtilities.setWindowOpaque(this, false);
		}
		setPreferredSize(new Dimension(280, 200));
		this.setSize(getPreferredSize());
		setTitle("qoobworld.ru :: v5.0");
		setResizable(false);
		setLocationRelativeTo((Component) null);
		setIconImage(class100.loadLocalImage(class100.getSettings().getFaviconImage()));
		setDefaultCloseOperation(2);
		setLayout(new BorderLayout());
		setContentPane(entry0);
	}
	
	public final void entry0(String var1)
	{
		class1051.entry0 = "Состояние: " + var1;
		entry0.repaint();
	}
}
