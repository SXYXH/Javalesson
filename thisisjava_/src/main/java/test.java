package main.java;

public class test {
	int num1,num3;
	static int num2;
	
	public void prtName(String name) {
		String prtMsg = name + "Hello";
		System.out.println(prtMsg);
	}

	public void prtId(String id) {
		String prtId = id;
		System.out.println(prtId);
	}
	
	public static void main(String[] arg) {
		test cc = new test();
		cc.num1 = 100;
		test.num2 = 100;
		cc.num3 = 200;
		cc.prtName("하이");
		cc.prtId("아이디");
		
		System.out.printf("%d,%d",cc.num1 ,test.num2);
		System.out.printf(",%d",cc.num3);
	}
}
