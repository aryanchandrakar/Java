package collections;
import java.util.*;

interface StringSort{
	public void sort();
}

public class String_ArrayList_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		//arrayList
		ArrayList<String> list =new ArrayList<String>();
		list.add("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. ");
		list.add("The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. ");
		list.add("Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.");
		list.add("Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");

		int size=list.size(); // List size
		
		StringSort length =()->{
			//lambda expression for length sort
			String t;
			for(int i=0;i<size;i++) {
				for(int j=i;j<size;j++) {
					if((list.get(i)).length()>(list.get(j)).length()) {
						t=list.get(i);
						list.set(i,list.get(j));
						list.set(j,t);
					}
				}
			}
			//Traversing list through iterator
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		};
		
		StringSort lengthreverse =()->{
			//lambda expression for length sort
			String t;
			for(int i=0;i<size;i++) {
				for(int j=i;j<size;j++) {
					if((list.get(i)).length()<(list.get(j)).length()) {
						t=list.get(i);
						list.set(i,list.get(j));
						list.set(j,t);
					}
				}
			}
			//Traversing list through iterator
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		};
		
		StringSort alphabatical =()->{
			//lambda expression for length sort
			String t;
			for(int i=0;i<size;i++) {
				char a=(list.get(i)).charAt(0); //only first character
				for(int j=i;j<size;j++) {
					char b=(list.get(j)).charAt(0); //only first character
					int compare = Character.compare(a,b);
					if(compare>0) {
						t=list.get(i);
						list.set(i,list.get(j));
						list.set(j,t);
					}
					else {
						continue;
					}
					
				}
			}
			//Traversing list through iterator
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		};
		
		StringSort withe =()->{
			//lambda expression for length sort
			String t;
			for(int i=0;i<size;i++) {
				for(int j=i;j<size;j++) {
					int a=(list.get(i)).indexOf("e");
					int b=(list.get(j)).indexOf("e");
					if(a>b) {
						t=list.get(i);
						list.set(i,list.get(j));
						list.set(j,t);
					}
					else {
						continue;
					}
				}
			}
			//Traversing list through iterator
			Iterator itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		};
		
		// calling lambda functions
		System.out.println("[+] Sorting as");
		System.out.println("[~] Length i.e. shortest to longest");
		length.sort();
		System.out.println("\n[~] Reversed Length i.e. longest to shortest");
		lengthreverse.sort();
		System.out.println("\n[~] alphabatically i.e. first character");
		alphabatical.sort();
		System.out.println("\n[~] String with 'e' first");
		withe.sort();
	}

}
