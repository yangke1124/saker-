package com.yk.common.utils;

import java.io.File;

import org.junit.Test;

public class FileUtil {
	
	@Test
	public static String getExtendName(String fileName){
		//TODO 实现代码
		File file = new File("D:\\360zip");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
		String string = fileName.toString();
		System.out.println(string);

		return fileName;
		}

}
