package method;

import java.util.Scanner;

public class listXylemNum {

	public static void main(String[] args) {
		
		listXylemNum xylem=new listXylemNum();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Xylem num start:");
		int start=scan.nextInt();
		System.out.print("Enter Xylem Num End:");
		int end=scan.nextInt();
		
		System.out.print("Xylem Number :");
		for (int i =start; i <=end; i++) {
			
			if(xylem.xyleamNum(i))
				System.out.print(i+" ");
		}
	}
	public boolean xyleamNum(int num) {
		
		int first_digit=num%10;
		num/=10;
		
		int mid_sum=0;
		while(num>10) {
			mid_sum+=num%10;
			num/=10;
		}
		int last_digit=num;
		
		int f_l_sum=first_digit+last_digit;
		
		return f_l_sum==mid_sum;
	}
}
