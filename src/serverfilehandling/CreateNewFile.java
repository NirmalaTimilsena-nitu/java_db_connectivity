package serverfilehandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// File object
		File file = new File("example.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred during file creation.");
			e.printStackTrace();
		}
	} 
}