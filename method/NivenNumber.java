package method;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		
		NivenNumber niven=new NivenNumber();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = scan.nextInt();

		if (niven.NivenNumber(num))
			System.out.println(num + " is Niven Number");
		else
			System.out.println(num + " is Not Niven Number");
	}
	public boolean NivenNumber(int num) {
		
		int temp=num;
		int sum=0;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		return num%sum==0;
	}
}
