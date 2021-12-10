import java.util.*;
public class identitymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner cs=new Scanner(System.in);
		 int r,c;
		    //Get size of matrix
		    System.out.print("Enter the row number:");
		    r=cs.nextInt();
		    System.out.print("Enter the columns number:");
		    c=cs.nextInt();
		    int matrix[][] =new int[r][c];
		    int i,j;
		    System.out.println("Enter the Matrix Element:");
		    for(i=0;i<r;i++)
		    {
		        for(j=0;j<c;j++)
		        {
		            matrix[i][j]=cs.nextInt();
		        }
		    }
		    int point=0;
		    for(i=0;i<r;i++)
		    {
		        for(j=0;j<c;j++)
		        {
		        if(i==j && matrix[i][j]!=1)
		        {
		            point=1;
		            break;
		        }
		        else if(i!=j && matrix[i][j]!=0)
		        {
		            point=1;
		            break;
		        }
		        }
		    }
		    if(point==1)
		    	System.out.print("Not an identity matrix.");
		    else
		    	System.out.print("An identity matrix.");
	}

}
