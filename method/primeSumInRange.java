package method;

import java.util.Scanner;

public class primeSumInRange {

	public static void main(String[] args) {
		
		primeSumInRange range=new primeSumInRange();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Start Number:");
		int start=scan.nextInt();
		System.out.print("Enter End Number:");
		int end=scan.nextInt();
		
		System.out.println("Total Sum Of Prime:"+range.primeSumRange(start, end));
		
	}
	public int primeSumRange(int start,int end) {
		
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			if(isprime(i))
				sum+=i;
		}
		return sum;
	}
	public boolean isprime(int num) {
		
		if(num==0||num==1)
			return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
