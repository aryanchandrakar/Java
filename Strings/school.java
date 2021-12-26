package Strings;

import java.util.Scanner;

public class school {
	public static void main(String[] args) {
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc = new Scanner(System.in);
		String[] arr= new String[5];
		System.out.println("Enter a reg no.: ");
		for(int i=0;i<5;i++) {
		    String s = sc.nextLine();
		    arr[i]=s;
	    }
		StringBuffer scope=  new StringBuffer("");
		StringBuffer sense=  new StringBuffer("");
		for (int i=0;i<5;i++) {
			if(arr[i].contains("BCE")) {
				scope.append(arr[i]+", ");
			}
			else if(arr[i].contains("BEC")){
				sense.append(arr[i]+", ");
			}
			else {
				continue;
			}
		}
		if(sense.toString().contentEquals("") && scope.toString().contentEquals("")) {
			System.out.println("There are no students from SENSE and SCOPE");
		}
		else {
			System.out.println("Reg No. from SENSE school are "+sense.toString());
			System.out.println("Reg No. from SCOPE school are "+scope.toString());
		}
	}
}
