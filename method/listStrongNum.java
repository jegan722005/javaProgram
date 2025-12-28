package method;

import java.util.Scanner;

public class listStrongNum {

	public static void main(String[] args) {
		
		listStrongNum strong=new listStrongNum(); 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Strong num start:");
		int start=scan.nextInt();
		System.out.print("Enter Strong Num End:");
		int end=scan.nextInt();
		
		System.out.print("Strong Number :");
		for (int i = start; i <=end; i++) {
			
			if(strong.strongNum(i)) 
				System.out.print(i+" ");
		}
	}
	public boolean strongNum(int num) {
		
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
