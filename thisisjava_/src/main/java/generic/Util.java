package main.java.generic;

public class Util<K,V> {
	public static Integer getValue(Pair<String, Integer> pair, String string) {
		if(pair.getKey().equals(string)) {
			return pair.getValue();
		}else{
			return null;
		}
	}	
}
