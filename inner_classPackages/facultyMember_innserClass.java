package inner_classPackages;

import java.util.Scanner;

class faculty{
	int n,m;
	String[][] faculty_details;
	String[][][] degree_details;
	String[][] degree_count;
	
	void get_faculty_details() {
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("[-] Enter number of faculties:");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("[-] Enter faculty "+(i+1)+" name: ");
			String na=s.nextLine();
			System.out.println("[-] Enter faculty "+(i+1)+" id: ");
			int id=sc.nextInt();
			faculty_details=new String[][] {{na,String.valueOf(id)}};
		}
	}

	// inner class
	public class degree_faculty{
		Scanner abc=new Scanner(System.in);
		Scanner def=new Scanner(System.in);
		// get degree details 
		public void get_degree_deatils() {
			
			for (int i=0;i<n;i++) {
				System.out.println("[-] Enter faculty "+(i+1)+"'s number of degrres: ");
				m = def.nextInt();
				degree_count=new String[][] {{faculty_details[i][1],String.valueOf(m)}};
				
				for (int j=0;j<m;j++) {
					System.out.println("[-] Enter faculty "+(i+1)+"'s "+(j+1)+" degree, year of completion and university: ");
					String id=faculty_details[i][1];
					String degree=abc.nextLine();
					int year=def.nextInt();
					String university=abc.nextLine();
					degree_details=new String[][][] {{{id,degree,String.valueOf(year)}}};
				}
			}
			
		}
		
		// degree display method
		void display_degree_details() {
			System.out.println("\n\n");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
						System.out.println("[+] faculty with id "+degree_details[i][j][0]+" has degree in "+degree_details[i][j][1]+" achieved in "+degree_details[i][j][2]);
				}
			}
		}
		
	}
	
	// faculty display method
		void display_faculty_data() {
			
			//accessing inner class
			degree_faculty degree_det=new degree_faculty();
			degree_det.get_degree_deatils();
			degree_det.display_degree_details();
			for(int i=0;i<n;i++) {
					if(degree_count[i][0].equals(faculty_details[i][1])) {
						System.out.println("[+] "+faculty_details[i][0]+" with id "+faculty_details[i][1]+ " has "+degree_count[i][1]+" degree.");
					}
			}
		}
}

public class facultyMember_innserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		
		faculty fac=new faculty();
		fac.get_faculty_details();
		fac.display_faculty_data();
	}

}
