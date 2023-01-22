import java.util.*;

class Question2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Patient p = new Patient();
		try{
			System.out.print("Enter patient name: ");
			p.patientName = sc.next();
			System.out.print("Enter patient age: ");
			p.patientAge = sc.nextInt();
			System.out.print("Enter patient oxygen level: ");
			p.patientOxyLevel = sc.nextFloat();
			System.out.print("Enter patient HRCT report: ");
			p.patientHRCTReport = sc.nextInt();
			sc.close();

			if(p.patientOxyLevel < 95.0f && p.patientHRCTReport > 10)
				throw new CovidPositiveException("Patient is Covid Positive(+) and Need to Hospitalized..");
			else{
				p.displayDetails();
			}
		}catch(CovidPositiveException cpe){
			System.out.println(cpe);
		}

	}

}
