package codtech.solution;
import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File myObj = new File("D:\\FileHandaling\\Filef1.text");
		if (myObj.exists()) {
			System.out.println("File name: "+ myObj.getName());
			System.out.println("Absolute path: "+ myObj.getAbsolutePath());
			System.out.println("Writeable: "+ myObj.canWrite());
			System.out.println("Readable "+ myObj.canRead());
			System.out.println("File Size in bytes " + myObj.length());
		}else {
			System.out.println("The File Does Not Exist.");
		}
		

	}

}
