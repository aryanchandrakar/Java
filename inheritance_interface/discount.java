package inheritance_interface;

import java.util.Scanner;

abstract class special{
	abstract double process(double P, double R);
}

class discountprocess extends special{
	double process(double P, double R) {
		double net;
		net=P-((P*R)/100);
		System.out.println("\n[*] Net amount is: "+net);
		double total=P+((P*R)/100);
		return total;
	}
}

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		discountprocess obj=new discountprocess();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("[-] Enter Principal amount:");
		double P=sc.nextDouble();
		System.out.println("[-] Enter Rate amount:");
		double R=sc.nextDouble();
		
		double total=obj.process(P,R);
		System.out.println("[+] Total amount is: "+total);
	}

}
