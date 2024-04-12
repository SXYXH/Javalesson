package main.java.game;

import java.util.Scanner;

public class GameController{
	Scanner sc = new Scanner(System.in);
	QuizList quizlist = new QuizList();
	
	public void game() {
		boolean start = true;
		while(start) {
			System.out.println("메뉴선택");
			System.out.println("1. 게임시작    2.종료");
			if(sc.nextInt() == 1) {
				System.out.println("게임을 시작합니다");
				quizlist.Quiz1();
				quizlist.Quiz2();
				quizlist.Quiz3();
			}else if (sc.nextInt() == 2){
				System.out.println("게임을 종료합니다");
				start = false;
			}
		}
	}
}
