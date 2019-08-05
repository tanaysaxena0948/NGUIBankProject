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
		switch(type){
		case "Home Loan":
			HomeLoan hl=new HomeLoan();
			 return hl.checkEligibility();
		case "Education Loan":
			EducationLoan el=new EducationLoan();
			return el.checkEligibility();
		case "Personal Loan":
			PersonalLoan pl=new PersonalLoan();
			return pl.checkEligibility();
		case "Travel Loan":
			TravelLoan tl=new TravelLoan();
			return tl.checkEligibility();
		default:
			System.out.println("Please Provide Correct Loan Type");
			return 0;
		
		}
		
		 
	}

}
