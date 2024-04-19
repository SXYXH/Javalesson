package main.java.generic;

public class Container2<K,V> {
	private K k;
	private V v;
	
	public K getKey() {
		return k;
	}
	public V getValue() {
		return v;
	}

	
	public void set(K k,V v) {
		this.k = k;
		this.v = v;
	}
}
