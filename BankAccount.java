
public class BankAccount {
	
	private long AccountNum = 0;
	private double balance = 0;
	private String custName = " ";
	private String email = " ";
	private String phnNo = " ";
	private final double depositLimit = 50.0;
	private final double withdrawLimit = 100.0;
	
	public long getAccountNum() {
		return AccountNum;
	}
	public double getBalance() {
		return balance;
	}

	public String getCustName() {
		return custName;
	}


	public String getEmail() {
		return email;
	}

	public String getPhnNo() {
		return phnNo;
	}


	public BankAccount() {
		this.AccountNum = 123456789;
		this.balance = 50.0;
		this.custName = "manikanta";
		this.email = "mrekapally@gmail.com";
		this.phnNo= "516-857-1733";
	}
	
	public BankAccount(long accNo, double bal, String name , String email, String phone ) {
		this.AccountNum = accNo;
		this.balance = bal;
		this.custName= name;
		this.email = email;
		this.phnNo = phone;
	}
	
	public void depositFunds(double amount) {
		if(amount <= depositLimit) {
			this.balance = this.balance + amount;
			System.out.println("your account balance is: " + this.balance);
		}else {
			System.out.println("Yo! Please visit bank to deposit more than 50$");
		}
		
	}
	
	public void withdrawFunds(double withdrawAmt) {
		if(withdrawAmt > this.balance ) {
			System.out.println("Low Balance");
		}
		else if(withdrawAmt < this.balance && withdrawAmt <= withdrawLimit  ) {
			this.balance = this.balance - withdrawAmt;
			System.out.println("Hey "+ this.custName + ", Your account balance after this withdrawal is:  " + this.balance);
		} 
		else {
			System.out.println("Yo! Please visit bank to withdraw more than 100$");
		}
		
	}
	
	public void CustInfo() {
		System.out.println("Hey "+ this.custName + ", Whats up? " + "\n" + "Your account no is: " + this.AccountNum
				+ "\n" + "Your balance is: " + "$" + this.balance + "\n" +
				"Email Address: " + this.email + "\n" + "Phone number: " + this.phnNo );
	}
	

	

}
