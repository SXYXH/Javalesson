package main.java.extend;

public class Coffee {
	public void cof() {
		System.out.print("커피 : ");
	}
}
class Americano extends Coffee {
	@Override
	public void cof() {
		System.out.println("아메리카노");
	}
}
class latte extends Coffee {
	@Override
	public void cof()  {
	System.out.println("라떼");
	}
}