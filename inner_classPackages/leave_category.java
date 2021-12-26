package inner_classPackages;

import java.util.Scanner;
class facultyleave{
	static String name;
	static int empid;
	//class constructor
	facultyleave(String name,int empid){
		this.name=name;
		this.empid=empid;
	}
	static class eligible_leave{
		//static leave categories
		static int el=12;
		static int ml=20;
		static int cl=10;
		
		eligible_leave(String fname, int fid) {
			name=fname;
			empid=fid;
		}
		//static method
		static void display_leave_category(){
			// defining category values
			if(empid>100 & empid<200) {el=15;ml=22;cl=12;} 
			else if(empid>200 & empid<300) {el=17;ml=24;cl=14;} 
			else if(empid>300) {el=19;ml=25;cl=15;} 
			
			//display details
			System.out.println("[+] "+name+" having id "+empid+" has leave category alloated as el -> "+el+", ml -> "+ml+", cl-> "+cl);
		}
	}
}
public class leave_category {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("How many faculty leave details checking? ");
		int n=sc.nextInt();
		
		//array of objects
		facultyleave.eligible_leave[] obj=new facultyleave.eligible_leave[n]; 
		
		String fname;
		int fid;
		System.out.println("Enter faculties name and id:");
		for (int i=0;i<n;i++) {
			fname=s.nextLine();
			fid=sc.nextInt();
			obj[i]=new facultyleave.eligible_leave(fname,fid); //object created
			obj[i].display_leave_category();
		}
	}
}
