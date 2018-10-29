
public class BankAccount {
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftAllowedSum;

	// ------------------------ Getters, setters and Constructors --------------------------//
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftAllowedSum() {
		return overDraftAllowedSum;
	}

	public void setOverDraftAllowedSum(double overDraftSum) {
		this.overDraftAllowedSum = overDraftSum;
	}

	public BankAccount() {
		super();
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftAllowedSum = 0;
	}

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftAllowedSum) {
		super();
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftAllowedSum = overDraftAllowedSum;
	}
	

	
	
	// ------------------ deposit Action ----------------------------//

	public void deposit(double depositSum) {
		if (depositSum >= 0) {
			setBalance(getBalance() + depositSum);
		} else {
			System.out.println("The deposit sum must be zero or above");
		}
	}
  //-------------------- withdrawal action ----------------------------// 
	public void withdrawal(double withdrawalSum) {
		if (withdrawalSum >= 0 && withdrawalSum <= getBalance()) {
			setBalance(getBalance() - withdrawalSum);
			System.out.println("The withdrawal sum is: " + withdrawalSum);

		} else {
			if (withdrawalSum < 0) {
				System.out.println("The withdrawal sum must be zero or above");
			} else if (withdrawalSum > getBalance()) {
				overDraftCase(withdrawalSum);
			}
		}
	}

	
	  //-------------------- withdrawal action in case the  withdrawal is bigger than the balance ----------------------------// 

	public void overDraftCase(double withdrawalSum) {
		if (isOverDraftAllowed() == false) {
			System.out.println("Over draft is not allowed, the withdrawal sum is: " + getBalance());
			setBalance(0);
		} else {
			if (withdrawalSum - getBalance() < getOverDraftAllowedSum()) {
				setOverDraftAllowedSum(getOverDraftAllowedSum() - (withdrawalSum - getBalance()));
				setBalance(0);
				System.out.println("The withdrawal sum is: " + withdrawalSum);

			} else {
				System.out.println("The withdrawal sum is: " + (getBalance() + getOverDraftAllowedSum()));
				setBalance(0);
				setOverDraftAllowedSum(0);
			}
		}

	}

	
	///--------------------- print ----------------------------//
	public void print() {
		System.out.println(
				"Account name: " + getAccountName() + "\nAccount num: " + getAccountNum() + "\nAccount balance: "
						+ getBalance() + "\nOver draft is " + (isOverDraftAllowed() == true ? "" : "not") + " allowed");
		if (isOverDraftAllowed() == true) {
			System.out.println("The sum of the allowed over draft is: " + getOverDraftAllowedSum());
		}
	}

}
