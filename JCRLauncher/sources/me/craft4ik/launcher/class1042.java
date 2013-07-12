package me.craft4ik.launcher;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class class1042 extends PlainDocument
{
	private static final long serialVersionUID = 1L;
	// $FF: synthetic field
	final int entry0;
	// $FF: synthetic field
	final class1041 entry1;
	
	class1042(class1041 var1, int var2)
	{
		entry1 = var1;
		entry0 = var2;
	}
	
	@Override public final void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException
	{
		if(var2 != null)
		{
			if(getLength() + var2.length() <= entry0)
			{
				super.insertString(var1, var2, var3);
			}
		}
	}
}
