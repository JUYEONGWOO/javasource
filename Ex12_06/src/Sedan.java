
public class Sedan extends Car {
	
	void upSpeed(int speed) {
		this.speed += speed;
		
		if(this.speed > 150) {
			this.speed = 150 ; 
			}
		System.out.println("�������̵��� ����Ŭ������ �޼ҵ� : " + this.speed);
		
	}

}
