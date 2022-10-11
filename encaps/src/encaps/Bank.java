package encaps;

import java.util.Scanner;
public class Bank {
	Scanner scan = new Scanner(System.in);
	 private int amt = 1000;
	 private int p = 2396;
	
	 //setter method
	 public void setAmount(int pin, int deposit ){
		 
		 
			 amt = (amt+deposit);
			 System.out.println();
			 System.out.println("Amount deposited");
			 
			 if(pin==p){
				 
			 System.out.println("do you wish to see the balance?");
			 String response = scan.nextLine();
			 switch(response){
			 case "yes" : System.out.println("The balance amount is : "+ amt);
			 			  break;
			 case "no" :  System.out.println("Thankyou !"); 
				 			break; 
			default :  System.out.println("Invalid input");
			  	}
		
		 }
		 else{
			 System.out.println();
			 System.out.println("Invalid Pin! Please Enter valid pin to see the balance");
			 System.out.println();
		 }
		 
	 }
	 
	 //withdrawal method
	 
	 void wd(int pin, int withdraw){
		 if (pin==p){
			 if((withdraw%100)==0){
				 amt = (amt-withdraw);
				 System.out.println("Please collect your cash");
			 }
			 else{
				 System.out.println("Please Enter The Amount In Multiples of 100");
			 }
		
		 System.out.println("do you wish to see the balance?");
		 String response = scan.nextLine();
		 switch(response){
		 case "yes" : System.out.println("The balance amount is : "+ amt);
		 			  break;
		 case "no" :  System.out.println("Thankyou !"); 
			 			break;
		 	}
		 }
		 else{
			 System.out.println();
			 System.out.println("Invalid pin! Operation Cancelled");
			 System.out.println();
		 }
	 }
	 
	 //get amount method
	 
	 int getAmt(int pin){
		 if (pin == p){
			 return amt;
		 }
		 else{
			 System.out.println("error! invalid pin");
			 return 0;
		 }
	 }
}

class User{
	
//main
	
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
	//object creation of bank class
		
		Bank s = new Bank();
		
	//declaring variables required
		
	char rexx; 	//response of user
	int pin; 	//pin entered by user
	
	
	do{
		//options available to the user
		
	System.out.println("Select from the options:");
	System.out.println("press a for deposit");
	System.out.println("press b for withdrawal");
	System.out.println("Press c to see the balance");
	System.out.println("press d to cancel");
	
	 char option = scan.next().charAt(0); //response from the user is stored

	//respective response to the user input
	 
	switch(option){
	
	case 'a' : 	System.out.println("enter the pin");
				pin = scan.nextInt();
				System.out.println("please enter the amount you want to deposit");
				int dep = scan.nextInt();
				s.setAmount(pin, dep);
				break;
	case 'b' : System.out.println("enter the pin");
				pin = scan.nextInt();
				System.out.println("Please enter the amount for withdrwal");
				int withdraw = scan.nextInt();
				s.wd(pin,withdraw);
				break;
	case 'c' : System.out.println("enter the pin");
				pin = scan.nextInt();
				System.out.println("the amount currently available : "+ s.getAmt(pin));
				break;
	case 'd' : System.out.println("Thank you !");
				break;
	default	: System.out.println("Invalid option !, Last operation cancelled");
				System.out.println("Thankyou");
		}
	//does the user likes to go back to menus after the operation
	
			System.out.println("Do you wish to go back to menu options?");
			System.out.println("Enter a for Yes");
			System.out.println("Enter b for No");
			rexx = scan.next().charAt(0); //response is stored here
			 
	}while(rexx=='a');
	System.out.println("End"); //if the user response is no
	}
   }