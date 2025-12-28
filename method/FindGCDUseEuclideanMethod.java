package method;

import java.util.Scanner;

public class FindGCDUseEuclideanMethod {

	public static void main(String[] args) {
		
		FindGCDUseEuclideanMethod euclidean=new FindGCDUseEuclideanMethod();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a = scan.nextInt();
		System.out.print("Enter Number b:");
		int b = scan.nextInt();

		System.out.println("Euclidean GCD ("+a+","+b+") is :"+euclidean.findGcd(a, b));;
	}
	public int findGcd(int a,int b) {
		
		while(b!=0){
			
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}
