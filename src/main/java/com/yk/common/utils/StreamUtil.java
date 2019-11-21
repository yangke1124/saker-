package com.yk.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtil {
	@Test
	public static void closeAll(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file);
			int read = fis.read();
			byte[] by = new byte[2048];
			int len = 0;
			for (byte b : by) {
				fos.write(by, 0, len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO 实现代码
	}

	@Test
	public static String readTextFile(InputStream src) {
		// TODO 实现代码
		File file = new File("D:/360zip");
		boolean directory = file.isDirectory();
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
		return null;
	}

	@Test
	public static String readTextFile(File txtFile) {
		// TODO 实现代码
		return null;
	}

}
