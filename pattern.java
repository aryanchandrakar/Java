import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =  new Scanner(System.in);
		// part a
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int p,q;
		for (p=1;p<=n;p++) {
			for (q=1;q<=p;q++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("--------------------------------------------------------");
		
		// part b
		System.out.println("Enter number: ");
		int m=sc.nextInt();
	
		for (int i=1; i<=m; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2; k <= m*2-1; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=1; i<=m-1; i++)
        {
            for (int j = m-1; j >= i; j--)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2; k++)
            {
                System.out.print(" ");
            }
            for (int l = m-1; l >= i; l--)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
		System.out.println("--------------------------------------------------------");
		// part c
		System.out.println("Enter number: ");
		int z=sc.nextInt();
		
        for(int i=0; i<z; i++)
        {
            int num=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            
            System.out.println();
        }
        for(int i=0;i<=z-1;i++) {
        	int num=1;
        	for (int j=z-i;j>0;j--) {
        		System.out.print(num+ " ");
                num++;
        	}
        	System.out.println();
        }
	}

}
