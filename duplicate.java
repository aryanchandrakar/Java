import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] ma = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		ma[i]=sc.nextInt();  
		} 
		System.out.println("Original Array : "); 
        for (int i = 0; i < ma.length; i++)
        {
            System.out.print(ma[i]+"\t");
        } 
        int ne = ma.length; 
        for (int i = 0; i < ne; i++) 
        {
            for (int j = i+1; j < ne; j++)
            {
                if(ma[i] == ma[j])
                {
                    ma[j] = ma[ne-1];
                    ne--;
                    j--;
                }
            }
        }
        int[] a1 = Arrays.copyOf(ma, ne);
        System.out.println();
        System.out.println("Array with unique values : "); 
        for (int i = 0; i < a1.length; i++)
        {
            System.out.print(a1[i]+" ");
        }
	}
}
