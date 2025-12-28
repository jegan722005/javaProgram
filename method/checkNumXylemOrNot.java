package method;

import java.util.Scanner;

public class checkNumXylemOrNot {

	public static void main(String[] args) {
		checkNumXylemOrNot xylem=new checkNumXylemOrNot();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=scan.nextInt();
		
		if(xylem.checkXylem(num))
			System.out.println(num+" is Xylem Number");
		else
			System.out.println(num+" is Not Xylem Number");
		
	}
	public boolean checkXylem(int num) {
		
		int last_digit=num%10;
		num/=10;
		
		int mid_digit=0;
		while(num>10) {
			mid_digit+=num%10;
			num/=10;
		}
		int first_digit=num;
		
		int f_l_digit=last_digit+first_digit;
		
		return mid_digit==f_l_digit;
	}
}
