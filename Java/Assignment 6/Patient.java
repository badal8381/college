class Patient{
	String patientName;
	int patientAge;
	float patientOxyLevel;
	int patientHRCTReport;

	Patient(){
		patientName = "";
		patientAge = 0;
		patientOxyLevel = 0.0f;
		patientHRCTReport = 0;
	}

	Patient(String name, int age, float oxy_level, int report){
		patientName = name;
		patientAge = age;
		patientOxyLevel = oxy_level;
		patientHRCTReport = report;
	}

	void displayDetails(){
		System.out.println("\nPatient Details:");
		System.out.println("Patient Name: "+ patientName);
		System.out.println("Patient Age: "+ patientAge);
		System.out.println("Patient Oxygen Level: "+ patientOxyLevel);
		System.out.println("Patient HRCT Report: "+ patientHRCTReport);
	}
}

class CovidPositiveException extends Exception{
	CovidPositiveException(String message){
		super(message);
	}
}
