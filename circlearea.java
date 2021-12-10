import java.util.Scanner;
import java.lang.Math;

public class circlearea {
	public static void main(String[] args) {
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r=sc.nextInt();
		double area=Math.PI*Math.pow(r,2);
		System.out.println("Area of circle is "+ area);
	}
}
