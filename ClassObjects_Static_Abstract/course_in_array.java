package ClassObjects_Static_Abstract;

import java.util.Scanner;
public class course_in_array {
	
	//get input
	public static String[][] set_courseDetails() {
		Scanner sc=new Scanner(System.in);
		String[][] course= new String[5][4];
		System.out.println("[~] Enter any 5 course details(Name, ID, Type, Offered By):");
		for (int i=0;i<5;i++) {
			/*for (int j=0;j<4;j++) {String inp=sc.nextLine();	course[i][j]=inp; }*/
			String[] inp=(sc.nextLine()).split(" ");
			course[i]=inp;
		}
		System.out.println();
		System.out.println("[~] We have courses as :");
		for (int i=0;i<5;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(course[i][j]+" ");
			}
			System.out.println();
		}
		return course;
	}
	
	// find count
	public static int[] search_courseDetails() {
		String[][] courses=set_courseDetails();
		int ue = 0,pe=0,pc=0;
		for (int i =0;i<5;i++) {
			if(courses[i][2].equals("ue") | courses[i][2].equals("UE")) {ue++;}
			else if(courses[i][2].equals("pe") | courses[i][2].equals("PE")) {pe++;}
			else if(courses[i][2].equals("pc") | courses[i][2].equals("PC")) {pc++;}
		}
		int[] count=new int[] {ue,pe,pc};
		return count;
	}
	
	//print result
	public static void display_courseDetails() {
		int[] count=search_courseDetails(); //ue,pe,pc
		System.out.println();
		System.out.println("[+] Courses are provided as");
		System.out.println("\t[~] University Elective : "+ count[0]);
		System.out.println("\t[~] Program Elective : "+ count[1]);
		System.out.println("\t[~] Program Core : "+ count[2]);
	}
	
	// main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		display_courseDetails();
	}

}
