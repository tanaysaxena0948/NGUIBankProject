
public interface Loan {
   // Returns 0 if not eligible else returns interest;
	int maxLoanAmount = 10000000;
   int checkEligibility();
   void setLoanamount(int loanamount);
   void setLoantime(int loantime);
   void setMybank(MyBank mybank);
}
