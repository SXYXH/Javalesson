package main.java.colframework;

public class CarVo {
	private String company;
	private String model;
	private String color;
	private int speed;
	
	public CarVo(String company, String model, String color, int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
