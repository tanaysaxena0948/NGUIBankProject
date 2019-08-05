
public class EducationLoan implements Loan{
    MyBank mybank;
    
    
	public MyBank getMybank() {
		return mybank;
	}


	public void setMybank(MyBank mybank) {
		this.mybank = mybank;
	}

	// Returns 0 if not eligible else return tor(Time of Return) value in years;
	@Override
	public int checkEligibility() {
		// TODO Auto-generated method stub
		

		System.out.println("In Edu Loan");
		return 0;
	}

}
