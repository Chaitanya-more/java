package TableUsingLoop;
import java.util.Scanner;
public class tableUsingLoop {
	public static void main(String args[]) {
		
		int num, k;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number to make Table: ");
		num = s.nextInt();
		
		for(int i=1; i<=10; i++) {
			k=i*num;
			System.out.println(num+"*"+i+"= "+k);
		}
		s.close();
	}

}
