package inheritance_interface;

import java.util.Scanner;


//interface
interface exam{
	public int pass();
}
interface classify{
	public String average(int total);
}

class result implements exam, classify{
	int n;
	public int pass(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of subject: ");
		n=sc.nextInt();
		int[] marks=new int[n];
		int tot=0;
		System.out.println("Enter marks: ");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			tot=tot+marks[i];
		}
		return tot;
	}

	public String average(int total) {
		float avg=total/n;
		System.out.println("Average marks were: "+avg);
		int avgi=(int)avg;
		String avgs=Integer.toString(avgi);
		return avgs;
	}
	
	public void division(){
		int tot=pass();
		String avg=average(tot);
		int avgi=Integer.valueOf(avg);
		if (avgi>=60) {
			System.out.println("VIOLA! FIRST DIVISON...");
		}
		else if(avgi>=50 && avgi<60) {
			System.out.println("SECOND DIVISON...");
		}
		else if(avgi<50) {
			System.out.println("NO DIVISON...");
		}
	}
}


public class Exam_pass_avg_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		result obj=new result();
		obj.division();
	}

}
