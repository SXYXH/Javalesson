package main.java.cs;

import java.util.Scanner;
import java.util.Arrays;

public class Control {
	public static void Ctrl(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		switch (num) {
			case 1:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 2:
				System.out.println("주사위 값은 : " + num + "입니다.");		
						break;
			case 3:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 4:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 5:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 6:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 7:
				System.out.println("주사위 값은 : " + num + "입니다.");
						break;
			case 8:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			case 9:
				System.out.println("주사위 값은 : " + num + "입니다.");
				break;
			default:
			}
	}
	
	
	//Math.random(); 메서드를 활용해 0.0 <= 1.0사이의 난수를 생성해 1~6까지 정수값이 나오도록 산술연산자를 활용해 스위치문을 이용해 값을 비교해 출력하는 코드 작성
	public static void random() {
		//Math.random();으로 랜덤 난수 생성
		double rNum = Math.random();
		//스위치문 사용을 위해 정수형으로 변환 		*6은 최대값,	+1은 최솟값 
		int num = (int)(rNum*6)+1;
		
		//랜덤으로 숫자를 받아 맞는 케이스에서 출력함
		switch (num) {
		case 1:
			System.out.println("주사위 값은 : " + num + "입니다.");
			break;
		case 2:
			System.out.println("주사위 값은 : " + num + "입니다.");		
					break;
		case 3:
			System.out.println("주사위 값은 : " + num + "입니다.");
			break;
		case 4:
			System.out.println("주사위 값은 : " + num + "입니다.");
			break;
		case 5:
			System.out.println("주사위 값은 : " + num + "입니다.");
			break;
		case 6:
			System.out.println("주사위 값은 : " + num + "입니다.");
			break;
		default:
		}
		
	}
	
	
	public static void controlSample3() {
		for(int num = 0; num <10;num++) {
			System.out.println(num + 1);
		}
	}
	
	public static void controlSample4() {
		for(int i = 2; i < 10; i+=2) {
			System.out.print("\n");
			for(int j =1; j <10;j++) {
				
				System.out.printf("%3d", i  *j  );
				
			}
		}
	}
	
	public static void controlSample5() {
		for(int i = 0 ; i < 2; i+=2)
			System.out.print("*");
			System.out.print("\n");
				for(int k = 1; k < 7; k +=2)
				System.out.print("*");
				System.out.print("\n");
					for (int j = 0; j <5; j++){
						System.out.print("*");
			}
				
		}
	public static void controlSample6() {
		int i = 0;
		while (i <=10 ) {
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void controlSample7() {
		//반복문 상태값 초기설정
		boolean chkData = true;
		Scanner sc = new Scanner(System.in);
		//확률값 초기설정
		int num = 0;
		while (chkData ) {
			//확률변수에 키보드로부터 입력받은 데이터 할당 및 더하기
			num += sc.nextInt();
			System.out.print("현재확률 :  "+num+"%");
			if(num > 50) {
				chkData = false;
				System.out.print("뽑기 아이템의 확률이 "+num+"%이상입니다");
			}else {
				System.out.print("뽑기 아이템의 확률이 50%이하입니다");
			}
		}
	}
	
	/*
	 * 여기부터는 강의 x 제가 만든 코드
	 * 
	 * 
	 * */
	
	//가위바위보 게임
		public static void game() {
			System.out.println("<가위,바위,보>하나를입력해주세요");
			
			//스캐너로 유저 숫자(1,2,3 받기)
			Scanner sc = new Scanner(System.in);
			String user = sc.next();
			
			//Math.random();으로 랜덤 난수 생성 *3은 최대값,	+1은 최솟값 
			double dNum = Math.random();
			int num = (int)(dNum*3)+1;
				
			//랜덤숫자를 받아와 가위바위보를 한다.
			if(user.equals("가위") ) {
				switch (num) {
				case 1:
					System.out.println("User : 가위 \nCom : 가위 \n비겼습니다");
					break;
				case 2:
					System.out.println("User : 가위 \nCom : 바위 \n졌습니다");		
							break;
				case 3:
					System.out.println("User : 가위 \nCom : 보 \n이겼습니다");
					break;
				}
			} else if (user.equals("바위")){
				switch (num) {
				case 1:
					System.out.println("User : 바위 \nCom : 가위 \n이겼습니다");
					break;
				case 2:
					System.out.println("User : 바위 \nCom : 바위 \n비겼습니다");		
							break;
				case 3:
					System.out.println("User : 바위 \nCom : 보 \n졌습니다");
					break;
				}
			} else if (user.equals("보")) {
				switch (num) {
				case 1:
					System.out.println("User : 보 \nCom : 가위 \n졌습니다");
					break;
				case 2:
					System.out.println("User : 보 \nCom : 바위 \n이겼습니다");		
							break;
				case 3:
					System.out.println("User : 보 \nCom : 보 \n졌습니다");
					break;
				}
			} else {
				System.out.println("가위, 바위, 보 중 하나를 입력해주세요");
			} 
			sc.close();
		}
		
		//아이템 뽑기
		public static void item() {
			//스캐너로 buyItem에 아이템을 뽑을 횟수를 받는다
			Scanner sc = new Scanner(System.in);
			int buyItem = sc.nextInt();

			// 각 등급별 아이템 뽑은 횟수를 담을 num1,2,3 생성
			int[] num = new int[3];
		
			//buyItem 횟수만큼 for 문을 돌려 아이템을 뽑는다
			for(int i = 0; i < buyItem ; i++) {
				// Math.random으로 랜덤 숫자 생성	*50 (최대 50까지) +1 (최소 1부터)
				double itemP = (int)(Math.random()*50)+1;
				//1이 나올시에 "전설" 출력하고 num1,2,3 에 1을 더해준다( 각아이템 뽑은 횟수를 구하기위해서 if 문을 거쳐갈때마다 1씩 더해준다) 전설,영웅,일반 동일
				if(itemP == 1) {
					num[0] += 1;
				}else if (itemP == 2 ||itemP == 3){;
					num[1] += 1;
				}else {
					num[2] += 1;
				}
			} 
			//num[각배열 숫자]로 몇뽑힌횟수를 표시하고 각 아이템이 뽑힌횟수 나누기 buyItem의 횟수를 float 형으로 소수점자리까지 확률을 표시한다
			System.out.println("전설아이템 갯수:"+num[0]+"개	 /	확률"+(((float)num[0]/(float)buyItem)*100)+"%");
			System.out.println("영웅아이템 갯수:"+num[1]+"개	 /	확률"+(((float)num[1]/(float)buyItem)*100)+"%");
			System.out.println("일반아이템 갯수:"+num[2]+"개	 /	확률"+(((float)num[2]/(float)buyItem)*100)+"%");
			
			sc.close();
		}	
}
