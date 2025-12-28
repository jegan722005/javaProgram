package method;

import java.util.Scanner;

public class CoPrimeNumber {

	public static void main(String[] args) {

		CoPrimeNumber num = new CoPrimeNumber();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int a = scan.nextInt();
		System.out.print("Enter Number :");
		int b = scan.nextInt();

		if (num.isCoPrime(a, b))
			System.out.println(a +" and "+b + " is CoPrime Number");
		else
			System.out.println(a +" and "+b + " is Not CoPrime Number");
	}
	public boolean isCoPrime(int a,int b) {
		
		return gcd(a,b)==1;
	}
	public int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}
