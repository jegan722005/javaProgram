package BankApp;

import java.util.Scanner;

public class Admin {

	int uid;
	long contact;
	int pwd;
	boolean acc_exist;
	static Scanner scan=new Scanner(System.in);
	public void SignUp() {
		if(acc_exist) {
			System.out.println("\t\tAccount Alredy Created.....\n");
		}
		else {
		System.out.print("Enter Your UID:");
		uid=scan.nextInt();
		System.out.print("Enter Your Contact:");
		contact=scan.nextLong();
		System.out.print("Enter Your PassWord:");
		pwd=scan.nextInt();
		acc_exist=true;
		System.out.println("\t\tSignUp SuccessFully....\n");
		}
	}
	
	public boolean Login() {
		if(acc_exist) {
			System.out.print("Enter UID:");
			int user_uid=scan.nextInt();
			System.out.print("Enter Password:");
			int user_pwd=scan.nextInt();
			
			if(user_uid==uid && pwd==user_pwd) {
				System.out.println("\t\tLogin SuccessFully.....\n");
				return true;
			}
			else
				System.out.println("\t\tLogin Failed!!!\n");
		}
		else {
			System.out.println("\t\tCreate Account TO Login...\n");
		}
		return false;
	}
	
	public boolean forgetCredential() {
		if(acc_exist) {
		if(doVerfication()) {
			System.out.print("\t\tEnter New UID:");
			uid=scan.nextInt();
			System.out.print("Enter New Contact:");
			contact=scan.nextLong();
			System.out.print("\t\\tEnter New PassWord:");
			pwd=scan.nextInt();
			
			System.out.println("\t\tUpdated Successfully....\n");
			acc_exist=true;
		}
		System.out.println("\t\tNot Updated........");
		}else
			System.out.println("\t\tCreate An Your Account to Forgetted...\n");
		return false;
	}
	
	public boolean doVerfication() {
	
		System.out.println("\t\tVerfication Process.....\n.");
		System.out.print("\t\tEnter Old Contact:");
		long user_contact=scan.nextLong();
		if(contact==user_contact) {
			int otp=(int)(Math.random()*999+999);
			System.out.println("OTP"+otp);
			System.out.print("Enter OTP:");
			int user_otp=scan.nextInt();
			if(otp==user_otp) {
				return true;
			}else
				System.out.println("\t\tWorng OTP!!\n");
			return false;
		}
		System.out.println("\t\tVerfication Failed!!!\n");
		return false;
	}	
}
