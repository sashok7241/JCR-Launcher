import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class class1031 implements ActionListener
{
	// $FF: synthetic field
	final class1039 entry0;
	
	class1031(class1039 var1)
	{
		entry0 = var1;
	}
	
	@Override public final void actionPerformed(ActionEvent var1)
	{
		if(class1039.entry0(entry0) == 72)
		{
			class1039.entry0(entry0, 0);
		} else if(class1039.entry0(entry0) == 36 && class1039.entry0(entry0) != 0 && class1039.entry0(entry0) != 72)
		{
			class1039.entry0(entry0, 72);
		} else if(class1039.entry0(entry0) == 0)
		{
			class1039.entry0(entry0, 36);
		}
		entry0.repaint();
	}
}
