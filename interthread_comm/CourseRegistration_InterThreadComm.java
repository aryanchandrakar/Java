package interthread_comm;

class CourseRegistration{
	String CourseName;
	String Faculty;
	int NumberOfSeats;
	
	CourseRegistration(String cn,String fac,int seat){
		CourseName=cn;
		Faculty=fac;
		NumberOfSeats=seat;
	}
	
	//register seat
	synchronized void RegisterSeat(){
		
		if (NumberOfSeats==0) {
			System.out.println("[-]"+Thread.currentThread().getName()+" says seat are 0!");
			try {wait();}   
			catch(Exception ue) {System.out.println("[!]Exception occured at register seat :"+ ue);}
		}
		NumberOfSeats=NumberOfSeats-1; //deduct 1 seat
		System.out.println("[+] Seat registered by "+Thread.currentThread().getName());
	}
	
	//allocate seat
	synchronized void AllocateSeat(int seats) {
		NumberOfSeats=NumberOfSeats+seats;
		System.out.println("[+] "+Thread.currentThread().getName()+" added "+seats+" seats, total "+NumberOfSeats+"seats left!");
		notifyAll();
	}
	
	//display seats remaining
	void display() { //enquiring the value no need to be synchronized
		System.out.println("[*] Total number of seats remaning are: "+NumberOfSeats+" says "+Thread.currentThread().getName());
	}
	
}
public class CourseRegistration_InterThreadComm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************** Hello 18BCI0174 - Aryan ****************");
		CourseRegistration c=new CourseRegistration("Java Programming","Hilda",0); //initialisze constructor
		Thread t1=new Thread() {
			public void run() {c.RegisterSeat();}
		};
		Thread t2=new Thread() {
			public void run() {c.RegisterSeat();}
		};
		Thread t3=new Thread() {
			public void run() {c.AllocateSeat(60);}
		};
		Thread t4=new Thread() {
			public void run() {c.display();}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
