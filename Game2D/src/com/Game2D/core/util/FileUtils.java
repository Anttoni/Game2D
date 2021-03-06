package com.Game2D.core.util;

import java.io.File;

public class FileUtils {
	
	public static String[] listAllFiles(File file) {
		return file.list();
	}
	
	public static String withoutExtension(String fileName) {
		String[] splitter = fileName.split(".");
		return splitter[0];
	}
	
	public static String getExtension(String fileName) {
		String[] splitter = fileName.split(".");
		if(splitter.length > 1) {
			return splitter[splitter.length -1];
		}
		return splitter[1];
	}
	
	public static int getAmountOfFiles(File file) {
		return file.list().length;
	}
	
}
