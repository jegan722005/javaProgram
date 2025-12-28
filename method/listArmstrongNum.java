package method;

import java.util.Scanner;

public class listArmstrongNum {

	public static void main(String[] args) {
		
		listArmstrongNum list=new listArmstrongNum();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Armstrong num start:");
		int start=scan.nextInt();
		System.out.print("Enter Armstrong Num End:");
		int end=scan.nextInt();
		
		System.out.print("Armstrong Number :");
		for (int i = start; i <=end; i++) {
			
			if(list.checkArmstrong(i))
				System.out.print(i+" ");
		}
	}
	
	public boolean checkArmstrong(int num) {
		
		int n=countDigit(num);
		int sum=0,temp=num;
		for(int i=num;i>0;i/=10) {
			
			int x=i%10;
			sum+=xpowerN(x, n);
		}
		return sum==temp;
		
	}
	public int countDigit(int num) {
		
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	public int xpowerN(int x,int n) {
		
		double power=Math.pow(x, n);
		
		return (int)power;
	}
	
}
