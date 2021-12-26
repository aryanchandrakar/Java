package exception_handling;

import java.util.*;
import java.lang.*;

class UserDefinedException2 extends Exception  
{  
    public UserDefinedException2(String str)  
    {  
        super(str);  
    }  
}

public class professorMarksException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc=new Scanner(System.in);
		System.out.println("[*] Enter number of students: ");
		int n=sc.nextInt();
		int[] marks=new int[n]; 
		System.out.println("[*] Enter marks of "+n+" students:");
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		//}
		//for (int i=0;i<n;i++) {
			try {
				if(marks[i]>100) {
					throw new UserDefinedException2("[~] Marks entered more than 100");}
				else if(marks[i]<0) {
					throw new UserDefinedException2("[~] Marks entered less than 0");
				}
				else {continue;}
			}
			catch(UserDefinedException2 ue){
				
				System.out.println("[-] there's an exception due to entered marks,\n"+ue.getMessage());
				System.exit(0);
			}
		}
		System.out.println("[+] Students marks are:");
		for (int j:marks) {
			System.out.println(j+" ");
		}
	}
}
