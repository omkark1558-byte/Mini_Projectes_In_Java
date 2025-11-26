package bank_project;

import java.util.Scanner;

public class RBI_Gaid_Lines {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select For Bank.!");
		System.out.println("1. SBI Bank");
		System.out.println("2. HDFC Bank");
		System.out.println("3. BOB Bank");
		System.out.println("4. PNB Bank");
		int choice=sc.nextInt();
		Bank bank;
		
		switch(choice) {
		case 1: bank = new SBI();
		    bank.bankInfo();
		    System.out.println("Rate of Intrest :"+ bank.getrateofIntrest() +"%");
		break;
		case 2: bank = new HDFC();
			bank.bankInfo();
			System.out.println("Rate of Intrest :"+ bank.getrateofIntrest() +"%");
		break;
		case 3: bank = new BOB();
			bank.bankInfo();
		break;
		case 4: bank = new PNB();
			bank.bankInfo();
			System.out.println("Rate of Intrest :"+ bank.getrateofIntrest() +"%");
		break;
		default:
			System.out.println("Select Correct Bank: ");
		}
//		if(choice == 1)
//		{
//			bank = new SBI();	
//		}else if (choice == 2){
//			bank = new HDFC();
//		}else if(choice == 3){
//			bank = new BOB();
//		}else{
//			bank = new PNB();
//		}
		
//		bank.bankInfo();
		
//		System.out.println("Rate of Intrest :"+ bank.getrateofIntrest() +"%");
		 
		sc.close();
	}
}
class Bank
{
	public double getrateofIntrest()
	{
		return 0.0;
	}
	
	public void bankInfo()
	{
		System.out.println("Welcome to Generic Bank");
	}
}
class SBI extends Bank
{
	public double getrateofIntrest()
	{
		return 7.5;
	}
	
	public void bankInfo()
	{
		System.out.println("Welcome To SBI Bank 🏦");
	}
}
class HDFC extends Bank
{
	public double getrateofIntrest()
	{
		return 8.2; 
	}
	
	public void bankInfo()
	{
		System.out.println("Welcome To HDFC Bank 🏦");
	}
}
class BOB extends Bank
{
	public double getrateofIntrest()
	{
		return 7.10;
	}
	
	public void bankInfo()
	{
		System.out.println("Welcome To BOB Bank 🏦");
	}
}
class PNB extends Bank
{
	public double getrateofIntrest()
	{
		return 6.60;
	}
	public void bankInfo()
	{
		System.out.println("Welcome To PNB Bank 🏦");
	}
}
