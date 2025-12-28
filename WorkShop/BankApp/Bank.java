package BankApp;

public class Bank {

	private String bname,ifsc,branch;
	private Account[] accounts;
	public Bank(String bname, String ifsc, String branch, Account[] accounts) {
		
		this.bname = bname;
		this.ifsc = ifsc;
		this.branch = branch;
		this.accounts = accounts;
	}
	public String getBname() {
		return bname;
	}
	public String getIfsc() {
		return ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void detailsOfBank() {
		System.out.println("Bank Name:"+getBname());
		System.out.println("Bank IFSC :"+getIfsc());
		System.out.println("Bank Branch:"+getBranch());
		System.out.println("Bank Total Accounts:"+getAccounts().length);
	}
	public void displayVipAccount() {
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getBal()>50000)
				System.out.println("AccountName:"+accounts[i].getBal());
		}
	}
	
	
}
