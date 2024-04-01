package main.java.extend;

public class ComputerExample {
  //public void main(String[] args) {
	public void comE() {
	  int r = 10;
	  
	  Calculator calculator = new Calculator();
	  System.out.println("원 면적 : " + calculator.areaCircle1(r));
	  System.out.println();
	  
	  Computer computer = new Computer();
	  System.out.println("원 면적 :" + computer.areaCircle1(r));	  
	  // }
	}
}
