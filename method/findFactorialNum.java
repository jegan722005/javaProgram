package method;

import java.util.Scanner;

public class findFactorialNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENter Number:");
		int n = scan.nextInt();
		
		System.out.println("Factorial="+findFactorial(n));
		
	}
	public static int findFactorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
}
