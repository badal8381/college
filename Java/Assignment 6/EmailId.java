class EmailId{
	String username;
	String password;

	EmailId(){
		username = "";
		password = "";
	}

	EmailId(String username, String password){
		this.username = username;
		this.password = password;
	}
}

class InvalidUsernameException extends Exception{
	InvalidUsernameException(String message){
		super(message);
	}
}

class InvalidPasswordException extends Exception{
	InvalidPasswordException(String message){
		super(message);
	}
}
