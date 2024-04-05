package main.java.absrt;

public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone(String owner) {
		// Phone 생성자 호출
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색");;
	}
}
