package collections;
import java.util.*;  

public class courseFaculty_HashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		// Hash Map H1
		HashMap<String,ArrayList<String>> StudentCourses=new HashMap<String,ArrayList<String>>();//Creating HashMap
		//STUDENT 1
		StudentCourses.put("Qwerty",new ArrayList<String>()); 
		StudentCourses.get("Qwerty").add("Python");
		StudentCourses.get("Qwerty").add("Java");
		StudentCourses.get("Qwerty").add("C");
		//STUDENT 2
		StudentCourses.put("Asdfg",new ArrayList<String>()); 
		StudentCourses.get("Asdfg").add("C");
		StudentCourses.get("Asdfg").add("Java");
		//STUDENT 3
		StudentCourses.put("Zxcvb",new ArrayList<String>()); 
		StudentCourses.get("Zxcvb").add("Java");
		StudentCourses.get("Zxcvb").add("Python");
		StudentCourses.get("Zxcvb").add("C++");
		
		// Hash Map H2
		HashMap<String,String> CourseFaculty=new HashMap<String,String>();//Creating HashMap
		CourseFaculty.put("C","Aaaa");
		CourseFaculty.put("C++","Bbbb");
		CourseFaculty.put("Python","Cccc");
		CourseFaculty.put("Java","Dddd");
		
		// Matching
		for(Map.Entry i : StudentCourses.entrySet()){   
			System.out.println("[+] For Student "+i.getKey()+" who took "+i.getValue()+" has faculties");
			for(Map.Entry j : CourseFaculty.entrySet()){  
				if(((i.getValue()).toString()).contains((CharSequence) j.getKey())) {
					System.out.println("\t ~ "+j.getValue()+" for the subject "+j.getKey());
				}
				else {
					continue;
				}
			}
			System.out.println();
		}
		
	  
	}
}
