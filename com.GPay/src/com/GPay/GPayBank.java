package com.GPay;

import java.util.Scanner;

public class GPayBank 
{
	public static void sbi()
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 to Check Balance \nPress 2 to Transfer Money \nPress any other number to Exit");
			int press = sc.nextInt();
			Bank b = new SBI() ;
			switch(press)
			{
			case 1 : b.balance();
			break;
			case 2 : b.transfer();
			break;
			default : System.exit(0);
			}
		}
	}
	
	public static void icici()
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 to Check Balance \nPress 2 to Transfer Money \nPress any other number to Exit");
			int press = sc.nextInt();
			Bank b = new ICICI() ;
			switch(press)
			{
			case 1 : b.balance();
			break;
			case 2 : b.transfer();
			break;
			default : System.exit(0);
			}
		}
	}
	
	public static void canara()
	{
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Press 1 to Check Balance \nPress 2 to Transfer Money \nPress any other number to Exit");
			int press = sc.nextInt();
			Bank b = new Canara() ;
			switch(press)
			{
			case 1 : b.balance();
			break;
			case 2 : b.transfer();
			break;
			default : System.exit(0);
			}
		}
	}
}
