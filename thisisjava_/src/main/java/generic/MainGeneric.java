package main.java.generic;

public class MainGeneric {
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		/*
		 * 		<T>	= 타입 파라미터
				<E>	= Element ex) List
				<K>	= Key ex) Class, Map<K, V>
				<V>	= Value ex) 리턴 값 또는 매핑된 값(Variable)
				<N>	= Number ex) 숫자
				<P> = 소비 타입 파라미터 ex) interface
				제네릭(Generic) = 결정되지않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
	
				주의 : 참조타입만 대입 가능, 기본타입인 int, double등은 대입되지 않는다. 
		 * */
		
		// --------------------Box 제네릭 --------------------------
		/*
		// <String>
		Box<String> box1 = new Box<>();
		box1.content = "제너릭 스트링";
		System.out.println(box1.content);
		String str = box1.content;
		System.out.println(str);
		
		// <Integer>
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		System.out.rprintln(box2.content);
		int a = box2.content;
		System.out.pintln(a);
		*/
		
		// --------------------Product 제네릭 타입--------------------------
		
		/*
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv);
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);
		*/
		
		// --------------------Rantable 제네릭 타입--------------------------
		/*
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.TurnOnLight();
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();
		*/
		
		// --------------------Box  제네릭 메소드--------------------------
		/*
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String StrValue = box2.get();
		System.out.println(StrValue);
		*/
		
		
		// --------------------확인문제 2번--------------------------
		System.out.println("--- 2번 ---");
		
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int a = container2.get();
		System.out.println(a);
		
		
		// --------------------확인문제 3번--------------------------
		System.out.println("--- 3번 ---");
		
		Container2<String, String> container3 = new Container2<String, String>();
		container3.set("홍길동","도적");
		String name1 = container3.getKey();
		String job = container3.getValue();
		System.out.println(name1);
		System.out.println(job);
		
		Container2<String,Integer> container4 = new Container2<String, Integer>();
		container4.set("홍길동",35);
		String name2 = container4.getKey();
		int b = container4.getValue();
		System.out.println(name2);
		System.out.println(b);
		
		// --------------------확인문제 4번--------------------------
		System.out.println("--- 4번 ---");
		
		// Pair<문자,숫자>객체 생성 매개값 홍길동,35  --> pair변수에 담김 
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		// 유틸클래스의 겟밸류 메소드에 매개값 pair, "홍길동" 가지고감 
		// 겟밸류 메소드 : 만약(if) pair 의 키값과 "홍길동"(string)의 값이 같다면 age에는 pair의 겟밸류 값이 담기고 아니면 null이 담김
		Integer age = Util.getValue(pair, "홍길동");
		// age 출력
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair, "홍삼원1");
		System.out.println(childAge);
		
		
		
		
		//-----------------------BoundedPmt 제한된 파라미터-------------------------------
		/*
		boolean result = BoundedPmt.compare(1, 2);
		System.out.println(result);
		*/
		
		
	}
}
