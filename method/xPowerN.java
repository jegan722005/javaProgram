package method;

import java.util.Scanner;

public class xPowerN {

	public static void main(String[] args) {
		xPowerN power=new xPowerN();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number N:");
		int n=scan.nextInt();
		System.out.print("Enter Number X:");
		int x=scan.nextInt();
		
		System.out.println(power.xpowerN(n, x));
		
	}
	public int xpowerN(int n,int x) {
		
//		int power=1;
//		
//		for(int i=1;i<=n;i++) {
//			power*=x;
//		}
//		return power;
		
		double power=Math.pow(x,n );
		
		return (int)power;
	}
}
