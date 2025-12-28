package method;

import java.util.Scanner;

public class CheckAutomorphicNum {

	public static void main(String[] args) {
		
		CheckAutomorphicNum automorphic=new CheckAutomorphicNum();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num= scan.nextInt();
		
		if(automorphic.isAutomorphic(num))
			System.out.println(num+" is Automorphic Number");
		else 
			System.out.println(num+" is Not Automorphic Number");
		
	}
	public boolean isAutomorphic(int num) {
		
		//this logic also posible
		int sqr=num*num;
		String s1=String.valueOf(num);
		String s2=String.valueOf(sqr);
		
		return s2.endsWith(s1);
		
		
		//this logic also posible
		
//		int temp=num,count=0;
//		while(temp>0) {
//			count++;
//			temp/=10;
//		}
//		int sqr=num*num;
//		
//		int reminder=sqr%(int)(Math.pow(10, count));
//		
//		return reminder==num;
	}
	//1.count digit in number
	//2.square the number
	//3.take last digit of square
	//4.compare with original number
}
