package BankApp;

import java.util.Scanner;

public class UserInfo {

	static Scanner scan=new Scanner(System.in);
	static Account acc1=new Account("Sekar","01/04/2024", 123,2000,56789,1234); 
	static Account acc2=new Account("Nagaraja","10/06/2010", 123,200,56789,1234); 
	static Account acc3=new Account("Rajash","30/10/2014", 123,20,56789,1234); 
	static Account[] accounts= {acc1,acc2,acc3};
	static Bank bank=new Bank("Canara Bank", "IFSC 123ABS34", "VadaPalani", accounts);
	public void home() {
		boolean cond=true;
		do {
			System.out.println("\t\t**Welcome Home Page**");
			System.out.println("1.GetInfo\n2.SetInfo\n3.Exists\n");
			System.out.print("Select Your Info:");
			int select=scan.nextInt();
			switch(select) {
			case 1->{
				System.out.println("\t\t**GetInfo Page**");
				boolean con=true;
				do {
					System.out.print("1.Sekar\n2.NagaRaja\n3.Rajash\n4.Exist\n");
					System.out.print("Enter your Name:");
					int user_option=scan.nextInt();
					if(user_option==1)
					{
						getInfo(user_option);
						
					}else if(user_option==2) {
						getInfo(user_option);
						
					}else if(user_option==3) {
						getInfo(user_option);
						
					}else if(user_option==4)
						con=false;
				} while (con);
			}
			case 2->{
				System.out.println("\t\t**SetInfo Pages**");
				boolean condition=true;
				do {
					System.out.println("\t\t**User Page**");
					System.out.print("1.Sekar\n2.NagaRaja\n3.Rajash\n4.Exist\n");
					System.out.print("Select your Name:");
					int user_option=scan.nextInt();
					if(user_option==1)
					{
						setInfo(user_option);
						
					}else if(user_option==2) {
						
						setInfo(user_option);
						
					}else if(user_option==3) {
						
						setInfo(user_option);
						
					}else if(user_option==4)
						condition=false;
				} while (condition);
				
			}
			}
		} while (cond);
	}
	
	public void getInfo(int user) {
			
		boolean cod=true;
		do {
			
			System.out.println("\t\t**User GetInfo Pages**");
			System.out.println("1.Account Holder Name");
			System.out.println("2.Date Of Brith");
			System.out.println("3.Account Number");
			System.out.println("4.Account Balence");
			System.out.println("5.Contact");
			System.out.println("6.Pin Number:");
			System.out.println("7.Exist");
			System.out.println("Select your Info:");
			int option=scan.nextInt();
			if(option==1) {
				System.out.println(accounts[user-1].getAccount_holder_name());
			}
			else if(option==2) {
				System.out.println(accounts[user-1].getDob());
			}else if(option==3) {
				System.out.println(accounts[user-1].getAcc_no());
			}else if(option==4) {
				
				System.out.println(accounts[user-1].getBal());
			}else if(option==5) {
				
				System.out.println(accounts[user-1].getContact());
			}else if(option==6) {
				
				System.out.println(accounts[user-1].getPin());
			}
			else if(option==7)
				cod=false;
			
		} while (cod);
	}
	public void setInfo(int input) {
		boolean cod=true;
		do {
			
			System.out.println("\t\t**User setInfo Pages**");
			System.out.println("1.Account Holder Name");
			System.out.println("2.Contact");
			System.out.println("3.Pin Number:");
			System.out.println("4.Date Of Brith");
			System.out.println("5.Exist");
			System.out.println("Select your Info:");
			int option=scan.nextInt();
			if(option==1) {
				System.out.println("Enter New Name:");
				//scan.next();
				accounts[input-1].setAccount_holder_name(scan.next());
			}
			else if(option==2) {
				System.out.println("Enter New Contact :");
				//scan.nextLong();
				accounts[input-1].setContact(scan.nextLong());
			}else if(option==3) {
				System.out.println("Enter New Pin:");
				//scan.nextInt();
				accounts[input-1].setPin(scan.nextInt());
			}else if(option==4) {
				System.out.println("Enter New DOB:");
				//scan.nextLine();
				accounts[input-1].setDob(scan.nextLine());
			}else if(option==5)
				cod=false;
		
		} while (cod);
	}
	
}
