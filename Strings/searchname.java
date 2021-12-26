package Strings;

import java.util.Scanner;

public class searchname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
		String[] arr= new String[5];
		System.out.println("Enter a names: ");
		for(int i=0;i<5;i++) {
		    String s = sc.nextLine();
		    arr[i]=s;
	    }
	    System.out.println("How many search?");
	    int n = sc.nextInt();
	    String[] search= new String[n+1];
	    System.out.println("Enter a names wanna search: ");
		for(int i=0;i<n+1;i++) {
		    String s = sc.nextLine();
		    search[i]=s;
	    }
		
		for(int j=0;j<n+1;j++) {
			for (int i=0;i<5;i++) {
				if(arr[i].contains(search[j])) {
					System.out.println("Name found in "+arr[i]);
					break;
				}
				else {
					System.out.println("Name not found in "+arr[i]);
					
				}
			}
		}
	}

}
