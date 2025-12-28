package method;

import java.util.Scanner;

public class printSpyNumList {

	public static void main(String[] args) {
		
		printSpyNumList spylist=new printSpyNumList();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Spy num start:");
		int start=scan.nextInt();
		System.out.print("Enter Spy Num End:");
		int end=scan.nextInt();
		
		System.out.print("Spy Number :");
		for(int i=start;i<=end;i++) {
			
			if(spylist.checkSpyNum(i))
				System.out.print(i+" ");
		}
	}
	public boolean checkSpyNum(int num) {
		
		int sum=0,product=1;
		while(num>0) {
			int digit=num%10;
			
			sum+=digit;
			product*=digit;
			num/=10;
		}
		return sum==product;
	}
}
