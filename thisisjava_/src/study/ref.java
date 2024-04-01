package study;

import java.io.StreamCorruptedException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.BiConsumer;

import study.*;
public class ref {
	
	public void kkk(){
	int[] arr1;
	int[] arr2;
	int[] arr3;
	
	arr1 = new int[] {1,2,3};
	arr2 = new int[] {1,2,3};
	arr3 = arr2;
	
	System.out.println(arr1 == arr2);
	System.out.println(arr3 == arr2);
	}

	
	public void garbage() {
		String hobby = "여행"; 
		String hobby1 = hobby;		// 아랫줄에서 hobby를 쓰레기 객체로 만들었지만 그전에 hobby1이 이미 참조했으므로
		hobby = null;
		System.out.println(hobby);	// null 출력
		System.out.print(hobby1);	// 여행	출력
	
		
		
	}
	
	public void equal1() {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if(str1 == str2) {
			System.out.println("str1 , str2는 참조가 같다");
		}else {
			System.out.println("str1 , str2는 참조가 다르다");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 , str2는 문자열이 같다");
		}
		String str3 = new String ("홍길동");
		String str4 = new String ("홍길동");
		
		if(str3 == str4) {
			System.out.println("str3 , str4는 참조가 같다");
		}else {
			System.out.println("str3 , str4는 참조가 다르다");
		}
		if(str3.equals(str4)) {
			System.out.println("str3 , str4는 문자열이 같다");
		}
	}
	
	public void charAt1() {
		String id = "9506241230123";
		char s =id.charAt(6);
		if(s == '1' || s == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	public void refer6() {
		// 문자 추출
		System.out.println("=============특정위치 문자 추출=============");
		String name = "안녕하세요";
		System.out.println(name.charAt(0)); // charAt(원하는곳 숫자)   ,  여기부터 n번째 출력
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		System.out.println("=============특정위치 문자 추출=============\n");
		
		System.out.println("=============문자열 길이=============");
		System.out.println(name.length());
		System.out.println("=============문자열 길이=============\n");
		
		
		System.out.println("=============문자열 대체=============");
		System.out.println(name.replace("안녕하세","하이")); //replace( 버릴거 , 추가할거)
		System.out.println("=============문자열 대체=============\n");
		
		System.out.println("=============문자열 잘라내기=============");
		System.out.println(name.substring(2));		// (안녕)하세요
		System.out.println(name.substring(2,4));	// (안녕)하세(요)   , replace (입력받은 수까지 삭제, 입력받은 수부터 삭제)
		System.out.println("=============문자열 잘라내기=============\n");
		
		System.out.println("=============문자열 찾기=============");
		System.out.println(name.indexOf("안녕")); // 일치하는 문자가 있으면 0
		System.out.println(name.indexOf("하이")); // 일치하는 문자가 없으면 -1
		System.out.println("=============문자열 찾기=============\n");
		
		System.out.println("=============특정 문자를 기준으로 문자열 잘라내기=============");
		String[] reArr = name.split("하"); // split() 메소드 사용하여 문자열을 잘라낼시 데이터는 배열타입으로 변환
		System.out.println(reArr[0]);
		System.out.println(reArr[1]);
		System.out.println(reArr.length);
		System.out.println("=============특정 문자를 기준으로 문자열 잘라내기=============");
	}
	public void length1() {
		String id = "9506241230123";
		int length = id.length();
		if(length == 13) {
			System.out.println("주민번호 자릿수 일치");
		}else {
			System.out.println("주민번호 자릿수 불일치");
		}
	}
	
	public void array1() {
		int[] score = new int[] {80, 90, 100};
		int sum = 0;
		int avg = 0;
		
		for(int i=0;i<score.length;i++) {
			sum +=score[i];
			avg = sum / score.length;
			System.out.println("score[" + i + "] :" + score[i]);
		}
		
		System.out.println("총합" + sum);
		System.out.println("평균" + avg);
	}
	
	public void array2() {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
        System.out.println(Arrays.toString(arr));
	}
	
	public void multiarray1() {
		int[][] mathScore = new int[2][3];
		mathScore[0][0] = 80;
		mathScore[0][1] = 83;
		mathScore[0][2] = 85;
		mathScore[1][0] = 86;
		mathScore[1][1] = 90;
		mathScore[1][2] = 92;
	
		int mathSum = 0;
		int mathAvg = 0;
		int totalStd = 0;
		for(int i=0;i<mathScore.length;i++) {
			for(int j=0;j<mathScore[i].length;j++) {
				System.out.println(mathScore[i][j] + " ");
				totalStd++;
				mathSum += mathScore[i][j];
				
				mathAvg = mathSum / totalStd; 
				
			}
		}
		System.out.println("수학 총점  : " + mathSum);
		System.out.println("수학 평균 : " + mathAvg);
		
	}
	
	/* 오류 코드 배열의 null
	 * public void refer3() { int[] intArray = null; intArray[0] = 10; }
	 */
	
	public void refer4() {
		int[] intArray = null;
		//1번째 방법  : 배열에 저장되는 데이터가 없을시
		intArray = new int[5]; // new연산자로 새로운 객체 생성 길이는 5
		//3개값을 넣어주고 2자리는 남는다
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		
		//2번째 방법 : 배열에 저장되는 데이터가 있을시
		intArray = new int[]  {10,20,30}; // new연산자로 새로운 객체 생성 길이는 값을 3개넣어주면서 3으로 지정했다
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
	}
	public void refer5() {
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2); // true  : 동일 문자열 리터럴은 같은 주소를 갖는다
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4); // false : new 연산자로 생성한 객체는 다른 주소를 갖는다
		System.out.println(name3.equals(name4)); // true : 문자열의 값을 비교하기 때문에 
		}
	
	//정규 표현식
	public void example1() {
		String i = "문자!@$^^#$%!@열에 특수!@#%$%문자포함000aaa";
		System.out.println(i);
		String resultString = i.replaceAll("[^0-9가-힣]","");
		System.out.println(resultString);
	}
	
	public void ex2() {
		String[][] arr = new String[2][2];
		arr[0][0] = "1번째 배열 1번째 데이터";
		arr[0][1] = "1번째 배열 2번째 데이터";
		arr[1][0] = "2번째 배열 1번째 데이터";
		arr[1][1] = "2번째 배열 2번째 데이터\n";
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		String[][] arr1 = {
				{"1번째 배열 1번째 데이터","1번째 배열 2번째 데이터"},
				{"2번째 배열 1번째 데이터","2번째 배열 2번째 데이터"}
				};
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
	}
	
	public void arrcopy() {
		String[] oldArr = new String[2];
		oldArr[0] = "old1";
		oldArr[1] = "old2";
		
		String[] newArr = new String[5];
		System.arraycopy(oldArr, 0, newArr, 0, 2);
		
		newArr[2] = "new3";
		newArr[3] = "new4";
		newArr[4] = "new5";
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
		System.out.println(newArr[2]);
		System.out.println(newArr[3]);
		System.out.println(newArr[4]);
		
		
		int[] oldIntArr = {1,2};
		int[] newIntArr = new int[5];
		for(int i=0;i<oldIntArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i=0;i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
	public void refer7() {
		String arr[] = {"데이터1","데이터2","데이터3","데이터4","데이터5"};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(String getArr : arr) {
			System.out.println(getArr);
		}
	}
	
	public void refer8() {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;		
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("놀자");
		}
	}
	
	public void num6() {
		int[][] arr = {
				{90,90},
				{90,90,90},
				{90,90,90,90,90}
		};
		System.out.println(arr.length);
		System.out.println(arr[2].length);
	}
	
	public void num7test() {
		int[] arr = {1,5,3,8,2};
		int max = 0;	
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
			if(arr[i] < arr[j]) {
				max = arr[j];
				}
			}	
		}	
		System.out.println("최대값 : " + max);	
		System.out.println("==================");	
	}
	
	public void num7() {
		int[] arr = {1,5,3,8,2};
		//맥스 변수에 최초 비교할값을 일단 넣어둔다
		int max = arr[0];	
		//배열 전체를 for문으로 훑는다
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) { 	// 맥스는 배열의 0번째를 가리키고있다 (첫번째 비교)
				max = arr[i];	// 만약 for문에서 훑은 배열의 값이 더크다면 맥스의 값을 교체해주고 다시 for문으로 ㄱㄱ
			}
		}
		System.out.println("최대값 : " + max);	// 출력
	}
	
	public void num8() {
		// 총합을 담을 변수 sum , total은 총 몇명인지 담을변수 , 평균은 둘을 나눠 double형으로 출력하면된다
		int sum = 0;
		int total = 0;
		
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		//2차원 배열이니까 다중for문으로 훑기
		for(int i=0;i<arr.length;i++) {// arr의 길이만큼 3줄의미
			for(int j=0;j<arr[i].length;j++) { // arr[i]의 길이만큼 첫줄부터, 2개,3개,5개 각각의 개수만큼 조회하게된다
				sum += arr[i][j];  // sum에 각각 조회한 값들을 계속 더해준다
				total++; // total은 각 점수를 조회할때 한번씩만 더해주면된다 (평균을 구하기 위한 인원체크)
			}
		}
		
		
		// 출력
		System.out.println("전체합 : " + sum); 
		System.out.println ("평균1 : " + (double)sum/total);// 출력하는곳에서 연산해서 평균내기
		
		double avg = (double)sum/total; // 평균을 구하는 변수 구해서 평균내기
		System.out.println("평균2 : " + avg);
	}
	
	
}