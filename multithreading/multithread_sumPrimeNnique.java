package multithreading;

import java.util.*;
import java.lang.*;

class UserDefinedException1 extends Exception  
{  
    public UserDefinedException1(String str)  
    {  
        super(str);  
    }  
}

class sumfactor implements Runnable{
	private Thread t;
	private String threadname;
	private int num;
	sumfactor(String name,int n){
		threadname=name;
		num=n;
		System.out.println("[*] Creating "+threadname);
	}
	public void run() {
		System.out.println("[~] Running "+threadname);
		try {
			try {
				if(num>100 && num<200) {
					System.out.println("[~] Thread "+threadname+" says thankyou for entering "+num);
				}
				else {
					throw new UserDefinedException1("[~] Entered value not in range.");
				}
			}
			catch(UserDefinedException1 u) {
				
			}
			
			for(int i=100;i<201;i++) {
				int t,s=0;
				t=i; // s is sum, t is temp
				while(t>0) {
					int a=t%10;
					s=s+a;
					t=t/10;
				}
				if (i%s==0) {
					System.out.println("    [f] Thread "+threadname+" gave number "+i+ " which has "+s+" as it's factor.\n");
				}
				//else {continue;}
				Thread.sleep(10);
			}
		}
		catch(InterruptedException e){
			System.out.println("[-] Thread "+threadname+" interrupted.....WOOPS!");
		}
		
		System.out.println("[!] Thread "+threadname+" exiting........GOODBYE!\n");
	}
	public void start() {
		System.out.println("[~] Starting "+threadname);
		if(t==null) {t=new Thread(this,threadname);
		t.start();}
	}
}

class sumprime implements Runnable{
	private Thread t;
	private String threadname;
	sumprime(String name){
		threadname=name;
		System.out.println("[*] Creating "+threadname);
	}
	public void run() {
		System.out.println("[~] Running "+threadname);
		try {
			for(int i=1;i<101;i++) {
				int m,t,s=0,f=0;
				t=i; // s is sum, t is temp
				while(t>0) {
					int a=t%10;
					s=s+a;
					t=t/10;
				}
				m=s/2;
				if(s==0||s==1){  
					   continue;      
				}
				else{  
				   for(int j=2;j<=m;j++){      
				    if(s%j==0){      
				     f=1;      
				     break;      
				    }      
				   }      
				   if(f==0)  { System.out.println("  [p] Thread "+threadname+" gave number "+i+ " whose sum of digit "+s+" is prime."); }  
				}
				
				/*if (i%s==0) {
					System.out.println("[+] Thread "+threadname+" gave number "+i+ " which has "+s+" as it's factor.");
				}*/
				Thread.sleep(10); 
			}
		}
		catch(InterruptedException e){
			System.out.println("[-] Thread "+threadname+" interrupted.....WOOPS!");
		}
		System.out.println("[!] Thread "+threadname+" exiting........GOODBYE!\n");
	}
	public void start() {
		System.out.println("[~] Starting "+threadname);
		if(t==null) {t=new Thread(this,threadname);
		t.start();}
	}
}

public class multithread_sumPrimeNnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("[?] Enter a number:");
		n=sc.nextInt();
		sumfactor t1=new sumfactor("Factor Thread",n);
		t1.start();
		sumprime t2=new sumprime("Prime Thread");
		t2.start();
	}

}
