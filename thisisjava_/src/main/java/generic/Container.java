package main.java.generic;

public class Container<T> {
	private T con;
	
	public T get() {
		return con;
	}
	public void set(T con) {
		this.con = con;
	}
}
