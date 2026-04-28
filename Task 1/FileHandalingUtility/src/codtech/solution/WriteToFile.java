package codtech.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) {

        String filePath = "D:\\FileHandaling\\Filef1.txt";
        Scanner sc = new Scanner(System.in);

        try {
        	
            FileWriter myWriter = new FileWriter(filePath);

            System.out.println("Enter text to write in file:");
            String data = sc.nextLine();   // User input

            myWriter.write(data);          // Write user text
            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}