package AadharPortal;

import java.util.Scanner;

public class AadharPortal {

	Scanner scan=new Scanner(System.in);
	
	Aadhar card1=new Aadhar("Shekar", "Mumbi", "01/02/2007",12345, 56789);
	Aadhar card2=new Aadhar("Nagaraj"," Vadapalani", "12/03/2012",54321, 98765);
	Aadhar card3=new Aadhar("Rajash", "Goa", "30/04/2010", 98765, 12345);
	
	Aadhar cards[]= {card1,card2,card3};
	
	public void home() {
		boolean flag=true;
		do {
			System.out.println("\t\t***Welcome To Aadhar Protal***");
			System.out.println("1.Get UserInfo\n2.Set UserInfo\n3.Exist\n");
			System.out.print("Enter your Option:");
			int user_option=scan.nextInt();
			switch(user_option) {
			case 1->getInfo();
			case 2->setInfo();
			case 3->flag=false;
			}
			
		} while (flag);
		System.out.println("\t\tRedirecting To Admin Page... ");
	}
	
	public void getInfo() {
		
		boolean flag=true;
		do {
			System.out.println("\t\tGetInfo");
			System.out.println("\t********************");
			
			int input=show();
			switch(input+1) {
			case 1->{
				//shekar
				getUser(cards[input]);
			}
			case 2->{
				//Nagaraj
				getUser(cards[input]);
			}
			case 3->{
				//Rajesh
				getUser(cards[input]);
			}
			case 4->{
				flag=false;
			}
			}
		} while (flag);
		
	}
	public void getUser(Aadhar card) {
		boolean flag=true;
		do {
			
			System.out.println("\t\tGet "+card.getName()+" Info");
			System.out.println("Name\nLocation\nDate Of Brith\nContact\nAadharNo\n");
			
			System.out.println("\tName:"+card.getName());
			System.out.println("\tLocation :"+card.getLoc());
			System.out.println("\tDate Of Brith:"+card.getDob());
			System.out.println("\tContact:"+card.getContact());
			System.out.println("\tAadhar No:"+card.getAadhar_no());
			
			flag=false;
		} while (flag);
		System.out.println("\t\tRedirection To GetInfo...");
	}
	public void setInfo() {
		boolean flag=true;
		do {
			System.out.println("\t\tSetInfo");
			System.out.println("\t*********************");
			
			int input=show();
			switch(input+1) {
			case 1->{
				//shekar
				setUser(cards[input]);
			}
			case 2->{
				//Nagaraj
				setUser(cards[input]);
			}
			case 3->{
				//Rajesh
				setUser(cards[input]);
			}
			case 4->{
				flag=false;
			}
			}
		} while (flag);
	}
	
	public int show() {
		for(int i=0;i<cards.length;i++) {
			System.out.println(i+1+"."+cards[i].getName());
		}
		System.out.println(4+".Exit");
		System.out.print("Enter Here:");
		return scan.nextInt()-1;
	}
	
	

	public void setUser(Aadhar card) {
		
		boolean flag=true;
		do {
			System.out.println("\t\tSet "+card.getName()+" Info");
			System.out.println("1.Name\n2.Location\n3.Date Of Brith\n4.Contact\n5.Exist");
			System.out.print("Enter Option:");
			int user=scan.nextInt();
			switch(user) {
			case 1->{
				System.out.print("Enter New Name :");
				card.setName(scan.next());
			}
			case 2->{
				System.out.print("Enter New Location :");
				
				card.setLoc(scan.next());
			}
			case 3->{
				System.out.print("Enter New DOB :");
				card.setDob(scan.next());
			}
			case 4->{
				System.out.print("Enter New Contact :");
				card.setContact(scan.nextLong());
			}
			case 5->flag=false;
			}
			
		} while (flag);
	}
}

























