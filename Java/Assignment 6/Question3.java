class Question3{
	public static void main(String[] args){
		//Checking command line argument for exception
		try{
			EmailId e = new EmailId(args[0], args[1]);

			//Handling Username and password
			try{
				//Handling password exception
				try{
					if(e.password.length() < 8 )
						throw new InvalidPasswordException("Password is short..");
				}catch(InvalidPasswordException cpe){
					System.out.println(cpe);
				}
	
				//Handling username exception
				if(e.username.length() == 0)
					throw new InvalidUsernameException("Username is not valid..");
			}catch(InvalidUsernameException cue){
				System.out.println(cue);
			}
		}catch(Exception ex){
			System.out.println("Invalid number of arguments passed..");
			System.exit(0);
		}
	}
}
