
public class HomeLoan implements Loan {
    MyBank mybank;
    
	public MyBank getMybank() {
		return mybank;
	}

	public void setMybank(MyBank mybank) {
		this.mybank = mybank;
	}
	// Returns -1 if not eligible else calculate interest value;
	@Override
	public int checkEligibility() {
		System.out.println("In Home Loan");
		return 0;
	}

}
