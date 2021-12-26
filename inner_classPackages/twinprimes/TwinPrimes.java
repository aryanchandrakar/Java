package inner_classPackages.twinprimes;

import java.util.*;
import java.io.*;
import inner_classPackages.primespackage.Primes;

public class TwinPrimes {
	 public static void main(String[] args) {
		 // TODO code application logic here
		 System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		 Scanner in=new Scanner(System.in);
		 System.out.println("[*] input limit to check for twin primes till:");
		 int n=in.nextInt();
		 if (n<5) return;
		 for(int i=3;i+1<n;i+=4){
			 if(Primes.checkForPrime(i)&&Primes.checkForPrime(i+2))
				 System.out.println("~ "+i+", "+(i+2));
			 if(i+2<n&&Primes.checkForPrime(i+1)&&Primes.checkForPrime(i+3)) 
				 System.out.println("~ "+(i+1)+", "+(i+3));
		 } 
	 }
 }
