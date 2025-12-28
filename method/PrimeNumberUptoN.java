package method;

import java.util.Scanner;

public class PrimeNumberUptoN {

	public static void main(String[] args) {
		
		PrimeNumberUptoN upton=new PrimeNumberUptoN();
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size Number :");
		int size = scan.nextInt();
		System.out.print("Enter Number :");
		int num = scan.nextInt();
		
		int count=1;
		while(count<=size) {
			if(upton.isPrime(num)) {
				System.out.println("Number Is Prime:"+num);
				count++;
			}
			num++;
		}
		
	}
	public boolean isPrime(int num) {
		
		if(num==0||num==1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true; 
	}
	
}
