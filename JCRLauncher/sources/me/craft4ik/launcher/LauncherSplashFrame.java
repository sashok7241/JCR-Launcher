package me.craft4ik.launcher;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;

public class LauncherSplashFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private LauncherSplashPanel panel = new LauncherSplashPanel();
	
	public LauncherSplashFrame()
	{
		if(LauncherUtils.getOS() != 0)
		{
			setUndecorated(true);
			AWTUtilities.setWindowOpaque(this, false);
		}
		setPreferredSize(new Dimension(280, 200));
		this.setSize(getPreferredSize());
		setTitle("qoobworld.ru :: v5.0");
		setResizable(false);
		setLocationRelativeTo((Component) null);
		setIconImage(LauncherUtils.loadLocalImage(LauncherUtils.getSettings().getFaviconImage()));
		setDefaultCloseOperation(2);
		setLayout(new BorderLayout());
		setContentPane(panel);
	}
	
	public final void setState(String state)
	{
		LauncherSplashPanel.state = "Состояние: " + state;
		panel.repaint();
	}
}
