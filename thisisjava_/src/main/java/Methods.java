package main.java;

public class Methods {
	String name;
	
	Methods(){
		name = "나";
		System.out.printf("생성자 : %s\n", name);
		
	}
	void printName() {
		System.out.printf("printfName() : %s",name);
		
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.printName();
	}
}
