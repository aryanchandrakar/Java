package ClassObjects_Static_Abstract;

import java.util.Scanner;

abstract class shape{
	double r,h;
	double vol;
	abstract void volume();
}
class sphere extends shape{
	sphere(double r){
		this.r=r;
	}
	void volume(){
		vol=(1.33)*(3.14)*r*r*r;
		System.out.println("Volume of sphere: "+vol);
	}
}
class cylinder extends shape{
	cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	void volume(){
		vol=3.14*r*r*h;
		System.out.println("Volume of cylinder: "+vol);
	}
}
class cone extends shape{
	cone(double r, double h){
		this.r=r;
		this.h=h;
	}
	void volume(){
		vol=1.0466*r*r*h;
		System.out.println("Volume of cone: "+vol);
	}
}
class cube extends shape{
	cube(double h){
		this.h=h;
	}
	void volume(){
		vol=h*h*h;
		System.out.println("Volume of cube: "+vol);
	}
}
public class volume_polymorphism_upcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		double r,h;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		r=sc.nextInt();
		System.out.println("Enter height:");
		h=sc.nextInt();
		
		shape s;
		s=new sphere(r);
		s.volume();
		s=new cylinder(r,h);
		s.volume();
		s=new cone(r,h);
		s.volume();
		s=new cube(h);
		s.volume();
	}
}
