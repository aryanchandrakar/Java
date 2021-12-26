package Strings;

import java.util.Scanner;

public class passwordweak {
	public static void main(String[] args) {
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a username: ");
	    String uname = sc.nextLine();
	    System.out.println("Enter a passowrd: ");
	    String pass = sc.nextLine();
	    
	    char[] ch = new char[uname.length()];
        for (int i = 0; i < uname.length(); i++) {
            ch[i] = uname.charAt(i);
        }
        for(int i =0;i<uname.length()-2;i++) {
        	 String s = new String(ch,i,3);
        	 //System.out.println(s);
        	 if(pass.contains(s)) {
        		 System.out.println("Weak password");
        		 System.exit(0);
        	 }
        	 else {
        		 continue;
        	 }
        }
        System.out.println("Good password");
	}
}
