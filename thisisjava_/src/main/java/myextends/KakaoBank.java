package main.java.myextends;
// 추상클래스 BasicBank를 상속받고 객체 만들기
public class KakaoBank extends BasicBank{// 영호
	//추상클래스의 생성자가 호출, 생성자의 메소드가 매개변수를 가지고 있기 때문에
	// super() 작성후 인자를넣어줘야함.
	public KakaoBank(String BankName,int balance,double ratio) {
		super(BankName,balance,ratio);
		
	}
}
