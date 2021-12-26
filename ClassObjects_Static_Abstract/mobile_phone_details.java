package ClassObjects_Static_Abstract;

import java.util.Scanner;
public class mobile_phone_details {
	//get input
		public static String[][] set_mobileDetails() {
			Scanner sc=new Scanner(System.in);
			String[][] phone= new String[5][4];
			System.out.println("[~] Enter any 5 mobile details(Model_Name, Company_Name, Price, Manufacture_year):");
			for (int i=0;i<5;i++) {
				String[] inp=(sc.nextLine()).split(" ");
				phone[i]=inp;
			}
			System.out.println();
			System.out.println("[~] We have mobiles as :");
			for (int i=0;i<5;i++) {
				for (int j=0;j<4;j++) {
					System.out.print(phone[i][j]+" ");
				}
				System.out.println();
			}
			return phone;
		}
	//sorting		
	public static String[][] sort_mobileDetails() {
		String[][] phone=set_mobileDetails();
		String[] t;
		for (int i=0;i<5;i++) {
			for (int j=i+1;j<5;j++) {
				if(phone[i][1].compareTo(phone[j][1])>0) {
					t=phone[i];
					phone[i]=phone[j];
					phone[j]=t;
				}
			}
		}
		return phone;
	}	
	//display
	public static void display_mobileDetails() {
		String[][] sortedDetails=sort_mobileDetails();
		System.out.println();
		System.out.println("[~] We have mobiles as per comapny as:");
		for (int i=0;i<5;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(sortedDetails[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		display_mobileDetails();
	}
}
