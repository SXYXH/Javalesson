package main.java.generic;

public class CarAgency implements Rantable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}
}
