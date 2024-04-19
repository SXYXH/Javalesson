package main.java.generic;

public class Box<T> {
	public T content;
	
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
}
