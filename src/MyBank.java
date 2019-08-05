import java.util.HashMap;

public class MyBank implements Bank {
	long amount;
	String fname;
	String lname;
	MyBank parent;
	long phonenumber ; 
	int accountid;
	HashMap<String,String> address; 
	
	
	

	public MyBank(long amount, String fname, String lname, MyBank parent, long phonenumber, int accountid,
			HashMap<String, String> address) {
		super();
		this.amount = amount;
		this.fname = fname;
		this.lname = lname;
		
		this.parent = parent;
		this.phonenumber = phonenumber;
		
		this.address = address;
	}
	// Get Complete name of the Account Holder
	@Override
	public String getUser() {
		
		return fname + " " + lname;
	}
	// Get the phone number of the Account Holder
	@Override
	public long getPhoneNumber() {
		return phonenumber;
	}
	// Get the employee id
	@Override
	public int getAccountId() {
		
		return accountid;
	}
	// Get the address
	@Override
	public HashMap<String, String> getAddress() {
		
		return address;
	}
	// Get the loan
	@Override
	public int getLoan(String type, int loanAmount,int loantime) {
		
		Loan l;
		
		switch(type){
		case "Home Loan":
			l=new HomeLoan();
			break;
		case "Education Loan":
			l=new EducationLoan();
			break;
		case "Personal Loan":
			l=new PersonalLoan();
			break;
		case "Travel Loan":
			l=new TravelLoan();
			break;
		default:
			System.out.println("Please Provide Correct Loan Type");
			return 0;
		
		}
		
		l.setMybank(this);
		l.setLoanamount(loanAmount);
		l.setLoantime(loantime);
		
		return l.checkEligibility(); 
	}

}
