package arrayExample1;
import java.util.Scanner;
public class arrayExample1 {
        public static void main(String args[])
        {
        	int []a= new int[4];
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter array element: ");  //Adding elements.
        	for(int i=0; i <4; i++) {
        		a[i]=s.nextInt();                       //storing elements using for loop.
        	}
        	System.out.println("Your array elements are: ");
        	for( int j=0; j<4;j++) {                            //showing elements using for loop.
        		System.out.println(a[j]+" ");
        	}
        	System.out.println("your sorted array: ");
        	int temp;
        	
        	for(int i=0; i<4;i++) {                        //sorting elements.
        		for(int j=i+1;j<4; j++) {
        			if(a[i]>a[j]) {
        				temp=a[i];
        				a[i]=a[j];
        				a[j]=temp;
        				
        			}
        		}
        	   	System.out.println(a[i]);
        	}
     
        	
        }
}
