import java.io.*;
import java.util.Scanner;

class Question3{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		File newFile = new File("city.txt");
		Scanner file;
		
		int choice;
		do{
			file = new Scanner(new FileInputStream(newFile));

			System.out.println("Menu: ");
			System.out.println("1. Search City Name and Display Pin Code:  ");
			System.out.println("2. Add a new city - pin code pair: ");
			System.out.print("Enter choice (-1 to stop): ");
			choice = sc.nextInt();

			switch(choice){
				case 1: System.out.print("Enter City name to Search: ");
					String name = sc.next().toLowerCase();
					int pincode = 0;
					try{
						while(file.hasNextLine()){
							String cityname = file.next().toLowerCase();
							if(cityname.compareTo(name) == 0){
								pincode = file.nextInt();
							}else{
								file.nextInt();
							}
						}
					}catch(Exception ex){
						file.reset();
					}

					if(pincode!=0){
						System.out.println("Pin Code: " + pincode);
						System.out.println();
					}else{
						System.out.println("City Not Found..");
						System.out.println();
					}
					file.close();
					file = null;
					break;

				case 2: System.out.print("Enter City Name: ");
					String cityname = sc.next();
					System.out.print("Enter Pin Code: ");
					pincode = sc.nextInt();

					try{
						FileWriter output = new FileWriter(newFile, true);
						output.write(cityname + " " + pincode + "\n");
						output.close();
					}catch(Exception e){
						System.out.println("Error Occured while writing..");
					}
					break;
			}
		}while(choice!=-1);
		file.close();
		sc.close();
	}
}
