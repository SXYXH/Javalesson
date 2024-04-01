package study;
import java.util.Scanner;

public class exex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.증속 | 2.감속 ㅣ 3.중지");
			System.out.println("---------------------");
			
			String speedStr = sc.nextLine();
			
			if(speedStr.equals("1")) {
				int plSpeed = sc.nextInt();
				System.out.println("얼마나 증속 시킬까요?");
				System.out.println("현재 속도는 = "+ (speed += plSpeed));
			}else if(speedStr.equals("2")) {
				System.out.println("얼마나 감속 시킬까요?");
				int miSpeed = sc.nextInt();
				System.out.println("현재 속도는 = "+ (speed -= miSpeed));
			}else if(speedStr.equals("3")) {
				// while 문 종료
				run = false;	
			}
		}
		System.out.println("정지합니다");
	}
}