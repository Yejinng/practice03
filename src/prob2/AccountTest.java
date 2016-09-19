package prob2;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account( "078-3762-293" );	//1

		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getDeposit() + "만원입니다." );//2
		account.save( 100 );//3
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getDeposit() + "만원입니다." );//4
		account.deposit( 30 );//5
		System.out.println( account.getAccountNo() + "계좌의 잔고는 " + account.getDeposit() + "만원입니다." );
		
	}

}
