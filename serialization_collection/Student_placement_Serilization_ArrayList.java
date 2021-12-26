package serialization_collection;

import java.util.*;
import java.io.*;

class Student_placements implements Serializable{
	String name,course,cgpa,placement_stat;
	Student_placements(String name,String course,String cgpa, String placement_stat){
		this.name=name;
		this.course=course;
		this.cgpa=cgpa;
		this.placement_stat=placement_stat;
	}
}
public class Student_placement_Serilization_ArrayList {

	public static void main(String[] args) {
		Student_placements[] s= new Student_placements[3];
		s[0]=new Student_placements("abc","java","9","true");
		s[1]=new Student_placements("zxc","dbms","8","false");
		s[2]=new Student_placements("qwe","os","8.5","true");
		
		String file="D:\\jv prac\\class question\\src\\student.txt";
		//serialization
		try(
				FileOutputStream f=new FileOutputStream(file);
				ObjectOutputStream out=new ObjectOutputStream(f);
				) {
			out.writeObject(s[0]);
			out.writeObject(s[1]);
			out.writeObject(s[2]);
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");
		}
		catch(Exception e){System.out.println(e);e.printStackTrace();}
		
		//De-serialization
		try(
				FileInputStream f=new FileInputStream(file);
				ObjectInputStream in=new ObjectInputStream(f);
				)
		{
			Student_placements[] e=new Student_placements[3];
			ArrayList<ArrayList<String>> placed_student =new ArrayList<ArrayList<String>>();
			for (int i=0;i<3;i++) { // use for for ease
				e[i]=(Student_placements)in.readObject();
			}

			for (int i=0;i<3;i++) {
				if((e[i].placement_stat).equals("true") ) {
					System.out.println("Student searching for is : "+e[i].name+" under the course"+e[i].course+" with cgpa"+e[i].cgpa+" is placed.");
					placed_student.add(new ArrayList<String>(Arrays.asList(e[i].name,e[i].course,e[i].cgpa,e[i].placement_stat)));
				}
			}
			
			//displaying array_list
			System.out.println("\n[+] Student's details in array_list");
			for (List<String> list : placed_student) {
	            for (String item : list) {
	                System.out.print("  "+ item+ ", ");
	            }
	            System.out.print("\n");
	        }
		}
		catch(Exception e){System.out.println(e);e.printStackTrace();}
	}
}