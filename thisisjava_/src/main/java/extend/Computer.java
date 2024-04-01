package main.java.extend;

public class Computer extends Calculator{
	@Override
	public double areaCircle1(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI *r*r;
	}
}
