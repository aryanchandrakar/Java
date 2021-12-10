import java.util.Scanner;

public class simple_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter price: ");
		int p=sc.nextInt();
		System.out.println("Enter rate: ");
		int r=sc.nextInt();
		System.out.println("Enter time: ");
		int t=sc.nextInt();
		double s=(p*r*t)/100;
		System.out.println("Simple Intrest is: "+s);
	}

}
