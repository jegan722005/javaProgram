package WorkShop;

import java.util.Scanner;

public class CupAndCuffee {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		Cup cup=Cup.getCup("Silver", "Block", 20,"Small Size" );
		Coffee cofe=Coffee.getCoffeeObj("Bru Coffee","Jegan", "Bru", "Hot", 2, 15); 
		
		boolean flag=true;
		do {
			
			System.out.println("1.Add Coffee\n2.Remove Coffee\n3.Is Cup Empty");
			System.out.println("4.Details Of Cup\n5.Details Of Coffee\n6.Exist");
			
			System.out.println("Select Option:");
			int option=scan.nextInt();
			
			switch(option) {
			
			case 1->cofe.InsertCoffee(cup);
			case 2->cofe.removeCoffee();
			case 3->System.out.println(cofe.isCupEmpty()?"Yes":"No");
			case 4->{
				System.out.println("\t\t****  Dteails Of Cup  ****");
				System.out.println("\t\tCup :"+cup.getCname());
				System.out.println("\t\tCup Color:"+cup.getColor());
				System.out.println("\t\tCup Price:"+cup.getPrice());
				System.out.println("\t\tCup Size:"+cup.getSize());
			}
			case 5->{
				System.out.println("\t\t***  Details Of Coffee ***");
				System.out.println("\t\tCoffee Nmae:"+cofe.getCname());
				System.out.println("\t\tOrder Name:"+cofe.getName());
				System.out.println("\t\tCoffee Power:"+cofe.getPower());
				System.out.println("\t\tCoffee Cool Or Hot:"+cofe.getCol_hot());
				System.out.println("\t\tCoffee Sucar Level:"+cofe.getSucar_level());
				System.out.println("\t\tCoffee Price:"+cofe.getPrice());
			}
			case 6->flag=false;
			}
		} while (flag);
	}
	
}
