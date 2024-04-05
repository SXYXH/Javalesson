package main.java.myextends;

public class Coustomer {
	private BasicBank banknRatio;
	
	public Coustomer(BasicBank banknRatio) {
		this.banknRatio = banknRatio;
	}
	
	public Coustomer() {
		
	}
	
	
	//setBanknRatio는 매개변수값으로 BasicBank의 참조변수 banknRatio가 있다
	//banknRatio는 4번째 줄에 private로 선언되어있어 외부에서 접근하지 못하므로 외부에서 사용하고싶다면 getter,setter로 사용해야한다
	//setBanknRatio(setter)에서 this.banknRatio (4번째줄)에 BasicBank의 매개변수인 banknRatio에 BankNRatioExample.java의 kb참조변수 값을 넣어준다
	public void setBanknRatio(BasicBank banknRatio) {
		this.banknRatio = banknRatio;
			
	}
	// 접근하게 되면 BasicBank클래스의 참조변수banknRatio의 yearAfter 요게 실행된다.
	// 즉 BasicBank.java의 yearAfter()메소드가 실행된다
		public void yearAfter() {
			banknRatio.yearAfter();
		}
	
	
}
