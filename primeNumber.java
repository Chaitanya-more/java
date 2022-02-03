package primeNumber;
import java.util.Scanner;
public class primeNumber {
	public static void main(String args[]) {
		

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter number to check whether the number is prime or not: ");
		int num;
		
		num=s.nextInt();
		boolean isPrime = true;
		
		for(int i =2; i<num;i++) {
			if(num%2==0) {
				
				isPrime = false;
				break;
				
			}
		}
		if(isPrime) {
			
			System.out.println(num+" is prime number.");
		}
		
		else {
			   System.out.println(num+" is not a prime number.");
	     	}	
		
	}

}
