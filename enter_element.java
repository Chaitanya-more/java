package enter_element;
import java.util.*;
public class enter_element {
	public static void main(String args[]) {
		
		int a[]=new int[5];
		   int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array: ");
		
		for(int i = 0; i<a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Elements: ");
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("Sorted array: ");
		   for(int i=0; i<a.length;i++) {
			   for(int j=0; j<a.length;j++) {
				   if(a[i]<a[j]) {
					   int t1 = a[i];
					   a[i]=a[j];
					   a[j]=t1;
				   }
				 
			   }
			  
		   }
		   for(int i1=0; i1<a.length; i1++) {
			   System.out.print(a[i1]+" ");
		   }
		
		
		}

}
