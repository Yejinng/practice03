package prob3;

public class Prob3 {
	
	private static double rate;
	public static double toDollar(double won){
		return won / rate;
	}
	public static double toKRW(double dollar){
		return dollar * rate;	
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Prob3.rate = rate;
	}
	
	public static void main(String[] args) {
		Prob3.setRate( 1118.70 );//setRate이 클래스 메서드
		
		double dollar = Prob3.toDollar( 1000000 );
		System.out.println( "백만원은 " + dollar + "달러입니다." );
		
		double krw = Prob3.toKRW( 100 );
		System.out.println( "백달러는 " + krw + "원 입니다." );		
	}
	

}

