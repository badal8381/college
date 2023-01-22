import java.util.Date;
import java.text.SimpleDateFormat;

class DateFormat{
	public static void main(String[] args){
		Date d = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Current Date is: "+dt.format(d));
		
		dt = new SimpleDateFormat("MM-dd-YYYY");
		System.out.println("Current Date is: "+dt.format(d));
		
		dt = new SimpleDateFormat("EEEE MMMM dd YYYY");
		System.out.println("Current Date is: "+dt.format(d));
		
		dt = new SimpleDateFormat("EEE MMMM dd hh:mm:ss zz YYYY");
		System.out.println("Current Date and Time is: "+dt.format(d));
		
		dt = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss a Z");
		System.out.println("Current Date and Time is: "+dt.format(d));
		
		dt = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Current time is: "+dt.format(d));
		
		dt = new SimpleDateFormat("ww");
		System.out.println("Current week of year is: "+dt.format(d));
		
		dt = new SimpleDateFormat("W");
		System.out.println("Current week of month is: "+dt.format(d));
		
		dt = new SimpleDateFormat("DD");
		System.out.println("Current day of year is: "+dt.format(d));
	}
}
