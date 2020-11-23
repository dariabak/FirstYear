import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
	int day;
	int monthNumber;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a day [1...31]: ");
	day = in.nextInt();
	System.out.println("Enter a month [1...12]: ");
	monthNumber = in.nextInt();
	
	
	String monthName = " ";
	boolean longMonths = false;
	boolean shortMonths = false;
	boolean february = false;
	 
	switch(monthNumber) {
		case 1:
			monthName = "January";
			longMonths = true;
			break;
	       
		case 2:
		    monthName = "February";
		    february = true;
			break;
			
		case 3:
			monthName = "March";
			longMonths = true;
			break;
		
		case 4:
			monthName = "April";
			shortMonths = true;
			break;
		
		case 5:
			monthName = "May";
			longMonths = true;
			break;
			
		case 6:
			monthName = "June";
			shortMonths = true;
			break;
		
		case 7:
			monthName = "July";
			longMonths = true;
			break;
			
		case 8:
			monthName = "August";
			longMonths = true;
			break;
			
		case 9:
			monthName = "September";
			shortMonths = true;
			break;
			
		case 10: 
			monthName = "October";
			longMonths = true;
			break;
			
		case 11: 
			monthName = "November";
			shortMonths = true;
			break;
			
		case 12:
			monthName = "December";
			longMonths = true;
			break;
			
		default: 
			System.out.println("Incorrect month");
			
	}
	if (longMonths == true) {
		if (day > 31 || day <= 0) {
			System.out.println(day + " is not valid for " + monthName);
		} else {
		System.out.println(day + " is valid for " + monthName);
		}
	}
	
	if (shortMonths == true) {
		if (day > 30 || day <= 0) {
			System.out.println(day + " is not valid for " + monthName);
		} else {
		System.out.println(day + " is valid for " + monthName);
		}
	}
	
	if (february == true) {
		int year;
		System.out.println("Enter a year: ");
		year = in.nextInt();
	
		if ((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0) {
			if (day > 29 || day <= 0) {
				System.out.println(day + " is not valid for " + monthName);
			} else {
				System.out.println(day + " is valid for " + monthName);
			} 
		} else {
			if (day > 28 || day <= 0) {
				System.out.println(day + " is not valid for " + monthName);
			} else {
				System.out.println(day + " is valid for " + monthName);
			} 
		}
		}
	
	in.close();
	}

	
}


