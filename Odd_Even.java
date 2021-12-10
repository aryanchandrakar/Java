import java.util.Scanner;
import java.lang.Math;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(n%2==0) 
			{System.out.println("if-else says "+n+" is even");}
		else
			{System.out.println("is-else says "+n+" is odd");}
		
		int r=n%2;
		switch(r)
		{
		case 0:
			{System.out.println("Switch says "+n+" is even");
			break;
			}
		default :
			{System.out.println("Switch says "+n+" is odd");
			break;
			}
		}
	}

}
