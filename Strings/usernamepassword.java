package Strings;

import java.util.Scanner;

public class usernamepassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a username: ");
	    String uname = sc.nextLine();
	    System.out.println("Enter a passowrd: ");
	    String pass = sc.nextLine();
	    System.out.println("Confirm password: ");
	    String cpass = sc.nextLine();
	    if(!uname.isEmpty() && !pass.isEmpty()) {
	    	if(pass.length()>=8) {
	    		if(!pass.contains(uname)) {
				    	if(pass.equals(cpass)) {
				    		System.out.println("\n[~] System says:\n [+] Username & passowrd - not empty \n[+] "
				    				+ "Passowrd contains min 8 char \n[+] Password doesn't contains uername \n[+] Password matches confirmed password ");
				    	}
				    	else {
				    		System.out.println("[-] Password and Confirm password not same.");
				    	}
	    		}
	    		else {
		    		System.out.println("[-] Password contains username.");
		    	}
	    	}
	    	else {
	    		System.out.println("[-] Password length < 8.");
	    	}
	    }
	    else {
    		System.out.println("[-] Password or Username empty.");
    	}
	}

}
