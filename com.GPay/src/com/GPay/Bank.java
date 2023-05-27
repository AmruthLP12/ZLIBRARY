package com.GPay;

import java.util.Scanner;

public abstract class Bank 
{
	abstract void balance();
	abstract void transfer();
	GPay gp = new GPay();
//	GPayFactory gpf = new GPayFactory();
//	GpayAccess gpf = new GpayAccess();
//	int gupipin = gpf.getUpiPin(gp);
}

class SBI extends Bank
{
	static int balance = 5000;           
	
	@Override
	void balance() 
	{
//		int count = 0;
		Scanner sc = new Scanner(System.in);
		GPayFactory.upiValidate();		
		System.out.println("Balance Amount is : "+balance);
	}

	@Override
	void transfer() 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Plese Enter the 10 digit Phone Number");
			long ph = sc.nextLong();
			while(ph>0)
			{
				count++;
				ph/=10;
//				break;
				if(count==10)
				{
					break;
				}
			}
			if(count!=10)
			{
				System.out.println("Invaid Phone Number \nPlease Enter number Range of 10 digit");
			}
			if(count==10)
			{
				GPayFactory.upiValidate();
				System.out.print("Enter the You want to transfer : ");
				int amt = sc.nextInt();
				if(amt<=balance)
				{
					System.out.println(amt + "tranfer Suceesfull");
					System.out.println("Balance Amount is :" + (balance-amt));
					balance = balance-amt;
				}
				else
				{
					System.out.println("Insufficent Balance");
				}
				break;
			}
		
		}
	}
	
	}


class ICICI extends Bank
{
	static int balance = 10000;
	@Override
	void balance() 
	{
		Scanner sc = new Scanner(System.in);
		GPayFactory.upiValidate();		
		System.out.println("Balance Amount is : "+balance);
		
	}

	@Override
	void transfer() 
	{
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Plese Enter the Phone Number");
			long ph = sc.nextLong();
			while(ph>0)
			{
				count++;
				ph/=10;
				if(count==10)
				{
					break;
				}
			}
			if(count==10)
			{
				GPayFactory.upiValidate();
				System.out.print("Enter the You want to transfer : ");
				int amt = sc.nextInt();
				if(amt<=balance)
				{
					System.out.println(amt + "tranfer Suceesfull");
					System.out.println("Balance Amount is :" + (balance-amt));
					balance = balance-amt;
				}
				else
				{
					System.out.println("Insufficent Balance");
				}
				break;
			}
		}
	}
	
}

class Canara extends Bank
{
	static int balance = 15000;
	@Override
	void balance() 
	{
		Scanner sc = new Scanner(System.in);
		GPayFactory.upiValidate();		
		System.out.println("Balance Amount is : "+balance);		
	}

	@Override
	void transfer() 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Plese Enter the Phone Number");
			long ph = sc.nextLong();
			while(ph>0)
			{
				count++;
				ph/=10;
				if(count==10)
				{
					break;
				}
			}
			
			if(count==10)
			{
				GPayFactory.upiValidate();
				System.out.print("Enter the You want to transfer : ");
				int amt = sc.nextInt();
				if(amt<=balance)
				{
					System.out.println(amt + "tranfer Suceesfull");
					System.out.println("Balance Amount is :" + (balance-amt));
					balance = balance-amt;
				}
				else
				{
					System.out.println("Insufficent Balance");
				}
				break;
			}
		}
	}
}
