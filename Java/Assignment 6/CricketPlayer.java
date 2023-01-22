class CricketPlayer{
	String name;
	int noOfInnings;
	int noTimesNotOut;
	int totalRuns;
	float batAvg;

	CricketPlayer(){
		name = "";
		noOfInnings = 0;
		noTimesNotOut = 0;
		totalRuns = 0;
		batAvg = 0.0f;
	}

	CricketPlayer(String name, int noOfInnings, int noTimesNotOut, int totalRuns){
		this.name = name;
		this.noOfInnings = noOfInnings;
		this.noTimesNotOut = noTimesNotOut;
		this.totalRuns = totalRuns;
		this.batAvg = 0.0f;
	}

	public static void avg(CricketPlayer cp){
		try{
			cp.batAvg = cp.totalRuns/(cp.noOfInnings-cp.noTimesNotOut);
		}catch(Exception ex){
			cp.batAvg = cp.totalRuns;
		}
	}

	public static void sortPlayer(CricketPlayer arr[]){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i].batAvg > arr[j].batAvg){
					CricketPlayer temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void display(){
		System.out.println("Name : "+ name);
		System.out.println("No of innings played : "+ noOfInnings);
		System.out.println("No of times not out : "+ noTimesNotOut);
		System.out.println("Total Runs : "+ totalRuns);
		System.out.println("Batting Average : "+ batAvg);
		System.out.println();
	}
}
