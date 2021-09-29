package com.java.files;

import java.io.*;

public class FolderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "\\\\pac9020201\\proj\\6050_PAC2\\SA-PAYABLES-DOC\\API Activity\\Caratulas Ready for Submission";
		File dir = new File(filePath);
		File[] files = dir.listFiles();
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
				
		files = dir.listFiles(fileFilter);

		if (files.length == 0) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString()+" - "+filename.toString().substring(filePath.length()+1, filename.toString().length()));
			}
		}
	}

}
