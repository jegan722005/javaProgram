package BankApp;

import java.util.Scanner;

public class Account {

	Scanner scan=new Scanner(System.in);
	private String account_holder_name,dob;
	private long acc_no;
	private double bal;
	private long contact;
	private int pin;
	
	public Account(String account_holder_name, String dob, long acc_no, double bal, long contact, int pin) {
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.acc_no = acc_no;
		this.bal = bal;
		this.contact = contact;
		this.pin = pin;
	}

	//Helper Method
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public String getDob() {
		return dob;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public double getBal() {
		return bal;
	}
	public long getContact() {
		return contact;
	}
	public int getPin() {
		return pin;
	}
	public void setAccount_holder_name(String account_holder_name) {
		System.out.println("Enter the Pin:");
		int user_pin=scan.nextInt();
		if(user_pin==pin) 
			this.account_holder_name = account_holder_name;
	}
	public void setDob(String dob) {
		System.out.println("Enter the Pin:");
		int user_pin=scan.nextInt();
		if(user_pin==pin) 
			this.dob = dob;
	}
	public void setContact(long contact) {
		System.out.println("Enter the Pin:");
		int user_pin=scan.nextInt();
		if(user_pin==pin) 
			this.contact = contact;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double checkBalance() {
		System.out.println("Enter the Pin:");
		int user_pin=scan.nextInt();
		if(user_pin==pin) 
			return bal;
		else
			System.out.println("Invalid Pin!!");
			
		return 0.0;	
	}
	public void deposite(double d) {
		System.out.print("\t\tEnter Your Depostie Ammout:");
		double de_ammount=scan.nextDouble();
		d+=de_ammount;
		System.out.println("\t\tTotal Ammount:"+d);
	}
	public void withdrow(double w) {
		System.out.println("Enter the Pin:");
		int user_pin=scan.nextInt();
		if(user_pin==pin) {
			
			System.out.print("\t\tEnter Your Withdrow Ammout:");
			double drow_ammount=scan.nextDouble();
			w-=drow_ammount;
			System.out.println("\t\tWithdrow Successfully ...");
		}
		else
			System.out.println("Invalid Pin!!");
	}
	
	
	public void detailsOfAccount() {
		System.out.println("Account Holder Name:"+account_holder_name);
		System.out.println("Account Number:"+acc_no);
		System.out.println("Account Data Of Brith:"+dob);
		System.out.println("Account Balance:"+bal);
		System.out.println("Account Contact:"+contact);
		System.out.println("Account Pin Number:"+pin);
	}	
}