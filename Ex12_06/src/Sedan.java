
public class Sedan extends Car {
	
	void upSpeed(int speed) {
		this.speed += speed;
		
		if(this.speed > 150) {
			this.speed = 150 ; 
			}
		System.out.println("오버라이딩한 서브클래스의 메소드 : " + this.speed);
		
	}

}
