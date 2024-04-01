package study;

import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	// 계좌 생성시 이름, 계좌번호 , 입금할 금액 변수
	String name;
	String act;
	String money;
	
	// 예금 출금 원금을 담을 변수 
	int oMoney = 0;
	int plMoney = 0;
	int fMoney = 0;
	
	//while문으로 계속 실행 시키기위해 변수 선언
	boolean start = true;
	// 회원 정보를 담을 배열 선언
	String[][] Account = new String[10][10];
	
	public void selectMenu() {
	while(start) {
		//메인 메뉴
		System.out.println("--------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금  | 5. 종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택 > ");
		//메뉴 선택
		int select = sc.nextInt();
		// 계좌 생성
		if(select == 1) {
			System.out.println("-------");
			System.out.println("계좌 생성");
			System.out.println("-------");
			
			//각각의 세 값을 입력받기
			System.out.println("계좌 번호 :");				
			this.act = sc.next();
			System.out.println("계좌주 :");
			this.name = sc.next();
			System.out.println("초기입금액 :");
			this.money = sc.next();
			System.out.println("결과 : 계좌가 생성되었습니다.");
			
			//입력받은 값 빈배열에 넣기
			for(int i=0;i<Account.length; i++) {
				if(Account[i][0] == null) {
					Account[i][0] = this.act;
					Account[i][1] = this.name;
					Account[i][2] = this.money;
					
					break;
				}
			}
		}
		
		// 계좌 목록
		if( select == 2) {
			System.out.println("-------");
			System.out.println("계좌 목록");
			System.out.println("-------");
			
			for(int i=0;i<Account.length;i++) {	
				if(Account[0][0] == null){						// 아무것도 없다면
					System.out.println("등록된 계좌가 없습니다.");	// 출력
					break;
				}else if(Account[i][0] == null) {				// 모든계좌 조회 후 null값을 만나면
					System.out.println("전부 조회했습니다.");		// 출력
					break;
				}else if(Account[i] != null) {					// null값이 아닐시 조회해서 출력
					System.out.print("계좌 번호 :" + Account[i][0] + "이름 :" +Account[i][1] + "잔액 :" +Account[i][2] + "\n");
				}
			}
		}	
			
		if( select ==3 ) {
			System.out.println("-------");
			System.out.println("예금");
			System.out.println("-------");
			
			for(int i=0;i<Account.length;i++) { 
				if(Account[i][0] != null) { 	// 배열이 비어있지 않다면
					for(int j=0;j<1;j+=1) { 				
						System.out.print("계좌번호 입력 : ");			
						this.act = sc.next();		// 계좌 번호 입력받기
							if(Account[i][j].equals(this.act)) {	// 일치 해야만  입금가능
								System.out.print("입금하실 금액 : ");
								this.money = sc.next();				// 입금할 금액
								oMoney = Integer.parseInt(Account[i][2]);	//문자열 배열에서 정수형으로 전환해서 담기
								fMoney = oMoney +  Integer.parseInt(this.money);	//입력 받은 값도 정수형으로 전환해서 원금에 더해준다
								this.Account[i][2] = Integer.toString(fMoney);		//더해준값을 다시 문자열로 전환해서 배열에 담기
								System.out.println("현재 총금액은 " + fMoney + "입니다"); 
								break;
							} else if(!Account[i][j].equals(this.act)) {
								System.out.println("잘못된 계좌번호 입니다"); // 계좌번호 불일치시 
							}
						}
					}else if(Account[0][0] == null) {
						System.out.println("계좌를 먼저 등록해주세요");	//등록된 계좌가 하나도 없을시
						break;
					}
				}
			}
	
		// 위의 예금코드와 +,-만 빼고 동일하다 ( 요거는 원금에서 빼준다 )
		if(select == 4) {
			System.out.println("-------");
			System.out.println("출금");
			System.out.println("-------");
			System.out.println("계좌번호 입력 : ");
			this.act = sc.next();
			for(int i=0;i<Account.length;i++) {
				if(Account[i][0] != null) {
					for(int j=0;j<1;j+=1) { 
							if(Account[i][j].equals(this.act)) {
								System.out.print("출금하실 금액을 입력해주세요");
								this.money = sc.next();
								oMoney = Integer.parseInt(Account[i][2]);
								fMoney = oMoney -  Integer.parseInt(this.money);
								this.Account[i][2] = Integer.toString(fMoney);
								System.out.println("현재 총금액은 " + fMoney + "입니다");
								break;
							} else if(!Account[i][j].equals(this.act)) {
								System.out.println("잘못된 계좌번호 입니다");
							}
					}
				}else if(Account[0][0] == null) {
					System.out.println("계좌를 먼저 등록해주세요");
					break;
					}
				}
			}
		// 종료
		if(select == 5) {
			System.out.println("프로그램 종료");
			start = false; // 종료되는 코드
		}
		// 메뉴 이외의 숫자 고를시 다시 선택
		if(select > 5) {
			System.out.println("메뉴를 다시 선택해주세요");
		}

		}
	}
}