import java.util.HashMap;

public interface Bank {
	// Get Complete name of the Account Holder
  String getUser();
    // Get the phone number of the Account Holder
  long getPhoneNumber();
   // Get the Account Id of the Account Holder
  int getAccountId();
    // Get the address
  HashMap<String,String> getAddress();
    // Get the loan
  int getLoan(String type,int loanAmount , int loantime);
}
