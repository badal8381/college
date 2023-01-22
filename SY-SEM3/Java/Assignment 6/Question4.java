class Question4{
	public static void main(String[] args){
		//Checking command line argument for exception
		try{
			if(args.length < 5)
				throw new CheckArgumentException("invalid number of arguments passed");
			else{
				int sum = 0;
				for(int i = 0; i<args.length; i++){
					sum += Integer.parseInt(args[i]);
				}

				System.out.println("Sum: "+sum);
			}
		}catch(CheckArgumentException cae){
			System.out.println(cae);
			System.exit(0);
		}
	}
}
