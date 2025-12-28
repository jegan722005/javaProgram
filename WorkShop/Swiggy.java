import java.util.*;
class Swiggy 
{
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("1.Buhari\n");
		System.out.print("2.A2B\n");
		System.out.print("3.Amma canteen\n");
		System.out.print("\t\t\tSelect The Hotal:");
		int hotal=scan.nextInt();
		System.out.println("\t\t\tProcessing..........");
		Thread.sleep(2000);
		switch (hotal)
		{
		case 1->{
			System.out.print("\t\t\tWelcome To Buhari Hotal\n");
			System.out.println("1.Mattan Briyani\n2.Chicken Briyani\n3.Prawn Briyani");
			System.out.print("\t\t\tSelect The Briyani:");
			int briyani=scan.nextInt();
			
			System.out.println("\t\t\tProcessing..........");
			Thread.sleep(2000);
			switch (briyani)
			{
			case 1->{
				
				System.out.println("Your Order In Mattan Briyani....");
				double price=250;
				System.out.println("Briyani price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Briyani price ="+price);
				System.out.println("Briyani Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.println("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.println("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.println("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 2->{
				
				System.out.println("Your Order In Chicken Briyani....");
				double price=180;
				System.out.println("Briyani price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Briyani price ="+price);
				System.out.println("Briyani Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					Thread.sleep(2000);
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.println("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.println("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.println("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}	
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 3->{
				
				System.out.println("Your Order In Prawn Briyani....");
				double price=350;
				System.out.println("Briyani price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Briyani price ="+price);
				System.out.println("Briyani Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					Thread.sleep(2000);
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.println("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.println("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			default->{
			System.out.println("Invalid Briyani Selection !");
			}
			
			}
		}
		case 2->{
			
			System.out.print("\t\t\tWelcome To A2B Hotal\n");
			System.out.println("1.Idle\n2.Dosa\n3.Sambar Rice");
			System.out.print("\t\t\tSelect Your Food:");
			int food=scan.nextInt();
			
			System.out.println("\t\t\tProcessing..........");
			Thread.sleep(2000);
			switch (food)
			{
			case 1->{
				
				System.out.println("Your Order In Idle....");
				double price=20;
				System.out.println("Idle price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Idle price ="+price);
				System.out.println("Idle Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.print("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 2->{
				
				System.out.println("Your Order In Dosa ....");
				double price=30;
				System.out.println("Dosa price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Dosa price ="+price);
				System.out.println("Dosa Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					Thread.sleep(2000);
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.println("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.println("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}	
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 3->{
				
				System.out.println("Your Order In Samber Rice...");
				double price=60;
				System.out.println("Samber Rice price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Samber Rice price ="+price);
				System.out.println("Samber Rice Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.print("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*9999+9999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			default->{
			System.out.println("Invalid Food Selection !");
			}
			
			}
			
		}
		case 3->{
			
			System.out.print("\t\t\tWelcome To Amma Canteen Hotal\n");
			System.out.println("1.Curd Rice\n2.Tomato Rice\n3.Sappathi");
			System.out.print("\t\t\tSelect The Briyani:");
			int rice=scan.nextInt();
			
			System.out.println("\t\t\tProcessing..........");
			Thread.sleep(2000);
			switch (rice)
			{
			case 1->{
				
				System.out.println("Your Order In Curd Rice....");
				double price=100;
				System.out.println("Curd Rice price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Curd Rice price ="+price);
				System.out.println("Curd Rice Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.print("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();		
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 2->{
				
				System.out.println("Your Order In Tomato Rice....");
				double price=80;
				System.out.println("Tomato Rice price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Tomato Rice price ="+price);
				System.out.println("Tomato Rice Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.print("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}	
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			case 3->{
				
				System.out.println("Your Order In Sappathi....");
				double price=50;
				System.out.println("Sappathi price ="+price);
				System.out.print("\t\t\tSelect The Quantity:");
				int qty=scan.nextInt();
				double bill=price*qty;
				System.out.println("Sappathi price ="+price);
				System.out.println("Sappathi Quantity ="+qty);
				System.out.println("Total Bill Ammount:"+bill);
				System.out.print("1.Order\n2.Cancal\n");
				System.out.print("\t\t\tConfirm Your Order:");
				int order_user=scan.nextInt();
				if(order_user==1){
					System.out.println("Pay Online only....");
					System.out.println("Redirect To Payment Gate...");
					System.out.println("Payment Method \n1.Gpay\n2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay_method=scan.nextInt();
					if(pay_method==1){
						System.out.println("\t\t\tYour choose Gpay......");
						System.out.print("\t\t\tEnter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						Thread.sleep(2000);
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else if(pay_method==2){
						System.out.println("Your choose PhonePay........");
						System.out.print("Enter Your Bill Ammount:");
						double amt_bill=scan.nextInt();
						if(amt_bill==bill){
							int otp_user=(int) (Math.random()*999+999);
							System.out.println(otp_user+" Four Digit Only 10 Miniues\n Next Later Resend OTP");
							Thread.sleep(3000);
							System.out.print("Enter Your OTP:");
							int otp=scan.nextInt();
							if(otp==otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Your Order placed......");
								System.out.println("******Thank you**********");
							}
							else if(otp!=otp_user){
								System.out.println("\t\tVerification .................");
								Thread.sleep(2000);
								System.out.println("Please Enter Correct OTP ! ");
							}
							
						}
						else if(amt_bill!=bill){
							System.out.println("Your Order is Cancel");
						}
					}
					else{
						System.out.println("wrg choose payment method....!");
					}
				}
				else if(order_user==2){
					System.out.println("Your Order Cancel------!");
				}
				else{
					System.out.println("Redirect pages...!");
				}
				
			}
			default->{
			System.out.println("Invalid Rice Selection !");
			}
			
			}
			
		}
		default->{
			System.out.println("Invalid Hotal Selection !");
		}
		
		}
	}
}
