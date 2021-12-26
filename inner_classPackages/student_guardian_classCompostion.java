package inner_classPackages;

import java.util.*;
import java.lang.*;

class Student{
	String[] regno;
	int n;
	guadian g= new guadian();
	void regnumber() {
		Scanner sc = new Scanner(System.in);
		Scanner ab = new Scanner(System.in);
		System.out.println("[*] Enter number of students: ");
		n= sc.nextInt();
		regno=new String[n];
		int i;
		String r;
		int q=0;
		for (i=0;i<n;i++) {
			System.out.println("~ Enter Student Registration number:");
			r=ab.nextLine();
			regno[i]=r;
			g.gdet(r,q,n);
			q=q++;
		}
	}
	void display(String regsearch) {
		System.out.println("* Searching for "+regsearch+"'s guradian!");
		for (int i=0;i<regno.length;i++) {
			System.out.println(regno[i]);
			if(regno[i].equals(regsearch) | regno[i]==regsearch) {
				System.out.println("[~] The student with registration number "+regsearch+" has - ");
				g.display(i);
				break;
			}
			else {
				System.out.println("[-] No such student! ");
				System.exit(0);
			}
		}
	}
}


class guadian{
	int num;
	String[][] gdetails;
	void gdet(String r, int ind, int n) {
		Scanner s = new Scanner(System.in);
		System.out.println("~ Enter Student "+r+" number of gurdians:");
		int m=s.nextInt();
		
		//max 3 guardians
		while (m>3) {
			System.out.println("[-] Please enter value below 3.");
			m=s.nextInt();
		}
		
		gdetails=new String[n][m];
		System.out.println("~ Enter Student "+r+" gurdians details:");
		Scanner gd = new Scanner(System.in);
		for(int j=0;j<m;j++) {
			gdetails[ind][j]=gd.nextLine();
		}
	}
	
	void display(int a) {
		for (int j=0;j<(gdetails[a].length);j++) {
			System.out.println(gdetails[a][j]);
		}
	}
}
public class student_guardian_classCompostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		
		Student obj=new Student();
		obj.regnumber();
		
		System.out.println("~ Registration number searching for?");
		Scanner sre = new Scanner(System.in);
		String regno=sre.nextLine();
		obj.display(regno);
	}

}
