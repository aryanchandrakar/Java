package multithreading;

import java.util.Scanner;

class oddthread extends Thread{
	private Thread t;
	private String threadname;
	int num;
	oddthread(String name,int n){
		threadname=name;
		num=n;
		System.out.println("[*] Creating "+threadname);
	}
	public void run() {
		System.out.println("[~] Running "+threadname);
		try {
			for(int i=0;i<num;i++) {
				if(i%2!=0) {
					System.out.println("[+] Thread "+threadname+" gave odd number "+i);
				}
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

class eventhread extends Thread{
	private Thread t;
	private String threadname;
	int num;
	eventhread(String name,int n){
		threadname=name;
		num=n;
		System.out.println("[*] Creating "+threadname);
	}
	public void run() {
		System.out.println("[~] Running "+threadname);
		try {
			for(int i=0;i<num;i++) {
				if(i%2==0) {
					System.out.println("[+] Thread "+threadname+" gave even number "+i);
				}
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

public class multithread_oddEven {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("[~] Enter a range of choice:");
		n=sc.nextInt();
		
		eventhread t1=new eventhread("Even Thread",n+1);
		t1.start();
		oddthread t2=new oddthread("Odd Thread",n+1);
		t2.start();
		
	}

}
