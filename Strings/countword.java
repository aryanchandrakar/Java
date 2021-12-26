package Strings;

import java.util.Scanner;

public class countword {
	public static int occurence(String str, String w) 
	{
	    // split the string by spaces in a
	    String a[] = str.split(" ");
	  
	    // search for pattern in a
	    int c = 0;
	    for (int i = 0; i < a.length; i++) 
	    {
	    // if match found increase c
	    if (w.equals(a[i]))
	        c++;
	    }
	  
	    return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String str = sc.nextLine();
		System.out.println("Enter word: ");
		String w = sc.nextLine();
		int o=occurence(str, w);
	    if(o==0) {
	    	System.out.println("No such word found! ");
	    }
	    else {
	    	System.out.println(o+ " times it occured.");
	    }
	}

}

	  
