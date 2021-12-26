package exception_handling;
import java.util.*;
public class userInput_tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("[*] Enter the choice: \n ~ 1 Arithmetic Exception\n ~ 2 Null Pointer Exception\n ~ 3 Array index out of bound exception");
		n=sc.nextInt();
		switch(n) {
		//if(n==1) {
		case 1:{
			System.out.println("[-] Lets see what happen on divion of 10 by 0 ->");
			try {
				int data=10/0;
			}
			catch(ArithmeticException ae) {
				System.out.println("[+] And we have an "+ae+", resulted from reaching an undefined value.");
			}
			break;}
		//}
		//else if(n==2) {
		case 2:{
			System.out.println("[-] Lets see what happen on using a string null value ->");
			try {
				String data=null;
				System.out.println(data.length());
			}
			catch(NullPointerException npe) {
				System.out.println("[+] And we have an "+npe+", resulted from refering null string value.");
			}
			break;}
		//}
		//else if(n==3) {
		case 3:{	
			System.out.println("[-] Lets see what happen on referring index 10 for array of length 5 ->");
			try {
				int[] array= {1,2,3,4,5};
				int l=array[10];
			}
			catch(ArrayIndexOutOfBoundsException aoe) {
				System.out.println("[+] And we have an "+aoe+", resulted from referring an imaginary index.");
			}
			break;}
		//}
		default:{
			System.out.println("[!] Good bye!");
			}
		}
	}
}
