package evenOdd;
import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
	
		try(Scanner s= new Scanner(System.in))
		{
			for(int i =0; i<3; i++) {
			int x;
			System.out.println("Enter an integer: ");
			x =s.nextInt();
			if(x%2==0) {
				System.out.println("The number is even.");
			}
			else
			{
				System.out.println("The number is odd");
			}
		
		  }
		
		}
		
	  }

    }
