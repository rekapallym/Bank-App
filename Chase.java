import java.util.Scanner;

public class Chase {

	public static void main(String[] args) {
		BankAccount chaseCust1 = new BankAccount();
		
		chaseCust1.CustInfo();
		
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		do {
			System.out.println("\n");
			System.out.println("1. Deposit Funds | 2. Withdraw Funds | 3.Account Balance Info | 4. Exit ");
			System.out.println("Please select one of the 4 Banking options");
			
		  x = scan.nextInt();
		
	      switch(x) {
			
			case 1: 
				System.out.println("Please enter your deposit amount:");
				chaseCust1.depositFunds(scan.nextDouble());
				break;
			case 2:
				System.out.println("Plese enter the funds you want to withdraw: ");
				chaseCust1.withdrawFunds(scan.nextDouble());
				break;
			case 3:
				System.out.println("You balance in your account is: " + chaseCust1.getBalance());
				break;
				
			case 4:
				System.out.println("Thank you for Banking with us. Have a Good Day!");
				break;
			default:
				System.out.println("Invalid Option");	
			}
		}while(x != 4);


	}

}
