class CMD{
	public static void main(String[] args){
		for(int i=0; i<args.length; i++){
			if(i==0)
				System.out.println((i+1)+"st Argument is: "+ args[i]);
			else if(i==1)
				System.out.println((i+1)+"nd Argument is: "+ args[i]);
			else if(i==2)
				System.out.println((i+1)+"rd Argument is: "+ args[i]);
			else
				System.out.println((i+1)+"th Argument is: "+ args[i]);
		}
		System.out.println("Number of Argument passed is: "+ args.length);
	}
}
