package BankApp;

import java.util.Scanner;

public class BankApp {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admin admin=new Admin();
		UserInfo userinfo=new UserInfo();
		
		System.out.println("\t\t**Welcome Page**");
		boolean flag=true;
		do {
			System.out.println("1.SignUp\n2.Login\n3.ForgetCrediential\n4.Exist\n");
			System.out.print("Enter Option:");
			int user_option=scan.nextInt();
			switch (user_option) {
			case 1-> {
				admin.SignUp();
			}
			case 2->{
				if(admin.Login())
					userinfo.home();
				}
			case 3->{
				admin.forgetCredential();
			}
			case 4->{
				System.out.println("\t\t**Thank You**");
				flag=false;
			}
			
			}
			
		} while (flag);
	}
	
}
