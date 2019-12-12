package codingPractice;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of customers");
		int num=sc.nextInt();
		sc.nextLine();
		Customer[] cust=new Customer[num];
		for(int i=0;i<num;i++)
		{
		System.out.println("enter user name");
		String user=sc.nextLine();
		System.out.println("enter user address");
		String address=sc.nextLine();
		 Customer c=new Customer(user,address);
		 c.setUser_name(user);
		 c.setUser_address(address);
		
		}
		System.out.println("enter no of accounts");
		int bank=sc.nextInt();
		sc.nextLine();
		Account_details[] aacnt=new Account_details[bank];
		for(int i =0;i<num;i++) {
		for(int i1=0;i1<bank;i1++) {
		System.out.println("enter account number of " +(i+1)+" customer's "+(i1+1)+" account");
		String account=sc.nextLine();
		System.out.println("account type");
		String type=sc.nextLine();
		System.out.println("enter IFSC code");
		String code=sc.nextLine();
		System.out.println("enter balance");
		int bal=sc.nextInt();
		sc.nextLine();
		Account_details aacnt1=new Account_details(account,type,code,bal);
		
		aacnt1.setAccount_no(account);
		aacnt1.setAccount_type(type);
		aacnt1.setBalance(bal);
		aacnt1.setIFSC_code(code);
		}
		}
		System.out.println("the choices are 1.add a new customer\n 2.view balance of entered bank account\n 3.view all the accounts of an entered user name\n 4.view bank accounts in sorted order");
		System.out.println("enter the key");
		int key=sc.nextInt();
		switch(key) {
		case 1:
			
			num=num+1;
			for(int l=0;l<num;l++) {
			System.out.println("new customer name");
			String user=Customer.getUser_name();
			break;
		}
		case 2:
			System.out.println("enter account no");
			String account=sc.nextLine();
			for(int i=0;i<aacnt.length;i++) {
				
			if(account.equals(Account_details.getAccount_no())) {
				System.out.println("the balance is");
				System.out.println(Account_details.getBalance());
			}
			}
			break;
		case 3:
			System.out.println("enter user name");
			String user=sc.nextLine();
			if(user.equals(Customer.getUser_name())) {
				System.out.println("all details are");
				System.out.println("address is "+Customer.getUser_address()+""+"accountnumber is"+Account_details.getAccount_no()+""+"accounttype is"+Account_details.getAccount_type()+""+"ifsc code is"+Account_details.getIFSC_code()+""+"bank balance is"+Account_details.getBalance());
			}
			break;
		case 4:
			System.out.println("accounts in sorted order on balance");
			sorting(cust,aacnt);
	}

}

	private static void sorting(Customer[] cust, Account_details[] aacnt) {
		for(int i = 0;i<aacnt.length-1;i++) {
			for(int j=1;j<aacnt.length-i-1;i++) {
				if(aacnt[i].getBalance()<aacnt[j].getBalance()) {
					
				}
			}
		}
		
	}
}
