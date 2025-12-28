package method;

import java.util.Scanner;

public class checkStrongNumberOrNot {

	public static void main(String[] args) {
		
		checkStrongNumberOrNot strong=new checkStrongNumberOrNot();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		if(strong.checkStrongNum(num)) 
			System.out.println(num+" is Strong Number");
		else
			System.out.println(num+" is Not Strong Number");
		
	}
	public boolean checkStrongNum(int num) {
		int sum=0,temp=num;
		while(num>0) {
			int digit=num%10;
			sum+=findFactorial(digit);
			num/=10;
		}
		return sum==temp;
	}
	
	public int findFactorial(int num) {
		
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
}
