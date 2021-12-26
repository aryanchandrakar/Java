package Strings;

import java.util.*;
public class reverse1 {
	 public void reverseEachwInString(String str1) {
	  String[] ew = str1.split(" ");
	  String rev = "";
	  for (int i = 0; i < ew.length; i++) {
	   String w = ew[i];
	   String rw = "";
	   for (int j = w.length() - 1; j >= 0; j--) {
	    rw = rw + w.charAt(j);
	   }
	   rev = rev + rw + " ";
	  }
	  System.out.println(rev);
	 }
 
	 public static void main(String[] args) {
	  reverse1 obj = new reverse1();
	  System.out.println("Enter String: ");
	  Scanner sc=new Scanner(System.in);
	  String Str = sc.nextLine();
	  System.out.println("The given string is: " + Str);
	  System.out.println("The string reversed w by w is: ");
	  obj.reverseEachwInString(Str);
	 }
}