package maxNumber;
import java.util.Scanner;
public class maxNumber {
	public static void main(String args[]) {
      	int a, b, c, d;
      	
      	try(Scanner s = new Scanner(System.in)){
      	System.out.println("Enter four number to find maximum in it:  ");
      	a=s.nextInt();                                                     //Taking input from user.
      	b=s.nextInt();
      	c=s.nextInt();
      	d=s.nextInt();
      	
		 if(a>b && a>c && a>d) {
			 System.out.println(a+"  is maximum.");
		 }
		if(b>c && b>d) {
			 System.out.println(b+"  is maximum.");
		}
		if(c>d) {
			System.out.println(c+" is maximum.");
		}
		else
			System.out.println(d+" is maximum.");
		
	   }
	} 
}
