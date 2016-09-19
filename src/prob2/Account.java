package prob2;

public class Account {

	private String accountNo;
	private int balance;
	private int save;
	private int deposit;

	public Account(int save,int deposit){
		this.balance= save- deposit ;
	}
	public Account(String account){
		this.accountNo=account;
		System.out.println(account +"계좌가 개설되었습니다.");
	
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getSave() {
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}


	public void save(int i) {
		System.out.println(accountNo + "계좌에"  + save + "만원이 입금되었습니다.");
	}
	public void deposit(int i) {
		System.out.println(accountNo + "계좌에서"  + deposit + "만원이 인출되었습니다.");
	}

}
