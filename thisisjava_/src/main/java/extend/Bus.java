package main.java.extend;
// Bus 클래스는 Vehicle 클래스를 상속받는다
public class Bus extends Vehicle{
	
	//오버라이딩 해서 상속받은 Vehicle 클래스의 run() 메소드를 변경
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
