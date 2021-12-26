package exception_handling;
import java.util.*;
import java.lang.*;

class UserDefinedExceptio extends Exception{  
    public UserDefinedExceptio(String str)  
    {  
        super(str);  
    }  
}  
public class senarioExceptionCatch{

     public static void main(String []args){
        System.out.println("******************* 18BCI0174 Aryan Chandrakar *******************");
        Scanner sc=new Scanner(System.in);
        System.out.println("[*] Enter a number: ");
        int n=sc.nextInt();
        if(n<=0){
            try{ 
             throw new UserDefinedExceptio("~ Entered number either 0 or negative");
            }  
            catch(UserDefinedExceptio ud){
            System.out.println("[-] There's an exception,\n"+ud.getMessage());
            }
            finally{
            System.out.println("[!] Thankyou for using our service.");
            }
        }
        else if(n>50 & n<100){
            try{
             throw new UserDefinedExceptio("~ Entered number between 50 and 100");
            }
            catch(UserDefinedExceptio ud){
            System.out.println("[-] There's an exception,\n"+ud.getMessage());
            }
            finally{
            System.out.println("[!] Thankyou for using our service.");
            }
        }
        else{System.out.println("[+] No exceptiion found, the entered number was "+n+"\n[!] Thankyou for using our service.");}
     }
}


