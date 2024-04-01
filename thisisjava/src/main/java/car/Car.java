package main.java.car;
 //모든 model,customModel null값이지만 car()의 model,customModel 값은 메인클래스에서 초기화 시켜줬기때문에 넣어준 값이 출력이 된다.
public class Car {
	//정적 필드
	public static int speed;
	public static String model;
	public static String customModel;
	public static String info;
	
	final static String part1 = "핸들";
	final static String part2 = "타이어";
	final static String part3 = "엔진";
	final static String part4 = "휠";
	final static String part5 = "헤드램프";
	final static String part6 = "백미러";
	
	
	static {
		int val1 = 1;
		int val2 = 2;
		System.out.print(val1);
		System.out.print(val2);
		
		}
	


	static {
		Car.model= "123";
		info = model + "-" + customModel;
		System.out.print(info + "\n");
	}
	
	
	//인스턴스 필드
	public int speed2;
	public String model2;
	
	public static void car() {
		System.out.print(speed + "\n");
		System.out.print(model + "\n");	
		System.out.print("정적메소드 호출" + "\n");
		
		// System.out.print(speed2 + "\n"); 오류
		// System.out.print(model2 + "\n"); 오류
	}
	
	public void car2() {
		System.out.print(speed2 + "\n");
		System.out.print(model2 + "\n");
		System.out.print("인스턴스 메서드 호출");
		
		System.out.print(speed + "\n");
		System.out.print(model + "\n");
	}
	
	public void car3() {
		String test = "ㅎㅇ";
		String test2 = "ㅎㅇ";
		test.equals(test2);
	}
}


