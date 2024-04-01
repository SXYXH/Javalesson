package main.java.variable;

import java.util.Scanner;

public class VariableEdu {
	
	public static void boolenSample1() {
		boolean Type = true;
		
		if (Type == true) {
			Type = false;
		}
		System.out.println(Type);
	}
	
	public static void boolenSample2() {
		boolean Type = false;
		System.out.println(Type);
	}
	
	//문자형 샘플 메서드
	public static void charSample1() {
		char intputData = 'A';
		System.out.println(intputData);
	}
	
	public static void charSample2() {
		char intputData = 65;
		System.out.println(intputData);
	}
	
	//문자형 샘플 메서드
	public static void charSample3() {
		char intputData = 0x0041;
		char intputData2 = 0x52;
		char intputData3 = 0x25;
		char intputData4 = 0x26;
		System.out.println(intputData);
		System.out.println(intputData2);
		System.out.println(intputData3);
		System.out.println(intputData4);
	}
	
	
	public static void StringSample2() {
		String inputData = "홍길동\n프로그래머\n나는\"자바\"를 배웁니다.\n번호\t 이름\t직업\n나는\n자바를\n배웁니다.";
		System.out.println(inputData);
	}
	
	public static void StringSample3() {
		String inputData = "---------\n| \"   \"\t|\n| 0   0\t|\n|   ^\t|\n|  \\_/\t|\n|\t|\n---------";
		System.out.println(inputData);
	}
	public static void StringSample3j() {
		String inputData = "반갑습니다.\n\n이\t건 탭입니다.\n피카츄가 말했다 \"피카피카.\"\n지우는 속으로 생각했다. \'피카츄..\'\n\\역슬래쉬 두 번은 한 번 출력\n두 개를 출력하려면\\\\ 이렇게";
		System.out.println(inputData);
	}
	
	public static void StringSample2j() {
		String inputData = "이스케이프 문자 소개\n\n\\n: 저는 \"줄 바꿈(Enter)\"을 나타내는 이스케이프 문자입니다.\n\\t: 저는 \"탭(tab)\"을\t나타내는 이스케이프 문자입니다.\n\\\" : 저는 쌍따옴표(\"\")를\t 출력하는 이스케이프 문자입니다.\n\\' : 저는 쌍따옴표(\'\')를\t 출력하는 이스케이프 문자입니다.\n\\\\: 저는 역슬래시 \"\\\"를\t출력하는 이스케이프 문자입니다.\n\\r: 저는 \"캐리지 리턴\"을\t나타내는 이스케이프 문자입니다.";
		System.out.println(inputData);
	}
	
	public static void StringSample6j() {
		String inputData = "|\\_/|\n|q p|  /}\n( 0 )\"\"\"\\\n|\"^\"`   |\n||_/=\\__|";
		System.out.println(inputData);
	}
	public static void StringSample5j() {
		String inputData = "\\    /\\\n )  ( *)\n(   / )\n \\(__)|";
		System.out.println(inputData);
	}
	
	public static void StringSample1j() {
		String inputData = "이번 프로젝트의 경로는 \nD: \\ksmartJava\\workspace\n위 경로\b\b\b\b\b\b입니다\n\"주의\"\t부탁드립니다.\n파일명은 \'카멜케이스\'로 부탁드립니다. ";
		System.out.println(inputData);
	}
	
	//숫자형 샘플 메서드
	public static void numSample1() {
		byte num1 = 127;
		short num2 = 30000;
		char num3 = 65;
		int num4 = 24142122;
		long num5 = 512521242;
		System.out.println("byte : " + num1);
		System.out.println("short : " + num2);
		System.out.println("char : " + num3);
		System.out.println("int : " + num4);
		System.out.println("long : " + num5);
	}
	
	public static void numSample2() {
		float num1 = 1.00004f;
		double num2 = 1.00004;
	
		System.out.println("byte : " + num1);
		System.out.println("short : " + num2);
	}
	
	public static void castingSample1() {
		byte num1 = 0;
		int num2;
		
		//자동타입변환
		num2 = num1;
		System.out.println(num2);
		
		//강제타입변환
		num1 = (byte) num2;
		System.out.println(num1);
	}
	
	//문자열 타입변환 샘플 메서드
	public static void castingSample2() {
		String  inputData = "1000";
		System.out.println(inputData);
		int num1 = Integer.parseInt(inputData);
		System.out.println(num1);
	}
	
	public static void scannerSample1() {
		Scanner scanner = new Scanner(System.in);
		String  inputData = scanner.next();
		System.out.println(inputData);
		if(inputData.equals("A")) {
			System.out.println("이학생은 A 등급 입니다.");
		}	else if(inputData.equals("B")) {
			System.out.println("이학생은 B 등급 입니다.");
		} else {
			System.out.println("이학생은 C 등급 입니다.");
		}
		scanner.close();
	}
	
	public static void scannerTest() {
		
		Scanner test = new Scanner(System.in);
		String inputData = test.next();
		String inputData2 = test.next();
		String inputData3 = test.nextLine();
		
		System.out.println(inputData);
		System.out.println(inputData2);
		System.out.println(inputData3);
		
		test.close();
	}
	
	public static void scanner2() {
		Scanner scan= new Scanner(System.in);
		String input = scan.next();
		String input2 = scan.next();
		
		System.out.println(input);
		System.out.println(input2);
		
		scan.close();
	}
	
	public static void plusTest() {
		int x = 100;
		int y = x--;
		System.out.println(x + y);
	}
	
	public static void shiftTest() {
		int i = 64;
		int l = 2;
		System.out.println(i>>l);
	}
	public static void compareTest() {
		int i = 64;
		int l = 2;
		
		boolean abc = (i ==l);
		System.out.println("abc : " + abc);
	}
}
