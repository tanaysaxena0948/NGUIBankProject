import java.util.*;

public class Executor {
 public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 LinkedList<MyBank> accounts = new LinkedList<MyBank>();
	 
	 System.out.println("Enter the Number of Account you want to create :  ");
	 
	 int nacounts= sc.nextInt();
	 
	 // Creating Accounts of User in MyBank 
	 for(int i = 0 ; i < nacounts ; i++ ) {
	 System.out.println(" Enter Account Holder" +(i+1)+"Details ");
	 System.out.println("Enter First Name : ");
	 String pfname = sc.next();
	 System.out.println("Enter Last Name : ");
	 String plname = sc.next();
	 System.out.println("Enter Amount to deposit :  ");
	 long amount = sc.nextLong();
	 System.out.println("Enter Phone Number: ");
	 long phonenumber =  sc.nextLong();
	 
	 
	 }
	 
	 
	 
	 
 }
 
}
