package method;

import java.util.Scanner;

public class fibonaciSeries {

	public static void main(String[] args) {
		
		fibonaciSeries series=new fibonaciSeries();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = scan.nextInt();
		
		series.fibonaciSeries(num);
		
	}
	public void fibonaciSeries(int num) {
		
		int a=0,b=1,c=0;
		
		for (int i = 1; i <=num; i++) {
			
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
