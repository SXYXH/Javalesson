package main.java;

import main.java.interf.Audio;
import main.java.interf.Remote1;
import main.java.interf.Search;
import main.java.interf.Tv;

//import main.java.car.Car;
//import main.java.car.CarDTO;
//import main.java.cs.Control;
//import main.java.cs.Sample2;
//import study.Bank;
//import study.ref;
//import main.java.rest.RestFullApi;
//import study.Escape;
//import main.java.extend.*;

public class Main {
	
	public static void main(String[] args) {
		/*System.out.println("Hello world");
		VariableEdu.boolenSample1();
		VariableEdu.boolenSample2();
		VariableEdu.charSample1();
		VariableEdu.charSample2();
		VariableEdu.charSample3();
		VariableEdu.StringSample2();
		VariableEdu.StringSample3();
		VariableEdu.StringSample3j();
		VariableEdu.StringSample2j();
		VariableEdu.StringSample6j();
		VariableEdu.StringSample5j();
		VariableEdu.StringSample1j();
		VariableEdu.numSample1();
		VariableEdu.numSample2();
		VariableEdu.castingSample1();
		VariableEdu.castingSample2();
		VariableEdu.scannerSample1();
		VariableEdu.scanner2();
		VariableEdu.scannerTest();
		VariableEdu.plusTest();
		VariableEdu.shiftTest();
		VariableEdu.compareTest();
		OperatorEdu.operSample1();
		OperatorEdu.operSample2();
		OperatorEdu.operSample3();
		OperatorEdu.operSample4();
		OperatorEdu.operSample5();
		OperatorEdu.operSample6();
		OperatorEdu.operSample7();
		OperatorEdu.operSample8();
		OperatorEdu.operSample9();
		OperatorEdu.operSample10();
		OperatorEdu.operSample11();
		OperatorEdu.operSample12();
		OperatorEdu.operSample13();
		OperatorEdu.operSample14();
		OperatorEdu.operSample15();
		OperatorEdu.operSample16();
		OperatorEdu.operSample17();
		OperatorEdu.operSample18();
		OperatorEdu.signOperatorSample();
		OperatorEdu.abc();
		Control.Ctrl();
		Control.random();
		Control.controlSample3();
		Control.controlSample4();
		Control.controlSample5();*/
		//Control.controlSample6();
		//Control.controlSample7();
		//Control.controlSample7();
		//Control.item();
		//Control.game();
		
		 // Car.model= "소나타"; 
		 // Car.customModel = "최고";
		 // Car.speed= 500;
		 // Car.car();
		 
		  
			/*
			 * Car car = new Car();
			 * 
			 * 
			 * car.model2 ="그랜져"; car.speed2 = 800; car.car2(); CarDTO carDTO = new
			 * CarDTO();
			 * 
			 * carDTO.setHandle("123"); System.out.println(carDTO.getHandle());
			 * 
			 * carDTO.setHandle4(33); System.out.print(carDTO.getHandle4());
			 */
		
		//Bank bk = new Bank();
		//bk.selectMenu();
//		Sample2 sm = new Sample2();
//		sm.selectType();
		//ref re = new ref();
		//re.kkk();
		//re.garbage();
		//re.equal1();
		//re.charAt1();
		//re.length1();
		//re.array1();
		//re.array2();
		//re.multiarray1();
		//re.refer4();
		//re.refer5();
		
		//문자 추출 , 문자열 길이, 문자열 대체
		//re.refer6();
		
		//re.example1();
		//re.ex2();
		//re.arrcopy();
		//re.refer7();
		//re.refer8();
		//re.num6();
		//re.num7test();
		//re.num7();
		//re.num8();
		//RestFullApi rest = new RestFullApi();
		//rest.getRestData();
		
		//Escape escape = new Escape();
		// 4자리 비번 방탈출 
		//escape.escapeRoom();
		//escape.runMachine();
		//ComputerExample cmE = new ComputerExample();
		//cmE.comE();
		
		//Animal Ani = new Animal();
		//Ani.animalSound();
		//AnimalTest AniT = new AnimalTest();
		//AniT.myAniamlTest();
		
		
		//Child ch = new Child();
		//ch.mathod1();
		//ch.mathod2();
		
		//강제 타입변환
		//Parent par = new Child();
		
		
		//Parent parent = new Parent();
		//Child ch1 = (Child)par;
		//ch1.fleld1 = "data2";
		//ch1.method3();
		
		//parent.mathod1();
		//parent.mathod2();
		
		
		//Coffee co = new Coffee();
		//co.cof();
		
		//CoffeeTest coT = new CoffeeTest();
		//coT.CofTest();
	
		//클래스는 객체를 만들기 위한 틀
		//Car 클래스를 car객체로 만든다.
		//Car car = new Car();
		//car.tire = new Tire();
		//car.run();
		// car객체의 속성인 tire를 Tire클래스의 객체로 만든다.
		//Tire tire = new Tire();
		//tire.roll();
		
		//car객체의 속성인 tire를 HankookTire클래스의 객체로 만든다.
		//car.tire = new HankookTire();
		//car.run();

		//car.tire = new KumhoTire();
		//car.run();
		
		//Vehicle ve = new Vehicle();
		//ve.run();
		//드라이버 클래스 객체 생성 
		//Driver dir = new Driver();
		// 드라이버 클래스 객체의 드라이버 메소드를 실행할때 Bus 클래스의 객체를 매개 변수로 삼는다.  
		//dir.driver(new Bus());// 드라이버클래스 객체에 드라이브 메소드를 실행하는데 매개변수는 Bus 클래스의 객체이다.
		//dir.driver(new Vehicle());
		
		//SmartPhone sp = new SmartPhone("123");
		//sp.turnOn();
		//sp.turnOff();
		//sp.internetSearch();
		//Tv t= new Tv();
		//t.turnOn();
		
		Remote1 r1;
		r1 = new Tv();
		r1.turnOn();
		
		r1= new Audio();
		r1.turnOn();
		
		Search s;
		s = new Tv();
		s.SearchUrl("youtube");
	}
}

