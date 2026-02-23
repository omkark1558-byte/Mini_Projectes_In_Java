 package Bank_mini_project;
 import java.util.Scanner;
 
 
 public class Mini_Banking_Application
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Your Name: ");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter Opening Balance: ");
		 double balance = sc.nextDouble();
		 
		 
		 
		 Banks user = new Banks(name,balance);
		 
		 int choice;
		 do
		 {
			System.out.println("==== Banking Menu ====");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				user.showBalance();
				break;
				
			case 2:
				System.out.println("Enter Deposite Amount: ");
				double depositeAmount = sc.nextDouble();
				user.deposit(depositeAmount);
				break;
				
			case 3:
				System.out.println("Enter Withdraw Ampunt: ");
				double withdrawAmount = sc.nextDouble();
				user.withdraw(withdrawAmount);
				break;
			
			case 4:
				System.out.println("Thank you for using banking Application !");
				break;
				
				default :
				System.out.println("Invalid choice... Try Again !");
			}
		 } while(choice !=4);
		 
			 sc.close();
		 
				 
//		 user.showBalance();
//		 user.deposit(500);
//		 user.withdraw(300);
//		 user.showBalance();
			 
	} 
}
 
class Banks {
	 private String Name;
	 private double balance;
	 
	 public Banks (String Name, double balance)
	 {
		 this.Name = Name;
		 this.balance = balance;
	 }
	 public void deposit(double amount)
	 {
		 balance += amount;
		 System.out.println("Deposited: " + amount);
	 }
	 public void withdraw(double amount)
	 {
		 if(amount > balance)
		 {
			 System.out.println("Insufficient Balance..!");
		 }else {
			 balance -= amount;
			 System.out.println("Withdrawn: "+ amount);
		 }
	 }
	 public void showBalance()
	 {
		 System.out.println(Name +"--- Current Balance: " + balance);
	 }
 }
 