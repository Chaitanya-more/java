package atm_Machine;
import java.util.Scanner;
public class Atm_machine {
	public static void main(String args[]) {
		
		int balance=10000, withdraw = 0, deposite = 0;
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("***Automated teller machine***");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for deposite");
			System.out.println("Choose 3 for Check balance");
			System.out.println("Choose 4 for exit");
			System.out.println("Choose operatoin:  ");
			int n = sc.nextInt();
			
			switch(n) {
			
			case 1 :
				System.out.println("Enter money to be withdraw: ");
				if(balance >= withdraw) {
					withdraw= sc.nextInt();
					balance = balance - withdraw;
					
				}
				else {
					System.out.println("Insufficient money.");
				}
				System.out.println(" ");
				break;
				
			case 2 :
				System.out.println("Enter money to be deposited:  ");
				deposite = sc.nextInt();
				deposite= balance + deposite;
				System.out.println("Your money deposited successfully...");
				System.out.println(" ");
				break;
				
			case 3 :
				System.out.println("Balance: "+balance);
				System.out.println(" ");
				break;
				
			case 4 :
				System.exit(0);
			
			}
	
		}
	}

}
