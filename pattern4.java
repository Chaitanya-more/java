package pattern4;
import java.util.Scanner;
public class pattern4 {
	public static void main(String args[])
	{
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to form pattern:");
		size=s.nextInt();
		
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=size; j++)
			{
				if(i%2==0)
				
					System.out.print("* ");
					
				
					else 
					
				System.out.print(j+" ");
				}
			System.out.println();
			}
			
		}
	}


