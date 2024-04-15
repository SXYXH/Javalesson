package main.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Mapcollection {
	public void SampleAddMap() {
		Map<String , Integer> map = new HashMap<>();
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		System.out.println("총 Entry 수 :" + map.size());
		
		System.out.println(map);
		System.out.println(map.get("홍길동"));
	}
	
	
	public void SampleLoopMap() {
		Map<String , Integer> map = new HashMap<>();
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		System.out.println("총 Entry 수 :" + map.size());
		
		System.out.println(map.keySet());
		//set 컬레션활용 키값얻기
		Set<String> keySet= map.keySet();
		//iterator() 반복자를 얻어 set 컬렉션의 객체 하나씩 가죠오기
		Iterator<String> keIterator = keySet.iterator();
		//hasNext() 다음요소가 있다면 true 없다면 false
		while(keIterator.hasNext()) {
			String k = keIterator.next();
			int v = map.get(k);
			System.out.println(k + " : " + v);
		}
	}
	//Map > Member 객체 대입및 Member 클래스에 등록된 name만 출력
	public void SampleMap() {
		Map<Integer, Member> m = new HashMap<>();
		m.put(1, new Member("신용권", 10, "남자"));
		m.put(2, new Member("홍길동", 20, "남자"));
		m.put(3, new Member("동장군", 30, "남자"));
		m.put(4, new Member("홍길동", 50, "남자"));
		
		
		for(Entry<Integer, Member> entry : m.entrySet()) {
			String v = entry.getValue().getName();
			System.out.println(v);
		}
	}
	public void SampleMap1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"부산");
		map.put(2,"인천");
		map.put(3,"대구");
		map.put(4,"대전");
		map.put(5,"광주");
		map.put(6,"울산");
		System.out.println(map);
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer k =entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " : " + v);
		}
	}
	
	public void treeMap() {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(5,"서울");
		treeMap.put(3,"부산");
		treeMap.put(2,"광주");
		treeMap.put(4,"전주");
		treeMap.put(6,"익산");
		treeMap.put(1,"울산");
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.lastEntry());
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.navigableKeySet());
		
		NavigableSet<Integer> descendingNum = treeMap.descendingKeySet();
		for(Integer s : descendingNum) {
			System.out.print(s);
		}
	}
}
