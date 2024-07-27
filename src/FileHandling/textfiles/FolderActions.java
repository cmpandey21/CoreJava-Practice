package FileHandling.textfiles;

import java.io.File;

public class FolderActions {
	
	//CreateFolder
	public static void createFolder(String folderPath)
	{
		File folder=new File(folderPath);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder created at path "+ folderPath);
		}
	}
	
	//check if folder exists
	public static boolean checkFolderExists(String folderPath)
	{
		File folder=new File(folderPath);
	    return folder.exists();
		
	}
	
	//delete folder 
	public static void deleteFolder(String folderPath)
	{
		File folder=new File(folderPath);
		if(folder.exists())
		{
			for(File file:folder.listFiles())
			{
			file.delete();	
			}
			
			folder.delete();
			System.out.println("Folder deleted");
		}
	}

	public static void main(String[] args) {

		
		String path="C:\\Users\\HP\\Downloads\\File handling Test";
		createFolder(path);
		
		boolean folderExists=checkFolderExists(path);
		System.out.println(folderExists);
		
		deleteFolder(path);

	}

}
