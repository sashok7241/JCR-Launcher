package me.craft4ik.launcher;

public class LauncherSettingsImpl implements LauncherSettings
{
	@Override public final String getAlertIconsImage()
	{
		return "AlertIcons.png";
	}
	
	@Override public final String getAuthElementsImage()
	{
		return "AuthElements.png";
	}
	
	@Override public final String getBackgroundImage()
	{
		return "Background.png";
	}
	
	@Override public final String getBandColorsImage()
	{
		return "BandColors.png";
	}
	
	@Override public final String getButtonsImage()
	{
		return "Button.png";
	}
	
	@Override public final String getCheckboxImage()
	{
		return "CheckBox.png";
	}
	
	@Override public final String getClientFaviconImage()
	{
		return "m_favicon.png";
	}
	
	@Override public final String getColorScheme()
	{
		return "#33831d";
	}
	
	@Override public final String getComboboxImage()
	{
		return "ComboBox.png";
	}
	
	@Override public final String getFaviconImage()
	{
		return "Favicon.png";
	}
	
	@Override public final String getFieldBackgroundImage()
	{
		return "FieldBack.png";
	}
	
	@Override public final String getFont(int index)
	{
		switch(index)
		{
			case 1:
				return "Font1.ttf";
			case 2:
				return "Font2.ttf";
			case 3:
				return "YourFont.ttf";
			default:
				return null;
		}
	}
	
	@Override public final String getFrameIconsImage()
	{
		return "SysButs.png";
	}
	
	@Override public final String getImagesDirectory()
	{
		return "/me/craft4ik/launcher/assets/";
	}
	
	@Override public final String getLogotypeImage()
	{
		return "Logotype.png";
	}
	
	@Override public final String getModalBackgroundImage()
	{
		return "ModalBack.png";
	}
	
	@Override public final String getNewsBackgroundImage()
	{
		return "NewsBack.png";
	}
	
	@Override public final String getPressedBorderImage()
	{
		return "PressedBorder.png";
	}
	
	@Override public final String getProgressbarImage()
	{
		return "Progress.png";
	}
	
	@Override public final String getSplashImage()
	{
		return "Splash.png";
	}
	
	@Override public final String getWaitAntimationImage()
	{
		return "Wait.png";
	}
}
