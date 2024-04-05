package main.java.myextends;

import java.text.DecimalFormat;

//추상클래스 BasicBank -> 추상클래스는 new 연산자로 직접 객체를 만들지 못함
//						그러므로 상속받은 자식클래스에서 객체를 만들어야함
public abstract class BasicBank {
	
	// Coustomer.java의 getBanknRatio에서 리턴된 값이 대입된다.
	String bankName;	//은행명	
	int balance;		//금액
	double ratio;		// 이자율
	
    public BasicBank(String BankName, int balance,double ratio){
        this.bankName = BankName;
        this.balance = balance;
        this.ratio = ratio;
    }
    
    public void yearAfter() {
    	DecimalFormat decFormat = new DecimalFormat("###,###");
    	System.out.println(bankName + "은행입니다.");
    	System.out.println("현재 잔액은 : "+ decFormat.format(balance) + " 입니다.");
    	System.out.println(bankName+"의 이자율은 " + (ratio*100) + "% 입니다.");
    	/*
    	 * TODO 입력한 잔액에서 이자율에 맞게 1년 후의 원금을 출력하는 부분 구현 by 범진
    	 * 
    	 * */
    	
    	// for문 구현 방법
     	// yearAfter에 쓰레기값이 들어있다면 for문을 돌면서 쓰레기값에 계산된값이 더해지기 때문에 문제가된다
    	
    	int yearAfter = balance;
    	int nowBalance= balance;
    	    	
	    for(int i =0; i<12; i++) {
	    	// 이자변수에 원금 *이자율
	    	double myRatio = nowBalance * ratio;
	    	// 원금에 이자를 누적해주고 원금+이자를 가지고 올라가서 원금+이자가 된 가격으로 올라가서 다시 계산 
	    	nowBalance += (int)myRatio;
	   	}
	    System.out.println(nowBalance);
    	System.out.println("1년후의 잔액은 :" + decFormat.format(nowBalance) + "입니다.");
    	
    	
    	//Math.pow 함수사용
    	// 쓰레기값이 들어있어도 상관이없다/ 왜? yearAfter의 값을 새로 세팅해주기때문
    	
    	
    	yearAfter = ((int)(balance*Math.pow(ratio+1,12)));
    	
    	System.out.println("1년후의 잔액은 :" + decFormat.format(yearAfter) + "입니다.");
		
    	//식의 의미는 똑같지만 값이 조금 다름

    	
    }
}
