
public class TravelLoan  implements Loan{
	MyBank mybank;
    int loanamount ; 
    int loantime;
    static final int maxRate = 1;
    static final int maxTime = 5;
    static final int minBal = 5000000;
	public int getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}

	public int getLoantime() {
		return loantime;
	}

	public void setLoantime(int loantime) {
		this.loantime = loantime;
	}

	public MyBank getMybank() {
		return mybank;
	}

	public void setMybank(MyBank mybank) {
		this.mybank = mybank;
	}
	// Returns 0 if not eligible else calculate interest value;
	@Override
	public int checkEligibility() {
		int fl=1;
		if(mybank.amount<=minBal || loantime>maxTime || loanamount > maxLoanAmount)
			fl=-1;
		
		if(fl==-1){
			System.out.println("You are not eligible");
		}
		else{
			System.out.println("You are eligible");
			fl = (int) mybank.amount*loantime*maxRate/100;
		}
		return fl;
	}

}
