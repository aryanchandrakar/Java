package serialization;

import java.io.*;
import java.util.*;

class Employee implements Serializable{
	String name,  empid, Skoolname,  email,  address;
	Employee(String name, String empid,String Skoolname, String email, String address){
		this.name=name;
		this.empid=empid;
		this.Skoolname=Skoolname;
		this.email=email;
		this.address=address;
	}
}

public class Employee_Searlized {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		Employee[] emp=new Employee[3];
		emp[0]=new Employee("qwe","123","SCOPE","qwe@gmail.com","789,vit,Vellore");
		emp[1]=new Employee("asd","456","SITE","asd@gmail.com","456,vit");
		emp[2]=new Employee("zxc","789","SENSE","zxc@gmail.com","123,vit");
		
		String file="D:\\jv prac\\class question\\src\\employee.txt";
		//saving objects in file -- Serialization 
		try(
				FileOutputStream f=new FileOutputStream(file);
				ObjectOutputStream out=new ObjectOutputStream(f);
				) {
			
			//FileOutputStream f=new FileOutputStream(file);
			//ObjectOutputStream out=new ObjectOutputStream(f);
			out.writeObject(emp[0]);
			out.writeObject(emp[1]);
			out.writeObject(emp[2]);
			//out.close();
			//f.close();
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");
		}
		catch(Exception e){System.out.println(e);e.printStackTrace();}
		
		//Reading objects from file -- De-serialization
		try(
				FileInputStream f=new FileInputStream(file);
				ObjectInputStream in=new ObjectInputStream(f);
				)
		{
			//FileInputStream f=new FileInputStream(file);
			//ObjectInputStream in=new ObjectInputStream(f);
			Employee[] e=new Employee[3];
			
			for (int i=0;i<3;i++) { // use for for ease
				e[i]=(Employee)in.readObject();
			}
			/*e[0]=(Employee)in.readObject();
			e[1]=(Employee)in.readObject();
			e[2]=(Employee)in.readObject();*/
			
			for (int i=0;i<3;i++) {
				if((e[i].Skoolname).equals("SCOPE") && (e[i].address).contains("Vellore")) {
					System.out.println("Employee searching for is : "+e[i].name+" "+e[i].empid+" "+e[i].Skoolname+" "+e[i].email+" "+e[i].address);
				}
			}
		}
		catch(Exception e){System.out.println(e);e.printStackTrace();}
	}

}
