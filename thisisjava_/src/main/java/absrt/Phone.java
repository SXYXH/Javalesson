package main.java.absrt;

public abstract class Phone {
	//필드
	String owner;
	//생성자
	Phone(String owner){
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
