package multi_Thread_fileHandling;

import java.io.*;

class Prime {
	String file1="D:\\jv prac\\class question\\src\\filep1.txt";
	String file2="D:\\jv prac\\class question\\src\\filep2.txt";
	
	
	synchronized void findprime1to100() { //finding prime
		int a=1,b=100;
		System.out.println("~ Finding prime numbers between 1 to 100.");
		try(DataOutputStream dout=new DataOutputStream(new FileOutputStream(file1))){ //writing in file
			for (int j=a;j<=b;j++) {
				int flag = 0;
				for (int i=1;i<=j;i++) {
					if(j%i==0) {
						flag++;
					}
				}
				if(flag==2) {
					//System.out.println(j);
					String s=String.valueOf(j)+" ";
					dout.write(s.getBytes());
				}
				else {continue;}
			}
		}
		catch(FileNotFoundException e) { //Exception
			System.out.println(e);
			e.printStackTrace();
		}
		catch(IOException e) { 
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	synchronized void findprime101to200() { //finding prime
		int a=101,b=200;
		System.out.println("~ Finding prime numbers between 101 to 200.");
		try(DataOutputStream dout=new DataOutputStream(new FileOutputStream(file2))){ //writing in file
			for (int j=a;j<=b;j++) {
				int flag = 0;
				for (int i=1;i<=j;i++) {
					if(j%i==0) {
						flag++;
					}
				}
				if(flag==2) {
					//System.out.println(j);
					String s=String.valueOf(j)+" ";
					dout.write(s.getBytes());
				}
				else {continue;}
			}
			
		}
		catch(FileNotFoundException e) { //Exception
			System.out.println(e);
			e.printStackTrace();
		}
		catch(IOException e) { 
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	synchronized void display1() {
			try{
				System.out.println("\n[+] Reading "+file1);
				File file = new File(file1);
		        BufferedReader br = new BufferedReader(new FileReader(file));
		        String st;
		        while ((st = br.readLine()) != null)
		            System.out.print(st);
			}
			catch(FileNotFoundException e) { //Exception
				System.out.println(e);
				e.printStackTrace();
			}
			catch(IOException e) { 
				System.out.println(e);
				e.printStackTrace();
			}
		} 
	
	synchronized void display2() {
			try	{
				System.out.println("\n[+] Reading "+file2);
				File file = new File(file2);
			        BufferedReader br = new BufferedReader(new FileReader(file));
			        String st;
			        while ((st = br.readLine()) != null)
			            System.out.print(st);
			}
			catch(FileNotFoundException e) { //Exception
				System.out.println(e);
				e.printStackTrace();
			}
			catch(IOException e) { 
				System.out.println(e);
				e.printStackTrace();
			}
		} 
	}

public class PrimeFile_File_Multithread {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Prime p=new Prime(); //1obj 2 thread 
		// 2object 4 thread -->synchronization needed
		Thread t1=new Thread() {
			public void run() {p.findprime1to100();}
		};
		Thread t2=new Thread() {
			public void run() {p.findprime101to200();}
		};
		Thread t3=new Thread() {
			public void run() {p.display1();}
		};
		Thread t4=new Thread() {
			public void run() {p.display2();}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
		t4.start();
		
	}

}
