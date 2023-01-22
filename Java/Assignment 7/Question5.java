import java.io.FileReader;
import java.io.IOException;

class Question5{
	public static void main(String[] args) throws IOException{
		FileReader input = null;
		try{
			input = new FileReader(args[0]);
			int c, count=0;
		
			while((c = input.read()) != -1 ){
				if(c == 32)
					count++;
			}
			System.out.println("Number of Whitespace characters are: "+count);
		
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please pass the filename as command line arguments...");	
		}finally{
			if(input != null)
				input.close();
		}

	}
}
