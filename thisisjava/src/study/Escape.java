package study;

import java.util.Scanner;

public class Escape {
	//네자리 숫자 방탈출 게임
	public void escapeRoom(){
	// 스캐너, 방의 비밀번호 4자리를 받을 배열
	Scanner sc = new Scanner(System.in);
	int[] escapeNum = new int[4];
	
	// 매 게임마다 랜덤함수로 1~9까지숫자 4개를 받는다
	for(int i=0;i<escapeNum.length;i++) {
		escapeNum[i] = (int)(Math.random()*9)+1;
		}
	// 배열의 길이(4)만큼 게임 반복
	for(int i=0;i<escapeNum.length;i++) {
		System.out.println("숫자를 입력해주세요");
		if(i <=escapeNum.length) { 					// 4번까지만 반복하기 위해 조건
			if(escapeNum[i] > sc.nextInt()) {		// 최초 힌트 : 입력받은 수보다 크거나 같으면 알려준다. 
				System.out.println("입력값보다 큽니다");
			}else if(escapeNum[i] < sc.nextInt()) {
				System.out.println("입력값보다 작습니다");
			}
			// 입력받은 수와 랜덤함수에서 받은 배열의 값비교해서 정답 오답 출력
			for(int j =0; j < 100;j++) {			 
				if(escapeNum[i] == sc.nextInt()) {
					System.out.println("정답");		
				break;
				} else {
					System.out.println("오답");
				}
			}
		}
	}
	// 배열의 길이(4)만큼 게임 반복후 종료
	System.out.print("탈출 성공");
	sc.close();
	}
	
	
	// 일정한 속도로 달리는 기계의 마라톤 기록
	// 1분에 100미터를 간다
	public void runMachine(){
		double cos = 42.195;
		double rSpeed = (0.1 *60);// 1시간에 얼마나 이동하냐
		double time = cos/rSpeed;
		double allTime = time *3600; 
		int hTime = (int)allTime /3600;
		int mTime = (int)(allTime %3600)/60;
		int sTime = (int)(allTime %60);
		System.out.println("마라톤 소요 시간 : "+hTime+"시간"+mTime+"분"+sTime+"초");
	}
	
}	
