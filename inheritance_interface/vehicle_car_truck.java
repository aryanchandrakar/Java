package inheritance_interface;

import java.util.Scanner;

class vehicle{
	// instance variables
	String[] type= {"car","truck"};
	int[] weight= {2,100};
	
	// print details
	public void show_vehicle() {
		System.out.println("\n[+] We have :");
		for(int i=0;i<type.length;i++) {
			System.out.println("\t~ "+type[i]+"'s of weight starting from "+weight[i]+" tons");
		}
	}
	
	// cost details
	public void cost(String[] cost) {
		System.out.println("[*] cost between "+cost[0]+" & "+cost[1]);
	}
}

class car extends vehicle{
	// instance variables
	int lower;
	int higher;
	// print details
	public void show_car(String[][] car) {
		
		System.out.println("\n[+] We have :");
		lower=Integer.valueOf(car[0][3]);
		higher=Integer.valueOf(car[0][3]);
		for(int i=0;i<5;i++) {
			System.out.println("\t~  "+car[i][0]+" "+car[i][1]+" manufactured in "+car[i][2]+" costing "+car[i][3]+" giving a mileage of "+car[i][4]);
			if (Integer.valueOf(car[i][3])<lower) {
				lower=Integer.valueOf(car[i][3]);
			}
			else if (Integer.valueOf(car[i][3])>higher) {
				higher=Integer.valueOf(car[i][3]);
			}
			else {continue;}
		}
		
		// super
		String[] cost = {String.valueOf(lower),String.valueOf(higher)};
		super.cost(cost);
	}
	
	// mileage
	public void mileage(String[][] car) {
		System.out.println("\n[+] Cars with mileage >30:");
		for(int i=0;i<5;i++) {
			if (Integer.valueOf(car[i][4])>30) {
				System.out.println("\t~ "+car[i][0]+" "+car[i][1]+" has a mileage of "+car[i]);
			}
		}
	}
	
}

class truck extends vehicle{
	// instance variables
	int lower;
	int higher;
	// print details
	public void show_truck(String[][] truck) {
		
		System.out.println("\n[+] We have :");
		lower=Integer.valueOf(truck[0][3]);
		higher=Integer.valueOf(truck[0][3]);
		for(int i=0;i<5;i++) {
			System.out.println("\t~  "+truck[i][0]+" "+truck[i][1]+" manufactured in "+truck[i][2]+" costing "+truck[i][3]+" giving a mileage of "+truck[i][4]);
			if (Integer.valueOf(truck[i][3])<lower) {
				lower=Integer.valueOf(truck[i][3]);
			}
			else if (Integer.valueOf(truck[i][3])>higher) {
				higher=Integer.valueOf(truck[i][3]);
			}
			else {continue;}
		}
		
		// super
		String[] cost = {String.valueOf(lower),String.valueOf(higher)};
		super.cost(cost);
	}
}

public class vehicle_car_truck {
	public static void main(String[] args) {
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		
		vehicle obj=new vehicle();
		obj.show_vehicle();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n------------In cars we have------------");
		String[][] car= new String[5][5];
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter Company: ");
			car[i][0]=sc.nextLine();
			System.out.println("Enter Model: ");
			car[i][1]=sc.nextLine();
			System.out.println("Enter year of manu.: ");
			car[i][2]=sc.nextLine();
			System.out.println("Enter cost: ");
			car[i][3]=sc.nextLine();
			System.out.println("Enter mileage: ");
			car[i][4]=sc.nextLine();
			System.out.println("-----------------");
		}
		
		System.out.println("\n------------In trucks we have------------");
		String[][] truck= new String[5][5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter Company: ");
			truck[i][0]=sc.nextLine();
			System.out.println("Enter Model: ");
			truck[i][1]=sc.nextLine();
			System.out.println("Enter year of manu.: ");
			truck[i][2]=sc.nextLine();
			System.out.println("Enter cost: ");
			truck[i][3]=sc.nextLine();
			System.out.println("Enter mileage: ");
			truck[i][4]=sc.nextLine();
			System.out.println("-----------------");
		}
		
		car obj1=new car();
		obj1.show_car(car);
		obj1.mileage(car);
		
		truck obj2=new truck();
		obj2.show_truck(truck);
	}
}
