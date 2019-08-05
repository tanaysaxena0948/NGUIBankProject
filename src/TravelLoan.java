
public class TravelLoan  implements Loan{
    MyBank mybank;
    
	public MyBank getMybank() {
		return mybank;
	}

	public void setMybank(MyBank mybank) {
		this.mybank = mybank;
	}
	// Returns 0 if not eligible else calculate interest value;
	@Override
	public int checkEligibility() {
		// TODO Auto-generated method stub

		System.out.println("In Travel Loan");
		return 0;
	}

}
