package collections;
import java.util.*;

class Books{
	String bookname,author,price,type;
	ArrayList<ArrayList<String>> fiction =new ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<String>> comic =new ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<String>> cooking =new ArrayList<ArrayList<String>>();
	
	void input() { //one book details add at a time in this method
		System.out.println("[?] How many books?");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("[+] Enter book details: ~ book namme ~ author ~ price ~ type");
			Scanner sc=new Scanner(System.in);
			bookname=sc.nextLine();
			author=sc.nextLine();
			price=sc.nextLine();
			type=sc.nextLine();
			if(type.equals("fiction")) {
				fiction.add(new ArrayList<String>(Arrays.asList(bookname,author,price,type)));
			}
			else if(type.equals("comic")) {
				comic.add(new ArrayList<String>(Arrays.asList(bookname,author,price,type)));
			}
			else if(type.equals("cooking")) {
				cooking.add(new ArrayList<String>(Arrays.asList(bookname,author,price,type)));
			}
		}
	}
	
	void display() { // all books details displayed
		System.out.println("[+] fiction books");
		for (List<String> list : fiction) {
            for (String item : list) {
                System.out.print("  "+ item+ ", ");
            }
            System.out.print(";\n");
        }
		System.out.println("[+] comic books");
		for (List<String> list : comic) {
            for (String item : list) {
                System.out.print("  "+ item+ ", ");
            }
            System.out.print(";\n");
        }
		System.out.println("[+] cooking books");
		for (List<String> list : cooking) {
            for (String item : list) {
                System.out.print("  "+ item+ ", ");
            }
            System.out.print(";\n");
        }
	}
	
	void sortname(ArrayList<ArrayList<String>> books) { // one list of books sorted using book name
		for (int i=0;i<books.size();i++) {
            for (int j=i;j<books.size();j++) {
            	String a =books.get(i).get(0);
            	String b =books.get(j).get(0);
            	ArrayList<String> t =new ArrayList<String>();
            	if(a.compareTo(b)>0) {
            		t=books.get(i);
            		books.set(i,books.get(j));
            		books.set(j,t);
				}
            }
        }
	}
	void sortnamecaller() {
		System.out.println("\n[+] sorted books");
		sortname(fiction);
		sortname(comic);
		sortname(cooking);
		display();
	}
	
	void maxminprice(ArrayList<ArrayList<String>> books) { //sorting the argument's list price
		System.out.println(" ~ price of books");
		int pri[]=new int[books.size()];
		for (int i=0;i<books.size();i++) {
			String p=books.get(i).get(2);
			pri[i]=Integer.valueOf(p);
        }
		int max=pri[0],min=pri[0];
		for (int i=0;i<pri.length;i++) {
			if(pri[i]>max) { //for max
				max=pri[i];
			}
			else if(pri[i]<min) { //for min
				min=pri[i];
			}
			else {continue;}
		}
		System.out.println("~ max price :"+max+"\n~ min price :"+min);
	}
	void maxmincaller() {
		System.out.println("\n[~] MAX & MIN Prices");
		System.out.println("[+] for fiction");
		maxminprice(fiction);
		System.out.println("[+] for comic");
		maxminprice(comic);
		System.out.println("[+] for cooking");
		maxminprice(cooking);
	}
}

public class Fiction_ArrayList_Collection {

	public static void main(String[] args) {
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		// TODO Auto-generated method stub
		Books b=new Books();
		b.input();
		b.display();
		b.sortnamecaller();
		b.maxmincaller();
	}

}
