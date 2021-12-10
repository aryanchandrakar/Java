import java.util.*;
public class sumof_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
		int m, n, row, col, sum = 0, ri = 0, ci = 0;
		System.out.print("Enter number of rows and columns :");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.print("Enter matrix :");
		int[] row_arr = new int[m];
		int i, j;
		int[][] mat = new int[m][n];
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
					mat[i][j] = sc.nextInt();
			}

		int z = 0;

		System.out.print("Sum of rows is ");
		for(row=0; row<m; row++)
			{
				sum = 0;
				for(col=0; col<n; col++)
					{
						sum += mat[row][col];
					}

				System.out.print(sum +" ");

				row_arr[z++] = sum;
			}
	}

}
