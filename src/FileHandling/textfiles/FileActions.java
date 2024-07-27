package FileHandling.textfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

	// create txt file
	public static void createFile(String filePath) {
		File fileObj = new File(filePath);

		try {
			if (fileObj.createNewFile()) {
				System.out.println("File Created:" + fileObj.getName());
			} else {
				System.out.println("File already exists.");

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	//write data in file
	public static void writeFile(String filePath)
	{
		
		 
		try {
			FileWriter	mywriter = new FileWriter(filePath);
		
		mywriter.write("Writing into the file some random dataOracle aadawIracOracle"
				+ "\nrandom data in file"
				+"\nasafafasfaf"
				+"\nasdasdaOracle");
		mywriter.close();
		System.out.println("Successfully write in the file....");
		}
		
		catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
   //Read from the file
	public static void readFile(String filePath)
	{
		try {
			File fileObj=new File(filePath);
			Scanner myReader = new Scanner(fileObj);
			int count=0;
			while(myReader.hasNext())
			{
				String data =myReader.nextLine();
				if(data.toLowerCase().contains("oracle".toLowerCase()))
				{
					count++;
				}
			}
			System.out.println(count);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error has occured...");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {

		String filepath="C:\\Users\\HP\\Documents\\Study\\myfiles.txt";
		createFile(filepath);
		writeFile(filepath);
		readFile(filepath);
	}

}
