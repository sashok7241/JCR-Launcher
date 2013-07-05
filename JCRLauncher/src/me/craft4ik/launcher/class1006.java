package me.craft4ik.launcher;

import java.io.File;
import java.io.FilenameFilter;

final class class1006 implements FilenameFilter
{
	@Override public final boolean accept(File var1, String var2)
	{
		return var2.toLowerCase().endsWith(".zip") || var2.toLowerCase().endsWith(".jar");
	}
}
