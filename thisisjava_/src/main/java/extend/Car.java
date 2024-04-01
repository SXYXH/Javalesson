package main.java.extend;

public class Car {
	//Tire클래스의 이름은 tire
	public Tire tire;
	
	// 메소드 선언
	//run() 메소드를 호출하면 Tire 클래스의 roll()메소드를 호출하게 된다
	public void run() {
		tire.roll();
	}
}