package method;

import java.util.Scanner;

public class checkHappyNumberOrNot {

	public static void main(String[] args) {
		
		checkHappyNumberOrNot happy=new checkHappyNumberOrNot();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		if(happy.checkNumHappy(num))
			System.out.println(num+" is Happy Number");
		else
			System.out.println(num+" is Not Happy Number");
	}
	public boolean checkNumHappy(int num) {
		
		while(num!=1 && num!=4) {
			int sum=0;
			while(num>0) {
				sum+=(num%10)*(num%10);
				num/=10;
			}
			num=sum;
		}	
		return num==1;
	}
}
