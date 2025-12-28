package method;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		printTable table=new printTable();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start Number:");
		int start = scan.nextInt();
		System.out.print("Enter end Number:");
		int end = scan.nextInt();
		
		table.printTable(start, end);
		

	}
	public void printTable(int start,int end) {
		
		for (int i = 1; i <=10; i++) {
			for (int j = start; j <=end; j++) {
				
				System.out.print(i+"x"+j+"="+i*j+"		");
				
			}
			System.out.println();
		}
		
	}
}
