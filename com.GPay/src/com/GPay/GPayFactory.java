package com.GPay;

import java.util.Scanner;

public class GPayFactory 
{
	static GPay gp = new GPay();
	
	public void welcome()
	{
		System.out.println("============================");
		System.out.println("Welcome to Google Pay");
		System.out.println("============================");
		first();
	}
	
	public  void first()
	{
		int count = 0;
//		GPay gp = new GPay();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the 4 Digit Pin you want keep for GPay");
		int pin = sc.nextInt();
		
		int pin2 = pin;
		while(pin2>0)
		{
			count++;
			pin2/=10;
		}
		if(count == 4)
		{
			System.out.println("Enter the Pin again");
			int pin1 = sc.nextInt();
			gp.setgPin(pin);
			if(pin == pin1) 
			{
				
				System.out.println("Pin set Successfully");
				second();
			}
			else
			{
				System.out.println("Pin does not match");
				System.out.println("============================");
				first();
			}
		}
		else
		{
			System.out.println("Plese Enter a 4 digit Pin");
			System.out.println("============================");
			first();
		}
	}

	
	public  void second()
	{
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
//		System.out.println(gp.getgPin());
		while(count<3)
		{
			count++;
			System.out.println("Enter the 4 Digit Pin");
			int pin = sc.nextInt();
			if(pin == gp.getgPin())
			{
				System.out.println("============================");
				System.out.println("Welcome to Google Pay");
				System.out.println("============================");
				upi();
			}
			else
			{
				System.out.println("Invaid Pin \nYou have "+(3-count)+" more chances");
				
			}
		}
		
		if(count==3)
		{
			System.out.println("Your Account is Locked for further 24 hours");
			System.exit(0);
		}
	}
	
	
	public  void upi()
	{
		int count = 0;
//		GPay gp = new GPay();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the 6 Digit Pin you want keep for UPI");
		int pin = sc.nextInt();
		int pin2 = pin;
		while(pin2>0)
		{
			count++;
			pin2/=10;
		}
		if(count == 6)
		{
			System.out.println("Enter the Pin again");
			int pin1 = sc.nextInt();
			
			if(pin == pin1) 
			{
				gp.setUpiPin(pin);
				System.out.println("Pin set Successfully");
				third();
			}
			else
			{
				System.out.println("Pin does match");
				System.out.println("============================");
				upi();
			}
		}
		else
		{
			System.out.println("Plese Enter a 6 digit Pin");
			System.out.println("============================");
			upi();
		}
	}
	
//	public static void upiSecond()
//	{
//		int count = 0;
//		GPay gp = new GPay();
//		Scanner sc = new Scanner(System.in);
//		while(count<3)
//		{
//			count++;
//			System.out.println("Enter the 6 Digit Pin");
//			int pin = sc.nextInt();
//			if(pin == gp.getUpiPin())
//			{
//				third();
//			}
//			else
//			{
//				System.out.println("Invaid Pin \n You have "+(3-count)+" more chances");
//				
//			}
//		}
//		
//		if(count==3)
//		{
//			System.out.println("Your Account is Locked for further 24 hours");
//		}
//	}
	
	
	public  void third()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for SBI Bank \nPress 2 for ICICI Bank \nPress 3 for Canara Bank \nPress any other key to exit");
		int press = sc.nextInt();
		switch (press) {
		case 1:GPayBank.sbi();
			break;
		case 2 : GPayBank.icici();
			break;
		case 3 : GPayBank.canara();
			break;
		default:System.exit(0);
			break;
		}
	}
	
	public static void upiValidate()
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count<3)
		{
			
//			System.out.println(gp.getUpiPin());
			System.out.println("Enter the 6 Digit UPI Pin");
			int pin = sc.nextInt();
			if(pin != gp.getUpiPin())
			{
				System.out.println("Plese Enter the Correct Pin");
				count++;
			}
			else
			{
				break;
			}
			if(pin == gp.getUpiPin())
			{
				break;
			}
			
		}
		
		if(count>=3)
			{
				System.out.println("Your Account is Locked for further 24 hours");
				System.exit(0);
			}
	}
}




//class GpayAccess
//{
//	public int getUpiPin(GPay pin) 
//	{
//		return pin.getUpiPin();
//		
//	}
//}
