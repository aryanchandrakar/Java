package interthread_comm;

import java.util.*;

class bakery{
	int vessel=0; //initially vessel is empty
	
	synchronized void baker() {
		System.out.println("[+] Welcome to bakery");
		while(true) {
			if(vessel==10) {
				try{
					System.out.println("[*] Vessel is full!");
					wait();
				}
				catch(Exception e) {System.out.println("[-] Vessel issue "+e);}
			}
			else if(vessel<10) {
				try {
					System.out.println("[*] Baking please wait");
					vessel=vessel+1;
					notify();
					Thread.sleep(1000);
				}
				catch(Exception e) {System.out.println("[-] Baking issue "+e);}
			}
		}
	}
	synchronized void customer() throws InterruptedException {
		System.out.println("[!] Customer has arrived");
		while(true) {
			if(vessel>0) {
				vessel=vessel-1;
				System.out.println("[+] Customer bought cake");
				notify();
				Thread.sleep(1000);
			}
			else if(vessel==0) {
				System.out.println("[~] Customer is waiting");
				try{
					wait();
				}
				catch(Exception e) {System.out.println("[-] Customer left"+e);}
			}
		}
	}
}

public class bakery_threadComm {
	 public static void main(String[] args) throws InterruptedException {
		 System.out.println("*************** 18BCI0174 - Aryan ****************");
		 bakery b= new bakery();
		 Thread t1=new Thread() {
			 public void run() {
				 b.baker();
			 }
		 };
		 Thread t2 =new Thread() {
			 public void run() {
				 try {
					b.customer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		 };
		 t1.start();
		 t2.start();
		
		 //t1.join();
		 //t2.join();
	 }
}