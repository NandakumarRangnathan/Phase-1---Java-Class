package com.simplilearn.locker.java.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager {

	public static List<String> getFilesList(String filePath) {

		// Variable declaration
		List<String> al = new ArrayList<String>();

		// Creating File Object
		File fileList = new File(filePath);

		// Getting list of files available in folder
		String[] listOfFiles = fileList.list();

		// looping through file array
		for (String file : listOfFiles)
			al.add(file);

		Collections.sort(al);

		return al;
	}

	public static boolean createFile(String fileName, String filePath) {

		File file = new File(filePath, fileName);
		boolean isFielCreated = false;

		try {
			if (file.createNewFile())
				isFielCreated = true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isFielCreated;
	}

	public static boolean writeToFile(String path, String fileName, List<String> fileContent) {

		try {
			File f = new File(path, fileName);
			FileWriter fw = new FileWriter(f);

			if (!f.exists())
				f.createNewFile();

			for (String s : fileContent) {
				if (s.length() > 0)
					fw.write(s + "\n");
			}

			fw.close();
			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public static boolean appendToFile(String path, String fileName, List<String> fileContent) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(path + "\\" + fileName, true));
			fileContent.forEach((n) -> {
				try {
					if (n.length() > 0)
						out.write(n + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			// out.write(str);
			out.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	public static boolean removeFile(String filePath, String fileName) {

		File fl = new File(filePath + "\\" + fileName);

		try {

			if (fl.delete())
				return true;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	public static boolean serchFile(String filePath, String fileName) {

		File fl = new File(filePath + "//" + fileName);

		try {

			if (fl.exists())
				return true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public static List<String> displayFileContent(String filePath, String fileName){
		
		 BufferedReader br;
		 List<String> al = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(filePath + "//" + fileName));
			 String line;
				while ((line = br.readLine()) != null) {
				   al.add(line);
				 }
			 
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return al;
	}

}
