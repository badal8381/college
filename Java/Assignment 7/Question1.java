import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;

class Question1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File newFile = new File(args[0]);
		
		// is it is a Directory
		if(newFile.isDirectory()){
			File files[] = newFile.listFiles();
			System.out.println(newFile.getName() + " is a Directory and it's contents are listed below..");
			for(int i=0; i<files.length; i++){
				System.out.println(files[i].getName());
			}
			System.out.println("Total "+ files.length + " files..");

			System.out.println("Do you want to delete .txt files..");
			System.out.println("1. Yes \n2. No");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			// checking .txt extension and deleting it
			if(choice == 1){
				for(int i=0; i<files.length; i++){
					String fileName = files[i].getName();
					int index = fileName.lastIndexOf('.');
					if(fileName.substring(index+1).compareTo("txt") == 0){
						files[i].delete();
					}
				}
				System.out.println("Deleted all .txt files..");
			}
		}

		// is it is a file
		if(newFile.isFile()){
			System.out.println(newFile.getName() + " is a File and it's details are listed below..");
			System.out.println("File Name: " + newFile.getName());
			System.out.println("File Size: " + newFile.length() + " bytes");

			SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
			System.out.println("File Attributes: " + dt.format(newFile.lastModified()));
		}
	}

}
