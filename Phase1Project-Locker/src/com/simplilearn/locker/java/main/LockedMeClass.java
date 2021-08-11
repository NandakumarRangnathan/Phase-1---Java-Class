package com.simplilearn.locker.java.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LockedMeClass {

	static final String folderPath = "C:\\Needs\\Simplilearn\\Phase1Project-Locker\\src\\com\\simplilearn\\locker\\java\\files";

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		String fileName;
		int lineCount, performOperation;
		boolean isDeleted = false, isCreated = false, isAvailable = false, needToContinue = false, isWritten = false;
		List<String> content = new ArrayList<String>();

		String welcomeMessage = "    " + "\n----------------------------------------------------"
				+ "\n|                                                  |"
				+ "\n|     Welcome to Company Lockers Pvt Ltd           |"
				+ "\n|   Menu Options provided by LockedMe.com          |"
				+ "\n|                                                  |"
				+ "\n|   1. Create a New File                           |"
				+ "\n|   2. Write Contents to File                      |"
				+ "\n|   3. Append to contents to File                  |"
				+ "\n|   4. Search for a File                           |"
				+ "\n|   5. Display Contents of a File                  |"
				+ "\n|   6. Delete a File                               |"
				+ "\n|   7. List all File Availble in Folder            |"
				+ "\n|   8. Exit                                        |"
				+ "\n|                                                  |"
				+ "\n----------------------------------------------------";

		do {

			try {
				System.out.println(welcomeMessage);

				System.out.println("Enter the operation to be performed : ");
				performOperation = obj.nextInt();

				switch (performOperation) {

				case 1:
					// Creating a New file in the location.
					System.out.println("Enter File Name to be created : ");
					fileName = obj.next();

					isCreated = FileManager.createFile(fileName, folderPath);

					if (isCreated)
						System.out.println("File created with name : " + fileName);

					needToContinue = toBeConitnued(obj);

					break;

				case 2:
					// Writting contents to the file which user secified
					System.out.println("Enter the file Name to write the contents to it : ");
					fileName = obj.next();

					System.out.println("Enter the number of lines to be written to File : ");
					lineCount = obj.nextInt();

					System.out.println("Enter the content : ");
					for (int i = 0; i <= lineCount; i++) {
						content.add(obj.nextLine());
					}

					isWritten = FileManager.writeToFile(folderPath, fileName, content);

					if (isWritten)
						System.out.println("Written the contents the File");
					else
						System.out.println("Not written to the file");

					needToContinue = toBeConitnued(obj);
					break;

				case 3:
					System.out.println("Enter the file Name to append the contents to it : ");
					fileName = obj.next();

					System.out.println("Enter the number of lines to be appended to File : ");
					lineCount = Integer.parseInt(obj.next());

					System.out.println("Enter the content of line : ");
					for (int i = 0; i <= lineCount; i++) {
						content.add(obj.nextLine());
					}

					if (FileManager.serchFile(folderPath, fileName))
						isWritten = FileManager.appendToFile(folderPath, fileName, content);

					if (isWritten)
						System.out.println("Written the contents the File");
					else
						System.out.println("We dont find the file to append the content");

					needToContinue = toBeConitnued(obj);
					break;
				case 4:
					// Searching a File
					System.out.println("Enter the file name to be searched : ");
					fileName = obj.next();

					isAvailable = FileManager.serchFile(folderPath, fileName);
					if (isAvailable)
						System.out.println("File is present in the folder");
					else
						System.out.println("File not present in the folder");

					needToContinue = toBeConitnued(obj);
					break;

				case 5:
					// Displaying content a File
					System.out.println("Enter the file name to be displayed : ");
					fileName = obj.next();

					isAvailable = FileManager.serchFile(folderPath, fileName);
					if (isAvailable) {

						List<String> diplayList = FileManager.displayFileContent(folderPath, fileName);

						if (diplayList.isEmpty()) {
							System.out.println("File has no content to disply Now");
						} else {
							diplayList.forEach((n) -> System.out.println(n));
						}
					} else
						System.out.println("File not present in the folder");

					System.out.println("\n");

					needToContinue = toBeConitnued(obj);
					break;

				case 6:
					// File to be deleted.
					System.out.println("Enter the file name to be deleted : ");
					fileName = obj.next();

					isDeleted = FileManager.removeFile(folderPath, fileName);
					if (isDeleted)
						System.out.println(fileName + " - File deleted successfully");
					else
						System.out.println("We dont see file named :" + fileName);

					needToContinue = toBeConitnued(obj);
					break;

				case 7:
					// Getting List of Files in the Folder in ascending order.
					List<String> fileList = FileManager.getFilesList(folderPath);

					if (!fileList.isEmpty()) {
						System.out.println("Files available in the folder are below : ");
						fileList.forEach((n) -> System.out.println(n));
					} else {
						System.out.println("Folder is empty.");
					}
					needToContinue = toBeConitnued(obj);
					break;

				case 8:
					System.exit(0);
					needToContinue = false;
					break;

				default:
					System.out.println("You have provided a wrong option.");
					needToContinue = toBeConitnued(obj);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please input a valid Menu option to perform");
				main(args);
			}

		} while (needToContinue);

	}

	public static boolean toBeConitnued(Scanner obj) {

		System.out.println("Do you want to Continue : Yes or No");
		String userInput = obj.next();
		if (userInput.equalsIgnoreCase("Yes"))
			return true;
		else
			return false;
	}

}
