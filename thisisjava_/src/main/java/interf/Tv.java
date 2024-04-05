package main.java.interf;

public class Tv implements Remote1,Remote2,Search{
	@Override
	public void turnOn() {
		System.out.println("티비 켜기");
	}
	@Override
	public void turnOff() {
		System.out.println("티비 끄기");
	}
	@Override
	public void SearchUrl(String url) {
		System.out.println(url + "을 검색합니다");
	};
}
