import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class class1037 extends MouseAdapter
{
	// $FF: synthetic field
	final class1033 entry0;
	
	class1037(class1033 var1)
	{
		entry0 = var1;
	}
	
	@Override public final void mousePressed(MouseEvent var1)
	{
		class1033.entry0(entry0, var1.getX());
		class1033.entry1(entry0, var1.getY());
	}
}
