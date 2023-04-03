package Evalution;

import java.util.ArrayList;
import java.util.Scanner;

public class Irctc {

	public static void main(String[] args) {
	met();
	}
	public static void met() {
      Scanner ss=new Scanner(System.in);
	  System.out.println("1.Admin || 2.User || 3.Exit");
	  int i=ss.nextInt();
	  switch(i) {
	  case 1:
		    Admin ad= Admin.CrateObject();
		    ad.adminAction();
		    break;
	  case 2:
		  User client=User.CrateObject();
		  client.use();
		  break;
		  
	  case 3:
		    break;
	  }

	}
}

	

class Admin{
	
	 ArrayList<TrainDetails>train=new ArrayList<>();
	
	private static Admin obj;
	private Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public static Admin CrateObject() {
		if(obj==null) {
			obj=new Admin();
		}
		return obj;
	}
	
	static Scanner s1=new Scanner(System.in);
	
     public void adminAction() {
    	 System.out.println("Enter ADMIN USERNAME");
    	 String username=s1.next();
    	 System.out.println("Enter ADMIN PASSWORD");
    	 String password=s1.next();
    	 String uname="Abdur";
    	 String pass="Abu306";
    	 if(username.equals(uname) && password.equals(pass)) {
    		 System.out.println("...................Login Success ...............");
    		 aduse();
    	 }
    	 else {
    		 System.out.println("Invalid Input..Try Again");
    		 adminAction();
    	 }
     }
     public void aduse() {
    	 System.out.println("1.Add Train || 2.View || 3.MainMenu");
    	 int inad=s1.nextInt();
    	 switch(inad) {
    	 case 1:
    		   AddTrain();
    		   break;
    	 case 2:
    		  ViewAdmin();
    		   break;
    	 case 3:
    		 Irctc.met();
    		 break;
          }
     }
     public void AddTrain() {
    	 System.out.println("No of Schedule");
    	 int schedule=s1.nextInt();
    	 System.out.println("Train num");
    	 int tnumber=s1.nextInt();
    	 System.out.println(" Train Name");
    	 String tname=s1.next();
    	 System.out.println(" Train Depature ");
    	 Double tdeptime=s1.nextDouble();
    	 System.out.println(" Train Arraival");
    	 Double tarrtime=s1.nextDouble();
    	 System.out.println(" seates");
    	 int seats=s1.nextInt();
    	 System.out.println(" Train Route");
    	 String route=s1.next();
    	 System.out.println(" fare");
    	 int fare=s1.nextInt();
        train.add(new TrainDetails(schedule,tnumber,tname,tdeptime,tarrtime,seats,route,fare));
    	 System.out.println("Added Succcessfully");
    	 //System.out.println(schedule+" "+tnumber+" "+tname+" "+tdeptime+" "+tarrtime+" "+seats+" "+route+" "+fare);
    	//System.out.println(train);
    	 aduse();
     }
     public void ViewAdmin() {
    	 System.out.println("Available Trains  ");
    	 System.out.println("Schedul\ttnumber\ttname\ttdep\ttarr\ttroute\ttseates\tfare\t");
    	 for(int i=0;i<train.size();i++) {
    		 System.out.println(train.get(i));
    	 }
    	 aduse();
    	 
     }
}
class User{
		
	private static User obj;
	private User() {
		// TODO Auto-generated constructor stub
	}
	
	public static User CrateObject() {
		if(obj==null)
			obj=new User();
		return obj;
	}
	ArrayList<Tickets>ticks=new ArrayList<>();
	int c=99;
	
	static Scanner s2=new Scanner(System.in);
	public void use() {
		System.out.println("1.Booking || 2.Pnr Status || 3.Booked Tickets || 4.Cancel || 5.Search Passenger || 6.Tickets Status || 7.Tain routs || 8.Back ");
		int in=s2.nextInt();
		switch(in) {
		case 1:
			Booking();
			break;
		case 2:
			CheckPnr();
			break;
		case 3:
			ShowTickets();
			break;
		case 4:
			Cancel();
			break;
		case 5:
			SearchPass();
			break;
		case 6:
			TicketsStatus();
			break;
		case 7:
			ViewTrain();
			break;
		}
    }
	public void Booking() {
		System.out.println("From Station");
		String str1=s2.next();
		System.out.println("To Station");
		String str2=s2.next();
		
		
		System.out.println("T num");
		int tnum=s2.nextInt();
		System.out.println("Name");
		String pname=s2.next();
		System.out.println("Age");
		int age=s2.nextInt();
		System.out.println("Gender");
		String gen=s2.next();
		int id=c++;
		ticks.add(new Tickets(tnum, pname, age, gen, id));
		System.out.println("booked");
		System.out.println(tnum+" "+pname+" "+age+" "+gen+" "+id);
		System.out.println(ticks);
		
		
	}
	public void CheckPnr() {
		
	}
	public void ShowTickets() {
		
	}
	public void Cancel() {
		
	}
	public void SearchPass() {
		
	}
	public void TicketsStatus() {
		
	}
	public void ViewTrain() {
		Admin ab=Admin.CrateObject();
		
		for(int i=0;i<ab.train.size();i++) {
			System.out.println(ab.train.get(i));
		}
		
	}
}
class TrainDetails{
	int Schedule;
	int tnumber;
	String tname;
	double tdeptime;
	double tarrtime;
	int seats;
	String route;
	int fare;
	public TrainDetails(int Schedule,int tnumber,String tname,double tdeptime,double tarrtime,int seats,String route,int fare) {
	this.Schedule= Schedule;
	 this.tnumber=tnumber;
	 this.tname=tname;
	 this.tdeptime=tdeptime;
	 this.tarrtime=tarrtime;
	 this.seats=seats;
	 this.route=route;
	 this.fare=fare;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Schedule+"\t"+tnumber+"\t"+tname+"\t"+tdeptime+"\t"+tarrtime+"\t"+seats+"\t"+route+"\t"+fare;
	}
}
class Tickets{
	int tnum;
	String name;
	int age;
	String gender;
	int id;
	public Tickets(int tnum,String name,int age,String gender,int id) {
		this.tnum=tnum;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tnum+"\t"+name+"\t"+age+"\t"+gender+"\t"+id;
	}
	
}


