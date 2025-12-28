package method;

import java.util.Scanner;

public class listPerfactNumberOrNot {

	public static void main(String[] args) {
		
		listPerfactNumberOrNot perfact=new listPerfactNumberOrNot();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Start Number:");
		int start = scan.nextInt();
		System.out.print("Enter Start Number:");
		int end = scan.nextInt();
		
		for(int i=start;i<=end;i++) {
			
			if(perfact.checkPerfactOrNot(i))
				System.out.println(i+" ");
		}
	}
	public boolean checkPerfactOrNot(int num) {
		
		int sum=0;
		for (int i = 1; i <=num/2; i++) {
			
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}
}
