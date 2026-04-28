package codtech.solution;

import java.io.*;
import java.util.Scanner;

public class ModifyFile {

    public static void main(String[] args) {

        String filePath = "D:\\FileHandaling\\Filef1.txt";
        Scanner input = new Scanner(System.in);

        try {
            File file = new File(filePath);
            Scanner reader = new Scanner(file);

            System.out.print("Enter word to replace: ");
            String oldWord = input.nextLine();

            System.out.print("Enter new word: ");
            String newWord = input.nextLine();

            StringBuilder content = new StringBuilder();

            // Read file
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                // Replace old word with new word
                line = line.replaceAll(oldWord, newWord);

                content.append(line).append("\n");
            }

            reader.close();

            // Write modified content back
            FileWriter writer = new FileWriter(filePath);
            writer.write(content.toString());
            writer.close();

            System.out.println("File Modified Successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }

        input.close();
    }
}