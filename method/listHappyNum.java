package method;

import java.util.Scanner;

public class listHappyNum {

	public static void main(String[] args) {
		
		listHappyNum happy=new listHappyNum();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Happy num start:");
		int start=scan.nextInt();
		System.out.print("Enter Happy Num End:");
		int end=scan.nextInt();
		
		System.out.print("Happy Number :");
		for(int i=start;i<=end;i++) {
			if(happy.checkHappyNum(i))
				System.out.print(i+" ");
		}
	}
	public boolean checkHappyNum(int num) {
		
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
