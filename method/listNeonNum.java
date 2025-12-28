package method;

import java.util.Scanner;

public class listNeonNum {

	public static void main(String[] args) {
		
		listNeonNum neon=new listNeonNum();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Neon num start:");
		int start=scan.nextInt();
		System.out.print("Enter Neon Num End:");
		int end=scan.nextInt();
		System.out.print("Neon Num :");
		for(int i=start;i<=end;i++) {
			if(neon.neonNum(i))
				System.out.print(i+" ");
		}
	}
	public boolean neonNum(int num) {
		
		int square=num*num;
		
		int sum=0;
		while(square>0) {
			sum+=square%10;
			square/=10;
		}
		return sum==num;
	}
}
