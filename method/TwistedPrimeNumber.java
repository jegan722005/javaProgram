package method;

import java.util.Scanner;

public class TwistedPrimeNumber {

	public static void main(String[] args) {
		
		TwistedPrimeNumber twisted=new TwistedPrimeNumber();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();
		
		int rev=twisted.reverse(num);
		
		if(isPrime(num) && isPrime(rev))
			System.out.println(num+" is Twisted Prime Number");
		else
			System.out.println(num+" is Not Twisted Prime Number");
		
		
	}
	public int reverse(int num) {
		
		int rev=0;
		while(num>0) {
			rev=(rev*10)+(num%10);
			num/=10;
		}
		return rev;
	}
	static boolean isPrime(int num) {
		
		if(num==0||num==1)
			return false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
