

public class HomeLoan implements Loan {
    MyBank mybank;
    int loanamount ; 
    int loantime;
    static final int minBal = 1000000;
    static final int maxRate = 6;
    static final int maxTime = 5;
	
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
	// Returns -1 if not eligible else calculate interest value;
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
			fl = (int) (mybank.amount*Math.round(Math.pow(1+maxRate,loantime)));
		}
		return fl;
	}

}
