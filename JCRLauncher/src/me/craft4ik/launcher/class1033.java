package me.craft4ik.launcher;
import com.sun.awt.AWTUtilities;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class class1033 extends JFrame implements FocusListener, KeyListener
{
	private static final long serialVersionUID = 1L;
	public static String[] entry0 = null;
	public static String[] entry1 = null;
	public static String entry10 = "";
	private static int entry102 = 1;
	public JButton entry100 = new JButton();
	public JButton entry1000 = new JButton();
	private int entry1020 = 0;
	private int entry1021 = 0;
	public static class1033 entry1001;
	public class1014 entry1002 = new class1014();
	public class1039 entry1003 = new class1039();
	public class103 entry1004 = new class103((String[]) null, 324);
	public JTextPane entry1005 = new JTextPane();
	public JScrollPane entry1006;
	public JTextField entry1007;
	public JPasswordField entry1008;
	public JButton entry1009;
	public JButton entry101;
	public JButton entry1010;
	public JButton entry1011;
	public JButton entry1012;
	public JButton entry1013;
	public JButton entry1014;
	public JCheckBox entry1015;
	public JCheckBox entry1016;
	public JCheckBox entry1017;
	public JCheckBox entry1018;
	public JTextField entry1019;
	
	public class1033()
	{
		entry1006 = new JScrollPane(entry1005);
		entry1007 = new JTextField();
		entry1008 = new JPasswordField();
		entry1009 = new JButton("В игру");
		entry101 = new JButton("Выход");
		entry1010 = new JButton("Обновить");
		entry1011 = new JButton("В игру");
		entry1012 = new JButton("Настройки");
		entry1013 = new JButton("Отмена");
		entry1014 = new JButton("Принять");
		entry1015 = new JCheckBox("Запомнить мои данные");
		entry1016 = new JCheckBox("Перекачать клиент");
		entry1017 = new JCheckBox("Полноэкранный режим");
		entry1018 = new JCheckBox("Режим оффлайн");
		entry1019 = new JTextField("1024");
		if(class100.entry1005() != 0)
		{
			setUndecorated(true);
			AWTUtilities.setWindowOpaque(this, false);
		}
		setPreferredSize(new Dimension(346, 498));
		this.setSize(getPreferredSize());
		setTitle("qoobworld.ru :: v5.0");
		setResizable(false);
		setLocationRelativeTo((Component) null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(3);
		setIconImage(class100.entry1000);
		this.entry1();
		try
		{
			class1019.entry1(this);
		} catch(Exception var2)
		{
			;
		}
		entry1007.setText("Логин");
		entry1007.addActionListener((ActionListener) null);
		entry1007.addFocusListener(this);
		entry1008.setText("Пароль");
		entry1008.addActionListener((ActionListener) null);
		entry1008.addFocusListener(this);
		entry1005.setOpaque(false);
		entry1005.setBorder((Border) null);
		entry1005.setContentType("text/html");
		entry1005.setEditable(false);
		entry1005.setFocusable(false);
		entry1005.addHyperlinkListener(new class1028(this));
		entry1006.setOpaque(false);
		entry1006.getViewport().setOpaque(false);
		entry1006.setBorder((Border) null);
		entry1006.setBounds(371, 45, class100.entry1010.getWidth() - 50, 360);
		entry1004.addMouseListener(new class1026(this));
		entry1003.addKeyListener(this);
		entry1007.addKeyListener(this);
		entry1008.addKeyListener(this);
		this.entry1(false);
		entry10(false);
		setContentPane(entry1003);
	}
	
	public final void entry0(boolean var1)
	{
		entry1004.setEnabled(var1);
		entry1007.setEnabled(var1);
		entry1008.setEnabled(var1);
		entry1011.setEnabled(var1);
		entry1012.setEnabled(var1);
		entry101.setEnabled(var1);
		entry1010.setEnabled(var1);
		entry1013.setEnabled(var1);
		entry1014.setEnabled(var1);
		entry1015.setEnabled(var1);
		entry1016.setEnabled(var1);
		entry1017.setEnabled(var1);
		entry1018.setEnabled(var1);
		entry1019.setEnabled(var1);
		entry1009.setEnabled(var1);
	}
	
	public final void entry0(int var1)
	{
		BufferedImage var2 = class1.entry0(entry1003).getSubimage(0, 0, entry1003.getWidth(), entry1003.getHeight());
		entry1003.removeAll();
		class1039 var10000 = entry1003;
		class1039.entry1.entry0(var2, var1);
		entry1003.entry1(true);
		this.entry1(false);
		this.repaint();
	}
	
	public final void entry0(int var1, boolean var2)
	{
		switch(var1)
		{
			case 1:
				entry10(var2);
				break;
			case 2:
				entry100(var2);
				break;
			case 3:
				entry1000(var2);
			case 4:
			default:
				break;
			case 5:
				entry1001(var2);
		}
	}
	
	public final void entry0(String var1, int var2)
	{
		entry1003.entry0(var1, var2);
	}
	
	public final void entry0(String var1, int var2, int var3)
	{
		entry1003.entry0(var1, var2, var3);
	}
	
	private void entry1()
	{
		addMouseMotionListener(new class1032(this));
		addMouseListener(new class1037(this));
	}
	
	protected final void entry1(boolean var1)
	{
		if(!var1)
		{
			entry1003.add(entry100);
			entry1003.add(entry1000);
		} else
		{
			entry1003.remove(entry100);
			entry1003.remove(entry1000);
		}
	}
	
	public final void entry1(int var1)
	{
		switch(var1)
		{
			case 1:
				entry1003.entry0();
				break;
			case 2:
				entry1003.entry1();
				break;
			case 3:
				entry1003.entry10();
				break;
			case 4:
				entry1003.entry1000();
				break;
			case 5:
				entry1003.entry100();
		}
	}
	
	protected final void entry10(boolean var1)
	{
		if(!var1)
		{
			entry1003.add(entry1004);
			entry1003.add(entry1011);
			entry1003.add(entry1012);
			entry1003.add(entry1007);
			entry1003.add(entry1008);
		} else
		{
			entry1003.remove(entry1004);
			entry1003.remove(entry1011);
			entry1003.remove(entry1012);
			entry1003.remove(entry1007);
			entry1003.remove(entry1008);
		}
	}
	
	protected final void entry100(boolean var1)
	{
		if(!var1)
		{
			entry1003.add(entry1013);
			entry1003.add(entry1014);
			entry1003.add(entry1015);
			entry1003.add(entry1016);
			entry1003.add(entry1017);
			entry1003.add(entry1018);
			entry1003.add(entry1019);
		} else
		{
			entry1003.remove(entry1013);
			entry1003.remove(entry1014);
			entry1003.remove(entry1015);
			entry1003.remove(entry1016);
			entry1003.remove(entry1017);
			entry1003.remove(entry1018);
			entry1003.remove(entry1019);
		}
	}
	
	protected final void entry1000(boolean var1)
	{
		if(!var1)
		{
			entry1003.add(entry101);
			entry1003.add(entry1010);
		} else
		{
			entry1003.remove(entry101);
			entry1003.remove(entry1010);
		}
	}
	
	protected final void entry1001(boolean var1)
	{
		if(!var1)
		{
			entry1003.add(entry1009);
		} else
		{
			entry1003.remove(entry1009);
		}
	}
	
	@Override public final void focusGained(FocusEvent var1)
	{
		if(var1.getSource() == entry1007 && entry1007.getText().equals("Логин"))
		{
			entry1007.setText("");
		}
		if(var1.getSource() == entry1008 && new String(entry1008.getPassword()).equals("Пароль"))
		{
			entry1008.setText("");
		}
	}
	
	@Override public final void focusLost(FocusEvent var1)
	{
		if(var1.getSource() == entry1007 && entry1007.getText().equals(""))
		{
			entry1007.setText("Логин");
		}
		if(var1.getSource() == entry1008 && new String(entry1008.getPassword()).equals(""))
		{
			entry1008.setText("Пароль");
		}
	}
	
	@Override public final void keyPressed(KeyEvent var1)
	{
	}
	
	@Override public final void keyReleased(KeyEvent var1)
	{
		if(KeyEvent.getKeyText(var1.getKeyCode()).equals("Enter"))
		{
			if(entry1003.entry10 == 0)
			{
				entry1011.doClick();
			} else if(entry1003.entry10 == 4)
			{
				entry1009.doClick();
			}
		}
	}
	
	@Override public final void keyTyped(KeyEvent var1)
	{
	}
	
	public static final void entry0()
	{
		entry0("Запуск qoobworld launcher v5.0");
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			entry0("Установка системного LnF успешно завершена");
		} catch(Exception var1)
		{
			entry0("Не удалось установить системный LnF");
		}
		class1008.entry10();
		entry1 = class100.entry10();
		class100.entry1();
	}
	
	// $FF: synthetic method
	static final int entry0(class1033 var0)
	{
		return var0.entry1020;
	}
	
	// $FF: synthetic method
	static final int entry0(class1033 var0, int var1)
	{
		return var0.entry1020 = var1;
	}
	
	public static final void entry0(class1050 var0) throws UnsupportedEncodingException
	{
		entry1001 = new class1033();
		entry1001.entry1003.entry0();
		class100.entry0(entry1001);
		entry1001.entry1003.entry0(true);
		class1008.entry1();
		SwingUtilities.invokeLater(new class1030(var0));
		entry1001.show();
	}
	
	public static final void entry0(String var0)
	{
	}
	
	// $FF: synthetic method
	static final int entry1(class1033 var0)
	{
		return var0.entry1021;
	}
	
	// $FF: synthetic method
	static final int entry1(class1033 var0, int var1)
	{
		return var0.entry1021 = var1;
	}
	
	public static final void entry1(String var0)
	{
	}
}
