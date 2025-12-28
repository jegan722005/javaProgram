package method;

import java.util.Scanner;

public class checkPrimeNumOrNot {

	public static void main(String[] args) {
		
		checkPrimeNumOrNot prime=new checkPrimeNumOrNot();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		if(prime.isprime(num))
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is Not Prime Number");
		
	}
	public boolean isprime(int num) {
		
		if(num==0||num==1)
			return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
