package com.Game2D.core.util;

import java.io.File;

public class FileUtils {

	public static String[] listAllFiles(File file) {
		return file.list();
	}
	
}
