package inner_classPackages;

import java.util.Scanner;

class address{
	String Street, City, District, State, Country, Zipcode, EmpName; //data members
	void name() {
		Scanner s=new Scanner(System.in);
		System.out.println("[*] Enter Employee name: ");
		EmpName=s.nextLine();
	}
	class addressdetails{
		void details() {
			Scanner sc=new Scanner(System.in);
			System.out.println("[*] Where does Employee live: ");
			System.out.println("~ Street: ");
			Street=sc.nextLine();
			System.out.println("~ City: ");
			City=sc.nextLine();
			System.out.println("~ District: ");
			District=sc.nextLine();
			System.out.println("~ State: ");
			State=sc.nextLine();
			System.out.println("~ Country: ");
			Country=sc.nextLine();
			System.out.println("~ Zipcode: ");
			Zipcode=sc.nextLine();
		}
	}	
	class display{
		void det_dispaly() {
			System.out.println("[+] "+EmpName+" lives at "+Street+" in the city "+City+" in district "+District+" of "+State+" in the country of "+Country+" having zip code "+Zipcode);
			System.out.println();
		}
	}
}
public class employee_address_nestedClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		address obj = new address();
		obj.name();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("[*] Employee has now many addresses?");
		int n;
		n=scan.nextInt();
		int i;
		for(i=0;i<n;i++) {
			address.addressdetails det =obj.new addressdetails();
			det.details();
			address.display dis =obj.new display();
			dis.det_dispaly();
		}
	}

}
