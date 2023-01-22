class Person{
	private String pname;
	private String address;
	private double mobileno;
	private String emailid;
	private final int uid;
	static int count;

	Person(){
		pname = "";
		address = "";
		mobileno = 0.0f;
		emailid = "";
		uid = 0;
		count++;
	}
	
	Person(String pname, String address, double mobileno, String emailid, int uid){
		this.pname = pname;
		this.address = address;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.uid = uid;
		count++;
	}

	void display(){
		System.out.println("Name : "+this.pname);
		System.out.println("Address : "+this.address);
		System.out.println("Mobile No : "+this.mobileno);
		System.out.println("Email ID : "+this.emailid);
		System.out.println("UID : "+this.uid);
	}
}
