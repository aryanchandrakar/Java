package collections;

import java.util.*;


interface Capitalize{
	public void capitalized();
}

public class CapitalizeFirstChar_Lambda_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc= new Scanner(System.in);
		System.out.println("[*] Enter String to be capitalized: "); // getting string
		
		Capitalize printCapitalized =()->{
			String str=sc.nextLine();//input
			
			//lambda expression
			char[] charArray = str.toCharArray();
		    boolean foundSpace = true;
		    for(int i = 0; i < charArray.length; i++) {
		    	if(Character.isLetter(charArray[i])) {
			    	// check space is present before the letter
			    	if(foundSpace) {
			           // change the letter into upper case
			           charArray[i] = Character.toUpperCase(charArray[i]);
			           foundSpace = false;
			         }
		    	}
		    	else {
		            // if the new character is not character
		            foundSpace = true;
		          }
		      }
		    str=String.valueOf(charArray);
			
			System.out.println("[+] The processed text is: -> \n\t"+str);
		};
		//calling method
		printCapitalized.capitalized();
	}

}
