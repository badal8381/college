import java.util.*;

class Question1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Total no of Objects to be created: ");
		int n = sc.nextInt();
		CricketPlayer cp[] = new CricketPlayer[n];

		for(int i=0; i<cp.length; i++){
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter no of innings played: ");
			int innings = sc.nextInt();
			System.out.print("Enter no of times not out: ");
			int notout = sc.nextInt();
			System.out.print("Enter total runs: ");
			int runs = sc.nextInt();

			cp[i] = new CricketPlayer(name, innings, notout, runs);
			CricketPlayer.avg(cp[i]);
		}
		System.out.println("Before Sorting...");
		for(int i = 0; i<cp.length; i++)
			cp[i].display();

		CricketPlayer.sortPlayer(cp);
		
		System.out.println("After Sorting...");
		for(int i = 0; i<cp.length; i++)
			cp[i].display();

		sc.close();
	}

}
