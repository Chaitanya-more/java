package arrayExample2;
import java.util.Scanner;
public class arrayExample2 {

	public static void main(String[] args) {
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size = s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size;i++) {
			a[i]=s.nextInt();
			
		}
           System.out.println("Elements you entered: ");     //showing elements.
           for(int i =0;i<size; i++) {
        	   System.out.print(a[i]+" ");
           }
           System.out.println();
           System.out.println("Sorted array: ");         //sorting elements.
           for(int i=0; i<size; i++) {
        	   for(int j=i+1;j<size; j++) {
        		   if(a[i]>a[j]) {
        			   int t=a[i];
        			   a[i]=a[j];
        			   a[j]=t;
        		   }
        	   }
        	  
        	   System.out.print(a[i]+" ");
           }
	}

}
