import java.util.*;
public class sum_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		  int m, n, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter number of rows & columns of matrix");
	      m = in.nextInt();
	      n  = in.nextInt();
	      int ar[][] = new int[m][n];
	      int ar2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	      System.out.println("Input elements of first matrix");
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            ar[c][d] = in.nextInt();
	      System.out.println("Input the elements of second matrix");
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            ar2[c][d] = in.nextInt();
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = ar[c][d] + ar2[c][d]; 
	      System.out.println("Sum of the matrices:-");
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	         System.out.println();
	      }
	}

}
