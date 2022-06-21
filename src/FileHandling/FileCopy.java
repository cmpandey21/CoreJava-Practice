package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	// Copy a file and create a different file in same location
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCopy.CopyFile();
		System.out.println("*********Execution is Completed*******************");
	}

	public static void CopyFile() {
		File file = new File("C:\\Users\\USER\\Desktop\\New folder\\sample.pdf");
		File opfile = new File("C:\\Users\\USER\\Desktop\\New folder\\sampleNewCreated.pdf");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(opfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();

				} catch (IOException e) {
					e.printStackTrace();

				}
			}

			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();

				} catch (IOException e) {
					e.printStackTrace();

				}
			}

		}

	}
}