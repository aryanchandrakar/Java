package Strings;

import java.util.*;
public class reverse {
 public static void main(String[] args) {
  System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
  Scanner sc=new Scanner(System.in);
  String is,os="";
  is=sc.nextLine();
  String[] stringList=is.split(" ");
  for (String s:stringList){
      for(int i=s.length()-1;i>=0;i--){
          os+=s.charAt(i);
      }
      os+=" ";
  }
  System.out.print(os);
 }
}