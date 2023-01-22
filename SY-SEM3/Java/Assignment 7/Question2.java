import java.io.*;
import java.util.Scanner;

class Question2{
	public static void main(String[] args){
		try{
			File newFile = new File(args[0]);
			Scanner sc = new Scanner(newFile);

			int i = 1;
			while(sc.hasNext()){
				System.out.println(i + " " + sc.nextLine());
				i++;
			}
			sc.close();
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please pass filename as argument..");
		}catch(FileNotFoundException ffe){
			System.out.println("File not found..");
		}
	}

}
