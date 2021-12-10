import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] a = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		a[i]=sc.nextInt();  
		} 
		for(int i=0;i<n;i++)  
	    {  
	        for (int j=0;j<n;j++)  
	        {  
	            if(a[i]<a[j])  
	            {  
	                int temp = a[i];  
	                a[i]=a[j];  
	                a[j] = temp;   
	            }  
	        }  
	    }  
	    System.out.println("Sorted List ...");  
	    for(int i=0;i<n;i++)  
	    {  
	        System.out.println(a[i]);  
	    } 
	}

}
