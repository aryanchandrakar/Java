import java.util.Scanner;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		int m,p,c,e,cs,tot;
		double oa,ea,csa;
		System.out.println("Enter marks:");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		p=sc.nextInt();
		c=sc.nextInt();
		e=sc.nextInt();
		cs=sc.nextInt();
		tot=m+p+c+e;
		oa=tot/4;ea=(m*2)+p+(c/4);csa=cs;
		if(oa>75 && ea>csa){System.out.println("Probable Mech, Civil, EEE, ECE candidate");}
		else if(oa>75 && csa>ea){System.out.println("Probable CSE, IT, IS candidate");}
		else if(oa<75 && csa>ea) {System.out.println("Probable BCA & BSc candidate");}
		else{System.out.println("Not probable for any thing");}
	}

}
