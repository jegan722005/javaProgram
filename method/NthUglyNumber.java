package method;

import java.util.Scanner;

public class NthUglyNumber {

	public static void main(String[] args) {
		
		NthUglyNumber ugly=new NthUglyNumber();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=scan.nextInt();
		
		int count=0;
		int num=0;
		
		while(count<n) {
			num++;
			
			if(ugly.isUglyNumber(num))
				count++;
		}
		System.out.println(n+"th Ugly Number is :"+num);
	}
	public boolean isUglyNumber(int num) {
		if(num<=0)
			return false;
		
		while(num%2==0)
			num/=2;
		while(num%3==0)
			num/=3;
		while(num%5==0)
			num/=5;
		return num==1;
	}
}
