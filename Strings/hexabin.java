package Strings;

import java.util.Scanner;

public class hexabin {
	public static int hex2decimal(String s)
    {
             String dig = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = dig.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String value: ");
	      String str = sc.next();
	      StringBuffer sb = new StringBuffer();
	      //Converting string to character array
	      char ch[] = str.toCharArray();
	      for(int i = 0; i < ch.length; i++) {
	         String hs = Integer.toHexString(ch[i]);
	         sb.append(hs);
	      }
	      String result = sb.toString();
	      System.out.print("Equivalent Hexadecimal Number is :\n");
	      System.out.println(result);
	      int d,i=1,j;
	      int b[] = new int[100];
	      d = hex2decimal(result);
	      while(d != 0)
	        {
	            b[i++] = d%2;
	            d = d/2;
	        }
	        System.out.print("Equivalent Binary Number is :\n");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(b[j]);
	        }
	}

}
