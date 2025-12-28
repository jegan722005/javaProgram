package AadharPortal;

import java.util.Scanner;

public class MainUI {

	static Scanner scan=new Scanner(System.in);
	public static void main(String args[]) {
		Admin admin=new Admin();
		AadharPortal protal=new AadharPortal();
		
		boolean flag=true;
		do {
			
			System.out.println("1.SignUp\n2.Login\n3.ForgetenCridential\n4.Exists");
			System.out.println("Enter Your Option:");
			int user_option=scan.nextInt();
			switch(user_option) {
			case 1->admin.signUp();
			case 2->{
				if(admin.login()) {
					protal.home();
				}
					
			}
			case 3->admin.forgettenCred();
			case 4->flag=false;
			}
		} while (flag);
	}
}
