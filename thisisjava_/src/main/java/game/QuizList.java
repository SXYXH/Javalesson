package main.java.game;

import java.util.Scanner;


public class QuizList {
	Scanner sc = new Scanner(System.in);
	int score = 0;
	int hintCount = 0;
	boolean start = true;
	public void Quiz1() {
		while(start) {
			System.out.println("첫번째 문제 : ㅅㅈㅎㅈ");
			System.out.println("정답을 입력해주세요 : ");
			if(sc.next().equals("소주한잔")) {
				System.out.println("정답!");
				score += 10;
				hintCount = 0;
				System.out.println(score);
				break;
			}else {
				if(hintCount == 0) {
					System.out.println("첫번째 힌트 : 거기 잘지내니");
					hintCount++;
				}else if (hintCount == 1) {
					System.out.println("두번째 힌트 : 여보세요 나야 ");
					hintCount++;
				}else if (hintCount == 2){ 
					System.out.println("세번째 힌트 : 임창정");
					hintCount++;
				}else {
					System.out.println("실패");					
					hintCount = 0;
					return;
				}
			}
		}	
	}
	
	public void Quiz2() {
		while(start) {
			System.out.println("두번째 문제 : ㄹㅌㅇ");
			System.out.println("정답을 입력해주세요 : ");
			if(sc.next().equals("런투유")) {
				System.out.println("정답!");
				score += 10;
				hintCount = 0;
				break;
			}else {
				if(hintCount == 0) {
					System.out.println("첫번째 힌트 : 외로울땐 나를 불러");
					hintCount++;
				}else if (hintCount == 1) {
					System.out.println("두번째 힌트 : BOUNCE with me BOUNCE with me ");
					hintCount++;
				}else if (hintCount == 2){ 
					System.out.println("세번째 힌트 : DJ DOC");
					hintCount++;
				}else {
					System.out.println("실패");					
					hintCount = 0;
					return;
				}
			}
		}	
	}
	
	public int Quiz3() {
		while(start) {
			System.out.println("세번째 문제 : ㅊㄴㅊㄹㄴㅇㄱㄱㄱㄷ");
			System.out.println("정답을 입력해주세요 : ");
			if(sc.next().equals("첫눈처럼너에게가겠다")) {
				System.out.println("정답!");
				score += 10;
				hintCount = 0;
				break;
			}else {
				if(hintCount == 0) {
					System.out.println("첫번째 힌트 : 햇살처럼 니가 내렸다.");
					hintCount++;
				}else if (hintCount == 1) {
					System.out.println("두번째 힌트 : 잊지 않겠다 너를 지켜보고 설레고");
					hintCount++;
				}else if (hintCount == 2){ 
					System.out.println("세번째 힌트 : 에일리");
					hintCount++;
				}else {
					System.out.println("실패");					
					hintCount = 0;
					break;
				}
			}
		}	
		System.out.println("최종 점수 : " + score);
		return score;
	}
	
	
}

