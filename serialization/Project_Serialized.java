package serialization;

import java.io.*;
import java.util.*;

class ProjectSerial implements Serializable{
	String ProjName, ProjID, ProgBug, ProjLoc;
	ProjectSerial(String ProjName, String ProjID,String ProgBug, String ProjLoc){
		this.ProjName=ProjName;
		this.ProjID=ProjID;
		this.ProgBug=ProgBug;
		this.ProjLoc=ProjLoc;
	}
}

public class Project_Serialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Scanner sc= new Scanner(System.in);
		int projectCount=0;// initially
		int n;
		System.out.println("~ Enter your choice value: \n 1. Submit Project \n 2. View Projects \n 3. exit");
		n=sc.nextInt();
		
		
		while(n!=3) {
			String file="D:\\jv prac\\class question\\src\\project.txt";
			
			if(n==1) {			//saving objects in file -- Serialization 
				
				Scanner s= new Scanner(System.in);
				System.out.println("Enter project name ");
				String ProjName=s.nextLine(); 
				System.out.println("Enter project id");
				String ProjID=s.nextLine(); 
				System.out.println("Enter Project Budget");
				String ProjBug=s.nextLine();
				System.out.println("Enter project location");
				String ProjLoc=s.nextLine();
				
				
				try(	FileOutputStream f=new FileOutputStream(file,true); //true to open in append mode
						ObjectOutputStream out=new ObjectOutputStream(f);
						) {
					//FileOutputStream f=new FileOutputStream(file);
					//ObjectOutputStream out=new ObjectOutputStream(f);
					
					ProjectSerial[] p= new ProjectSerial[projectCount+1];
					p[projectCount]=new ProjectSerial(ProjName,ProjID,ProjBug,ProjLoc);
					out.writeObject(p[projectCount]);
					projectCount=projectCount+1;
					
					//out.close();
					//f.close();
					System.out.println("\nSerialization Successful... Checkout your specified output file..\n");
				}
				catch(FileNotFoundException e){System.out.println("File not found");}
				catch(IOException e){System.out.println(e);e.printStackTrace();}
				catch(Exception e) {System.out.println(e);e.printStackTrace();}
			}
			
			else if(n==2) {		//Reading objects from file -- De-serialization
				
				try(	FileInputStream f=new FileInputStream(file);
						ObjectInputStream in=new ObjectInputStream(f);
						)
					{
					//FileInputStream f=new FileInputStream(file);
					//ObjectInputStream in=new ObjectInputStream(f);
					ProjectSerial[] pout=new ProjectSerial[projectCount];
					
					for (int i=0;i<projectCount;i++) { // use for for ease
						pout[i]=(ProjectSerial)in.readObject();
					}
					System.out.println("There are "+projectCount+ " projects");
					for (int i=0;i<projectCount;i++) {
							System.out.println(pout[i].ProjName+" "+pout[i].ProjID+" "+pout[i].ProgBug+" "+pout[i].ProjLoc);
					}
					//out.close();
					//f.close();
				}
				catch(FileNotFoundException e){System.out.println("File not found");}
				catch(IOException e){System.out.println(e);e.printStackTrace();}
				catch(Exception e) {System.out.println(e);e.printStackTrace();}
			}
			else if(n==3) {
				System.out.println("[!] Goodbye!");
				System.exit(0);
			}
			else {
				System.out.println("[-] Wrong choice");
			}
			System.out.println("~ Enter your choice value: \n 1. Submit Project \n 2. View Projects \n 3. exit");
			n=sc.nextInt();
		}
	}

}
