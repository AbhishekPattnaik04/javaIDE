package codingPractice;

public class Customer {
	static String user_name;
	static String user_address;
	public static String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public static String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getAccount_details() {
		return account_details;
	}
	public void setAccount_details(String account_details) {
		this.account_details = account_details;
	}
	String account_details;
	public Customer(String user_name, String user_address) {
		super();
		this.user_name = user_name;
		this.user_address = user_address;
		this.account_details = account_details;
	}

}
