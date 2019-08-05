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
	 String fname = sc.next();
	 System.out.println("Enter Last Name : ");
	 String lname = sc.next();
	 System.out.println("Enter Amount to deposit :  ");
	 long amount = sc.nextLong();
	 System.out.println("Enter Phone Number: ");
	 long phonenumber =  sc.nextLong();
	 int accountid=(i+1);
	 
	 System.out.println("Enter the House number");
	 String hname = sc.next();
	 System.out.println("Enter the Street Name");
	 String sname = sc.next();
	 System.out.println("Enter the city name");
	 String cname = sc.next();
	 System.out.println("Enter the state name");
	 String stname = sc.next();
	 
	 HashMap<String,String> address=new HashMap<String,String>();
	 address.put("HouseNumber", hname);
	 address.put("Street",sname);
	 address.put("City", cname);
	 address.put("State", stname);
	 
	 System.out.println("Enter the Parent Account Id(-1 if doesnot exist):");
	 int parentid=sc.nextInt();
	 MyBank parent = getAccount(accounts,parentid);
	 MyBank myaccount = new MyBank(amount,fname,lname,parent,phonenumber,accountid,address);
	 accounts.add(myaccount);
	 
	 System.out.println("Your Account is created with account id : " + accountid);
	 
	 }
	 
	 
	 System.out.println(" Welcome to our Loan Service");
	 
	 System.out.println("Please Enter your account Id : ");
	 
	 int aid= sc.nextInt();
	 
	 MyBank account = getAccount(accounts,aid);
	 
	 if(account==null) {System.out.println("Your account doesnot exist");return ;}
	 
	 System.out.println("Enter the loan type(Home Loan,Education Loan,Personal Loan,Travel Loan):");

	 String loantype= sc.next();
	 
	 System.out.println("Enter the loan amount : ");
	 
	 int loanamount = sc.nextInt();
	 
	 System.out.println("Enter the loan time(in years): ");
	 
	 int loantime = sc.nextInt();
	 
	 int interest=account.getLoan(loantype, loanamount, loantime);
	 if(interest == -1) System.out.println("Loan Not granted");
	 else System.out.println("Loan Granted with interest " + interest);
	 
	 
 }
 
 public static MyBank getAccount(LinkedList<MyBank> accounts , int aid){
	 if(aid==-1) return null;
	 for(MyBank account : accounts){
		 if(account.accountid==aid) return account;
		}
	 return null;
	 
	 
 }
  
}
