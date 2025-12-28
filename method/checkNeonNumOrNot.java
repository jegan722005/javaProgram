package method;

import java.util.Scanner;

public class checkNeonNumOrNot {

	public static void main(String[] args) {
		
		checkNeonNumOrNot neon=new checkNeonNumOrNot();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		if(neon.checkNeonNum(num)) 
			System.out.println(num+" is Neon Number");
		else
			System.out.println(num+" is Not Neon Number");
	}
	public boolean checkNeonNum(int num) {
		
		int square=num*num;
		int sum=0;
		for(int i=square;i>0;i/=10) {
			sum+=i%10;
		}
		
		return sum==num;
	}
}
