class City{
	String name;
	int pincode;

	City(){
		name = "";
		pincode = 0;
	}
	
	City(String name, int pincode){
		this.name = name;
		this.pincode = pincode;
	}

	public static int searchCity(City arr[], String name){
		for(int i = 0; i< arr.length; i++){
			if(arr[i].name.compareTo(name) == 0){
				return arr[i].pincode;
			}
		}
		return 0;
	}

	public void display(){
		System.out.println("City Name: " + name);
		System.out.println("City Pin Code: " + pincode);
	}
}
