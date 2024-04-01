package main.java.operator;

import java.util.Scanner;

/**
 * 
 */
public class OperatorEdu {
	public static void operSample1() {
		int num1 = 100;
		int num2, num3;
		
		//부호 연산자 -
		num2 = -num1;
		//부호 연산자 +
		num3 = +num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
	}
	
	public static void operSample2() {
		int num1 =5;
		System.out.println(num1);
		
		//후위 증감 연산자
		int num2 = num1++;
		//전위 증감 연산자
		int num3 = ++num1;
		
		System.out.println("후위증감 연산자 = " + num2);
		System.out.println("전위증감 연산자 = " + num3);
		
	}
	
	public static void operSample3() {
		int num1 =5;
		System.out.println(num1);
		
		//후위 증감 연산자
		int num2 = num1--;
		//전위 증감 연산자
		int num3 = --num1;
		
		System.out.println("후위증감 연산자 = " + num2);
		System.out.println("전위증감 연산자 = " + num3);
		
	}
	
	public static void operSample4() {
		
		System.out.println("========== 입력 시작 ==========");
		Scanner x = new Scanner(System.in);
		float num1 = x.nextFloat();
		float num2= x.nextFloat();
		System.out.println("========== 입력 종료 ==========");
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));	
		System.out.println("곱하기 : "+ (num1 * num2));
		System.out.println("나누기 : "+ (num1 / num2));
		System.out.println("나머지 : "+ (num1 % num2));
		x.close();
	}
	// 계산
	public static void operSample5() {
		
		System.out.println("========== 입력 시작 ==========");
		Scanner x = new Scanner(System.in);
		float num1 = x.nextFloat();
		String num = x.next();
		float num2= x.nextFloat();
		
		System.out.println("========== 입력 종료 ==========");
		if (num.equals("+")) {
			System.out.println(num1 + num  + num2  + " = " + (num1+num2));
		} else if(num.equals("-")) {
			System.out.println(num1 + num  + num2  + " = " + (num1-num2));
		} else if(num.equals("*")) {
			System.out.println(num1 + num  + num2  + " = " + (num1*num2));
		} else if(num.equals("/")) {
			System.out.println(num1 + num  + num2  + " = " + (num1/num2));
		} else if(num.equals("%")) {
			System.out.println(num1 + num  + num2  + " = " + (num1%num2));
		} else {
			System.out.println("올바른 연산자를 입력하세요");
		}
		x.close();
	}
	
	//오버 플로우  / 언더플로우 실습예제
	public static void operSample6() {
		byte num1 = 127;
		System.out.println(num1);
		byte result = ++num1;
		System.out.println(result);
		
		byte num2 = -128;
		System.out.println(num2);
		byte result2 = --num1;
		System.out.println(result2);
	}
	
	public static void operSample7() {
		Double x = 5.0;
		Double y = 0.0;
		Double z = x/y;
		Double w = x%y;
		
		System.out.println(z);
		System.out.println(x);
		
		boolean result = Double.isInfinite(z);
		System.out.println(result);
		boolean result2 = Double.isNaN(w);
		System.out.println(result2);
		
		if(result || result2) {
			System.out.println("산출불가");
		}else {
			System.out.println("z+2");
			System.out.println("w+2");
		}
		
	}
	//비교 연산자 테스트		// System.identityhashcode 주소찾기
	public static void operSample8() {
		
		String str1 = "테스트";
		String str2 = "테스트";
		boolean result1 = (str1 == str2);
		System.out.println(result1);
		
	
		String str3 = new String ("테스트");
		String str4 = new String ("테스트");
		boolean result2 = (str3 == str4);
		System.out.println(result2);
		
		boolean result3 = (str3.equals(str4));
		System.out.println(result3);
	}
	
	public static void operSample9() {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
	}
	
	//비교 연산자
	public static void operSample10() {
		
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		if(inputNum > 90) {
			System.out.println("이 학생은 A 등급");
		}else if (inputNum >80){
			System.out.println("이 학생은 b 등급");
		}else if (inputNum >70){
			System.out.println("이 학생은 c 등급");
		}else {
			System.out.println("이 학생은 f 등급");
		}
		sc.close();
	}
	// 캐스팅
	public static void operSample11() {
		char ch1 = 'A';
		char ch2 = 'B';
		boolean result = (ch1 < ch2);
		System.out.println(result);
		
		int num1 = ch1;
		int num2 = ch2;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	//논리 연산자
	public static void operSample12() {
		int sc = 88;
		if (95 <= sc && 100 >= sc) {
			System.out.println("A+");
		} else if (90 <= sc && 94 >= sc) {
			System.out.println("A");
		} else if (80 <= sc && 90 >= sc) {
			System.out.println("B");
		} else if (70 <= sc && 80 >= sc) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
	
	public static void operSample13() {
		boolean data1 = true;
		boolean data2 = false;
		
		if(data1 && data2) {
			System.out.println("데이터중 하나가 참");
		} else {
			System.out.println("데이터중 하나가 거짓");
		}
		
		if(data1 || data2) {
			System.out.println("데이터중 하나가 참");
		}
		
		//둘중한개는 일치 나머지는 일치하지 않을때
		if(data1 ^ data2) {
			System.out.println("데이터중 하나가 참");
		}
	}
	
	public static void operSample14() {
		int num = 6;
		boolean result = ((num %2 == 0));
		System.out.println(result);
		if(!result) {
			System.out.println("2의 배수가 아닙니다");			
		} else {
			System.out.println("2의 배수가 맞습니다");	
		}
	}
	
	//복합 대입 연산자
	public static void operSample15() {
		int sum = 55;
		
		for(int i = 0 ; i< 10 ; i++) {
			sum -= i +1;
			System.out.println(sum);
		}
	}
	
	public static void operSample16() {
		
		for(int a = 1; a<10; a++) {
			
		for(int b = 1; b <10 ; b++) {
			System.out.println(a*b);
			}
		}
	}
	
	public static void operSample17() {
		
		for(int a = 1; a <10 ; a++) {
			System.out.println(2 * a);
			}
		}
	
	
	public static void operSample18() {
		for(int a = 2; a < 10 ; a++) {
			
			for(int b = 1; b <10 ; b++) {
				int sum = a*b;
				if(b == 9) {
					System.out.println(sum);
				}else {
					System.out.print(sum + " ");
				}
			}
		}
	}
	
	/**
	 * 이 메서드는 삼항연산자 연습입니다
	 * @author 나
	 * 
	 * 
	 */
	public static void signOperatorSample() {
		String text = "참참참";
		String result = (text == "참참참") ? "데이터가 일치합니다." : "데이터가 일치하지 않습니다.";
		System.out.println("result");
	}

	public static void abc() {
		Scanner x = new Scanner(System.in);
		String Str1 = x.next();
		System.out.println("첫번째 데이터 : " + Str1);
		String Str2 = x.next();
		System.out.println("두번째 데이터 : " + Str2);
		
		int num1 = Integer.parseInt(Str1);
		int num2 = Integer.parseInt(Str2);
		String result = (num1 > num2) ? "1" : "0";
		System.out.println(result);
		
	}
}


