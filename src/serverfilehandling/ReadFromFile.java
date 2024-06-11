package serverfilehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("example.txt"); 
				Scanner scanner = new Scanner(reader)) {
			System.out.println("Reading from the file:");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("An error occurred during reading from the file.");
			e.printStackTrace();
		}
	}

}
