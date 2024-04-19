package main.java.generic;

public class HomeAgency implements Rantable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
