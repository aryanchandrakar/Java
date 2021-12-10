import java.util.Scanner;
public class hcf_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		int p,q;
     	int gcd,lcm,r,n,d;
 Scanner sc = new Scanner(System.in);
     	System.out.println("Enter two Numbers");
     	p=sc.nextInt();
 q=sc.nextInt();
     	if (p>q)
 { 
         n=p;
         d=q;
     }
     else
     {
       n=q;
       d=p;
     	}
     	r=n%d;
     while(r!=0)
     {
    	   n=d;
        d=r;
       r=n%d;
     }
     gcd = d;
     lcm = p*q/gcd;
     System.out.println("GCD = "+gcd);
     System.out.println("LCM = "+lcm);
	}

}
