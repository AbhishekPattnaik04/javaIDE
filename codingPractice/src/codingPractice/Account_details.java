package codingPractice;

public class Account_details {
	static String account_no;
	static String account_type;
	public static String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public static String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public static String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	public static int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	static String IFSC_code;
	static int balance;
	public Account_details(String account_no, String account_type, String iFSC_code, int balance) {
		super();
		this.account_no = account_no;
		this.account_type = account_type;
		IFSC_code = iFSC_code;
		this.balance = balance;
	}

}
