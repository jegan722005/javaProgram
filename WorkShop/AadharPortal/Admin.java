package AadharPortal;

import java.util.Scanner;

public class Admin {

	int uid,pwd;
	long contact;
	boolean acc_exist;
	
	Scanner scan=new Scanner(System.in);
	public void signUp() {
		if(acc_exist) {
			System.out.println("\t\tAlredy Account Created ....");
		}
		else {
			System.out.print("Enter The UID:");
			uid=scan.nextInt();
			System.out.print("Enter The Password:");
			pwd=scan.nextInt();
			System.out.print("Enter The Contact:");
			contact=scan.nextLong();
			acc_exist=true;
			System.out.println("\t\tSignUp Successfully.....");
		}
	}
	public boolean login() {
		if(acc_exist) {
			System.out.print("Enter Your UID:");
			int user_uid=scan.nextInt();
			System.out.print("Enter Your Password:");
			int user_pwd=scan.nextInt();
			if(user_uid==uid && user_pwd==pwd) {
				
				System.out.println("\t\tLogin SuccessFully....");
				return true;
			}
			System.out.println("\t\tLogin Failed !!!!");
		}
		System.out.println("\t\t---Create Account To Login----");
		return false;
	}
	
	public void forgettenCred() {
		if(acc_exist) {
			if(doVerfication()) {
				System.out.print("Enter New UID:");
				uid=scan.nextInt();
				System.out.print("Enter New Password:");
				pwd=scan.nextInt();
				System.out.print("Enter New Contact:");
				contact=scan.nextLong();
				
				System.out.println("\t\tUpdated For DB...");
			}else
				System.out.println("\t\tVerfication Failed Admin Can't Modify in Credential !!!");
		}else
			System.out.println("\t\tCreate An Account To User Failure !!!");
	}
	
	public boolean  doVerfication() {
		System.out.println("\t\tVerfication Process.......");
		System.out.print("ENter Reg Contact:");
		long user_contact=scan.nextLong();
		if(user_contact==contact) {
			int otp=(int)(Math.random()*999+999);
			System.out.println("OTP:"+otp);
			System.out.print("Enter OTP:");
			int user_otp=scan.nextInt();
			if(otp==user_otp) {
				return true;
			}
			System.out.println("Invalid OTP !!!");
		}
		System.out.println("Verfication Failed!!!");
		return false;
	}
}
