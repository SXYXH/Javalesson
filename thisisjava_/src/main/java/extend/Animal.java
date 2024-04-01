package main.java.extend;

public class Animal {
	public void animalSound() {
		System.out.print("동물의 소리 : ");
	}
	
	
}
 class Cat extends Animal{
	 @Override
	public void animalSound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	@Override
	public void animalSound() {
		System.out.println("멍멍");
	}
}
/*
 * class Cat extends Animal { public void animalSound() {
 * 
 * @Override System.out.print("야옹"); } }
 * 
 * class Dog extends Animal { public void animalSound() {
 * 
 * @Override System.out.print("야옿"); } }
 */