package method;

import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		
		FindLCM lcm=new FindLCM();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a = scan.nextInt();
		System.out.print("Enter Number b:");
		int b = scan.nextInt();
		
		System.out.println("LCM ("+a+","+b+") is :"+lcm.findLcm(a, b));
	}
	public int findLcm(int a,int b) {
		
		//find gcd
		int gcd=0;
		int min=Math.min(a, b);
		for (int i = 1; i <=min; i++) {
			if(a%i==0&&b%i==0)
				gcd=i;
		}
		//find lcm is a and b value multiple gcd value
		
		int lcm=(a*b)/gcd;
		return lcm;
	}
}
