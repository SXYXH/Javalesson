package main.java.collection;

import java.util.ArrayList;
import java.util.List;

import main.java.collection.CarVo;

public class ListCollection {
	public void sampleArraylist() {
	System.out.println("sampleArraylist");
	
	List<String> list = new ArrayList<String>();
	list.add("문자1");
	list.add("문자2");
	list.add("문자3");
	list.add("문자4");
	list.add("문자5");
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	System.out.println(list.get(3));
	System.out.println(list.get(4));
	}
	
	public void sampleArraylist2() {
		System.out.println("sampleArraylistremove");
		List<String> list = new ArrayList<String>();
		list.add("문자1");
		list.add("문자2");
		list.add("문자3");
		list.add("문자4");
		list.add("문자5");
		System.out.println(list);
		System.out.println("remove 실행");
		list.remove(0);
		System.out.println(list);
		list.remove(3);
		list.remove(2);
		System.out.println(list);
		}
	
	public void sampleArraylistLoop() {
		System.out.println("sampleArraylistLoop");
		List<String> list = new ArrayList<String>();
		list.add("문자1");
		list.add("문자2");
		list.add("문자3");
		list.add("문자4");
		list.add("문자5");
		/*
		for(int i =0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		try {
			for(String a : list) {
				System.out.println(list.get(Integer.parseInt(a)));
			}
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException 예외 발생");
		}
	}
	
	public void intArrayList() {
		List<Integer> intlist = new ArrayList<>();
		System.out.println("intArrayList");
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		System.out.println("3번째 인덱스에 100추가");
		intlist.add(2, 100);
		for(int a : intlist) {
			System.out.println(a);
		}
	}
	public void myArrayList() {
		List<String> numlist = new ArrayList<>();
		System.out.println("myArrayList");
		numlist.add("1");
		numlist.add("2");
		numlist.add("3");
		numlist.add("4");
		numlist.add("5");
		numlist.add("6");
		System.out.println("배열길이" + numlist.size());
		numlist.remove(4);
		System.out.println("삭제후 길이" + numlist.size());
	}
	
	public void CarArrayList() {
		List<CarVo> list = new ArrayList<>();
		list.add(new CarVo("현대","그랜져","흰색", 300));
		list.add(new CarVo("기아","k5","검은색", 200));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getCompany());
			System.out.println(list.get(i).getModel());
			System.out.println(list.get(i).getColor());
			System.out.println(list.get(i).getSpeed());
		}
	}
	
	
}
	

