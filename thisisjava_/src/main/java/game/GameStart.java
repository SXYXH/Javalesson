package main.java.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameStart{
	Scanner sc = new Scanner(System.in);
	public void start() {
		List<String> list = new ArrayList<>();
		System.out.print("이름을 입력해주세요 : ");
		list.add(sc.next());
		System.out.println(list.get(0));
		
		GameController gamecontroller = new GameController();
		gamecontroller.game();
		
		QuizList quizlist = new QuizList();
		list.add(Integer.toString(quizlist.score));
				
	}
	
}
