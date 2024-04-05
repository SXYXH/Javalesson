package main.java.myextends;

public class BankNRatioExample {
	public static void main(String[] args) {
		
		//Coustomer클래스의 참조변수 c에 new연산자로 만든 Coustomer객체의 주소값을 담는다
		Coustomer c = new Coustomer();
		
		//예를들어 int a; 는 int 형의 a라는 이름을 가진 변수
		
		//BasicBank 클래스의 kb 라는 참조변수,
		//new 연산자를 통해 만든 Kakaobank(매개변수1...3),
		
		//결론 : BasicBank 클래스의 kb 라는 참조변수에 new 연산자를 통해 만든 Kakaobank(매개변수1...3)의 주소값이 담긴다.
		// !주의 : kb라는 참조변수는 주소값만 '참조'하는 것이지 실질적 기능을 담고있지는 않다
		BasicBank kb = new KakaoBank("카카오", 10000 ,0.03);
		
		//참조변수 c (Coustomer클래스) . (도트연산자) setBankRatio()를 참조
		c.setBanknRatio(kb);
		// Coustomer.java의 yearAfter를 참조.
		c.yearAfter();
		
		
	}

}
