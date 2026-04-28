# FILE-HANDLING-UTILITY

COMPANY: CODTECH IT SOLUTIONS

NAME:RAHUL SANJAY THAKARE

INTERN ID:CTIS6516

DOMAIN:JAVA PROGRAMMING

DURATION:12 WEEKS

MENTOR:NEELA SANTOSH 

## File handaling in java means creating, reading, writing and deleting files. It is very useful when you want to store data permanently instead of keeping it only in memory. for example, saving user details,logs, or report in a file.
in java, file handaling is done using classes from the java.io package.
File handaling is important for to store data permanently, to read data later, to share data between programs, to maintain records.
The program first creates a text file if does not exist. it then allows the user to enter text that will be written into the file using FileWriter.
The program can also read the concepts of the file using FileReader and display them on the console. Aditionally, the file can be modified by adding or updating the existing content.
these operations demonstrate the basic file handaling capabilities provided by java.
CreateFile.java class is used to create a new text file.
package codtech.solution;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\FileHandaling\\filef1.text");
			if (myObj.createNewFile()) {
				System.out.println("File Created:"+ myObj.getName());
				
			} else {
				System.out.println("File already exists.");
			}
		}catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		

	}

}

WriteToFile.java class allows the user to write text into the file.
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
            String data = sc.nextLine();   

            myWriter.write(data);          
            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}
ReadFromFile.java class read the content of the text file and display it on the console.
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

            
            while (myReader.hasNextLine()) {   
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
ModifyFile.java class modifides the existing content of the file.
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

          
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                
                line = line.replaceAll(oldWord, newWord);

                content.append(line).append("\n");
            }

            reader.close();

            
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
It's Helps understand file handaling in java, Enables storing and retriving data from files, Demonstrates real-world programming, Easy to implement and modify.
In this programm have limitation like works only with text files, no graphical interface, requires manual input from the user.
The Project demonstrates the implementation of file handaling operations in java. The program successfully performs file creation,reading,writing and modification operation.
It helps in understanding how java interact with file and how data can be managed efficiently using file handling techniques.

##Output
[CODTECH.IT.SOLUTIONS.docx](https://github.com/user-attachments/files/27171264/CODTECH.IT.SOLUTIONS.docx)

<img width="1618" height="910" alt="Image" src="https://github.com/user-attachments/assets/7d31a1a1-df7e-4e8a-a1f1-571c68b11298" />

<img width="1617" height="911" alt="Image" src="https://github.com/user-attachments/assets/a4582f5b-7f03-4188-8c7b-3ef5daf28128" />
