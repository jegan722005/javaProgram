package method;

import java.util.Scanner;

public class findLeepYearOrNot {

	public static void main(String[] args) {
		
		findLeepYearOrNot leap=new findLeepYearOrNot();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Year:");
		int year=scan.nextInt();
		
		if(leap.findLeapyear(year))
			System.out.println(year+" is leapYear");
		else
			System.out.println(year+" is Not LeapYear");
		
	}
	public boolean findLeapyear(int year) {
		
		if(year%400==0)
			return true;
		else if(year%4==0 && year%100!=0)
			return true;
		else
			return false;
	}
}
