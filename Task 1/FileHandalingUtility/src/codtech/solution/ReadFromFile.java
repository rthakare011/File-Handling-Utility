package codtech.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        String filePath = "D:\\FileHandaling\\Filef1.txt";

        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);

            // Read file line by line
            while (myReader.hasNextLine()) {   // ✅ removed semicolon
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}