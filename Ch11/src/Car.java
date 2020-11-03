import java.util.Scanner;

public class Car {
	private String color;
	private int speed;

	public Car(String color, int speed) {
		this.speed = speed;
		this.color = color;
	}

	public Car(String color) {
		this.color = color;
	}
	
	public void upSpeed(int value) {
		if((speed+value)>200)
			speed = 200;
		else
			speed += value;
	}

	public void downSpeed(int value) {
		if((speed-value)<0)
			speed = 0;
		else
			speed -= value;
	}
	public String getColor(){
		return color;
	}
	public int getSpeed(){
		return speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	}
