package method;

import java.util.Scanner;

public class print1to100num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter start:");
		int start=scan.nextInt();
		System.out.print("Enter end:");
		int end=scan.nextInt();
		
//		print1to100(start, end);
		
		for(int i=1;i<=10;i++) {
			for(int j=i;j<=100;j+=10) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	public static void print1to100(int start,int end) {
		
		for(int i=0;i<10;i++) {
			for (int j = start+i; j <=end; j+=10) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
/*Enter start:1
Enter end:100
1 11 21 31 41 51 61 71 81 91 
2 12 22 32 42 52 62 72 82 92 
3 13 23 33 43 53 63 73 83 93 
4 14 24 34 44 54 64 74 84 94 
5 15 25 35 45 55 65 75 85 95 
6 16 26 36 46 56 66 76 86 96 
7 17 27 37 47 57 67 77 87 97 
8 18 28 38 48 58 68 78 88 98 
9 19 29 39 49 59 69 79 89 99 
10 20 30 40 50 60 70 80 90 100 
*/
