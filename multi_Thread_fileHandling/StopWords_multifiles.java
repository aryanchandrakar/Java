package multi_Thread_fileHandling;

import java.io.*;

class StopWord{
	String file1="D:\\jv prac\\class question\\src\\file1.txt";
	String file2="D:\\jv prac\\class question\\src\\file2.txt";
	
	void allstop(String t) {
		try(BufferedReader b=new BufferedReader(new FileReader(file1))){
			String s;
			int count=0;
			while((s=b.readLine())!=null) {
				String words[] = s.split(" ");  
				//System.out.println(s); //to print the lines
				for(String i:words) {
					//System.out.println(i); //print the words
					if(i.equals("a") || i.equals("and") || i.equals("the")) {
						count+=1;
					}
				}
			}
			System.out.println("[+] There are ["+count+"] stop words {'a','and','the'} in the file. says "+t);
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
	
	void allexceptstop(String t){
		try(BufferedReader b=new BufferedReader(new FileReader(file2))){
			String s;
			int counth=0;
			int count=0;
			while((s=b.readLine())!=null) {
				String words[] = s.split(" ");  
				//System.out.println(s); //to print the lines
				for(String i:words) {
					//System.out.println(i); //print the words
					if(i.equals("a") || i.equals("and") || i.equals("the")) {
						continue;
					}
					else if(i.startsWith("h") || i.startsWith("H")) {
						counth+=1;
						count+=1;
					}
					else{
						count+=1;
					}
				}
			}
			System.out.println("[+] There are ["+count+"] words except stop words {'a','and','the'} in the file, with ["+counth+"] words starting with 'h/H'. says "+t);
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
	
	void thankyou(String t) {
		System.out.println("[+] Thankyou for using the service. says"+t);
	}
}
public class StopWords_multifiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("*************** 18BCI0174 - Aryan ****************");
		StopWord sw=new StopWord();

		Thread t1=new Thread() {
			 public void run() {
				 try {
					sw.allstop("t1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			 }
		 };
		 Thread t2=new Thread() {
			 public void run() {
				 try {
					 sw.allexceptstop("t2");
				} catch (Exception e) {
					e.printStackTrace();
				}
			 }
		 };
		 Thread t3=new Thread() {
			 public void run() {
				 try {
					 sw.thankyou("t3");
				} catch (Exception e) {
					e.printStackTrace();
				}
			 }
		 };
		 t1.setPriority(3);
		 t2.setPriority(2);
		 t3.setPriority(1);
		 
		 t1.start();
		 t2.start();
		 t1.join(); //waiting for both t1, t2 to finish
		 t2.join();
		 t3.start();
		 
	}

}
