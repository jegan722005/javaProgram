package AadharPortal;

import java.util.Scanner;

public class Aadhar {

	Scanner scan=new Scanner(System.in);
	private String name,loc,dob;
	private long contact,aadhar_no;
	public Aadhar(String name, String loc, String dob, long contact, long aadhar_no) {
		
		this.name = name;
		this.loc = loc;
		this.dob = dob;
		this.contact = contact;
		this.aadhar_no = aadhar_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(doVerfication()) {
			this.name = name;
			System.out.println("\t\tUpdated Name ..");
		}
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		if(doVerfication()) {
			this.loc = loc;
			System.out.println("\t\tUpdated Location ..");
		}
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		if(doVerfication()) {
			this.dob = dob;
			System.out.println("\t\tUpdated Date Of Brith ..");
		}
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		if(doVerfication()) {
			this.contact = contact;
			System.out.println("\t\tUpdated Contact ..");
		}
	}
	public long getAadhar_no() {
		return aadhar_no;
	}
	
	public boolean  doVerfication() {
		System.out.println("\t\tVerfication Process.......");
		System.out.println("Enter Reg Contact "+name+ ":");
		long user_contact=scan.nextLong();
		if(user_contact==contact) {
			int otp=(int)(Math.random()*999+999);
			System.out.println("OTP:"+otp);
			System.out.print("Enter OTP :");
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
