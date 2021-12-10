import java.util.Scanner;
import java.lang.Math;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter weight in kg: ");
		int w=sc.nextInt();
		System.out.println("Enter height in cm: ");
		int h=sc.nextInt();
		float hm =h/100;
		double bmi=w / (Math.pow(hm,2));
		System.out.println("Your BMI is: "+bmi);
	}

}
