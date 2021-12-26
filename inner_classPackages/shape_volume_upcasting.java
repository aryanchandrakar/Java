package inner_classPackages;

import java.util.Scanner;
class volume{
	double volume;
	void compute() {
		System.out.println("[-] no volume sorry!");
	}
}
class cones extends volume{
	int r,h;
	cones(int ri,int hi){
		r=ri;
		h=hi;
	}
	void compute() {
		volume=(((3.14)*r*r*h)/3);
		System.out.println("[+] volume of cone is "+volume);
	}
}
class cubes extends volume{
	int h;
	cubes(int l){
		h=l;
	}
	void compute() {
		volume=h*h*h;
		System.out.println("[+] volume of cube is "+volume);
	}
}
class cylinders extends volume{
	int r,h;
	cylinders(int ri,int hi){
		r=ri;
		h=hi;
	}
	void compute() {
		volume=(3.14)*r*r*h;
		System.out.println("[+] volume of cylinder is "+volume);
	}
}
class spheres extends volume{
	int r;
	spheres(int ri){
		r=ri;
	}
	void compute() {
		volume=(1.34)*r*r*r;
		System.out.println("[+] volume of sphere is "+volume);
	}
}
class cuboid extends volume{
	int l,b,h;
	cuboid(int li, int bi, int hi){
		l=li;
		h=hi;
		b=bi;
	}
	void compute() {
		volume=l*b*h;
		System.out.println("[+] volume of cuboid is "+volume);
	}
}
public class shape_volume_upcasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc =new Scanner(System.in);
		//array shape object , upcasting, polymorphism
		
		System.out.println("[~] Enter radius & height of cone");
		volume[] cone=new cones[1];
		int ro=sc.nextInt();
		int ho=sc.nextInt();
		cone[0]=new cones(ro,ho);
		
		System.out.println("[~] Enter length of cube");
		volume[] cube=new cubes[1];
		int l=sc.nextInt();
		cube[0]=new cubes(l);
		
		System.out.println("[~] Enter radius & height of cylinder");
		volume[] cylinder=new cylinders[1];
		int rl=sc.nextInt();
		int hl=sc.nextInt();
		cylinder[0]=new cylinders(rl,hl);
		
		System.out.println("[~] Enter radius of sphere");
		volume[] sphere=new spheres[1];
		int rs=sc.nextInt();
		sphere[0]=new spheres(rs);
		
		System.out.println("[~] Enter length, height & width of cuboid");
		volume[] cuboid=new cuboid[1];
		int lu=sc.nextInt();
		int hu=sc.nextInt();
		int wu=sc.nextInt();
		cuboid[0]=new cuboid(lu,hu,wu);
		
		//output
		volume v;
		v=(volume) new cones(ro,ho);
		v.compute();
		v=(volume) new cubes(l);
		v.compute();
		v=(volume) new cylinders(rl,hl);
		v.compute();
		v=(volume) new spheres(rs);
		v.compute();
		v=(volume) new cuboid(lu,hu,wu);
		v.compute();
		
	}

}
