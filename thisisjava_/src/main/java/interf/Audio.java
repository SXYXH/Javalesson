package main.java.interf;

public class Audio implements Remote1 {
	@Override
	public void turnOn() {
		System.out.println("오디오 켜기");
	}
}
