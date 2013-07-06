package me.craft4ik.launcher;

import java.awt.FontFormatException;

import javax.swing.JButton;

public class class1019 extends LauncherUtils
{
	public static boolean[] entry1016;
	public static String entry1017;
	
	public static final JButton entry0(ImageUtils var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, "");
		class101 var2 = new class101();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry0(ImageUtils var0, String var1) throws FontFormatException
	{
		class1027 var2 = new class1027(var0, var1);
		class1011 var3 = new class1011();
		var2.addActionListener(var3);
		return var2;
	}
	
	public static final JButton entry1(ImageUtils var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, "");
		class1010 var2 = new class1010();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry1(ImageUtils var0, String var1) throws FontFormatException
	{
		class1027 var2 = new class1027(var0, var1);
		class1015 var3 = new class1015();
		var2.addActionListener(var3);
		return var2;
	}
	
	public static final void entry1(LauncherAuthFrame var0) throws FontFormatException
	{
		var0.entry100 = entry1(class1035.entry1002);
		var0.entry1000 = entry0(class1035.entry1003);
		var0.buttonLaunch2 = entry1(class1035.entry1001, var0.buttonLaunch2.getText());
		var0.buttonExit = entry1007(var0.buttonExit.getText());
		var0.buttonRefresh = entry1008(var0.buttonRefresh.getText());
		var0.buttonSettings = entry0(class1035.entry1000, var0.buttonSettings.getText());
		var0.buttonCancel = entry1005(var0.buttonCancel.getText());
		var0.buttonAccept = entry1006(var0.buttonAccept.getText());
		var0.buttonLaunch = entry1009(var0.buttonLaunch.getText());
		var0.login = new class1041(57, 179, 232, 46, class1035.entry0);
		var0.password = new class104(57, 226, 232, 46, class1035.entry0);
		var0.entry1004 = new LauncherCombobox(entry1000(), 324);
		var0.savePassword = new class1029(68, 188, 162, 16, var0.savePassword.getText(), true);
		var0.redownloadClient = new class1029(68, 214, 135, 16, var0.redownloadClient.getText(), var0.redownloadClient.isSelected());
		var0.fullscreen = new class1029(68, 240, 160, 16, var0.fullscreen.getText(), var0.fullscreen.isSelected());
		var0.offline = new class1029(68, 266, 119, 16, var0.offline.getText(), var0.offline.isSelected());
		var0.memory = new class1041(72, 292, 48, 18, var0.memory.getText(), 4, class1035.entry0);
	}
	
	public static final JButton entry1005(String var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, 57, 326, 112, 38);
		class1012 var2 = new class1012();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry1006(String var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, 177, 326, 112, 38);
		class1013 var2 = new class1013();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry1007(String var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, 57, 326, 112, 38);
		class1016 var2 = new class1016();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry1008(String var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, 177, 326, 112, 38);
		class1017 var2 = new class1017();
		var1.addActionListener(var2);
		return var1;
	}
	
	public static final JButton entry1009(String var0) throws FontFormatException
	{
		class1027 var1 = new class1027(var0, 177, 326, 112, 38);
		class1018 var2 = new class1018();
		var1.addActionListener(var2);
		return var1;
	}
}
