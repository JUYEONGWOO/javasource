
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("»¡°­",100);
		Car car5 = new Car("¹ÎÆ®");
		car1.setColor("³°Àº»¡°­");
		car1.upSpeed(90);

		Car car2 = new Car("ÆÄ¶û",10);
		car2.upSpeed(90);
		Car car3 = new Car("ÄÚ¹ßÆ®ºí·ç",20);
		car3.upSpeed(100);
		
		int x =10;
		int y =20;
		x=y;
		System.out.print(x);
		System.out.print(y);
		y=10;

				System.out.print(x);
				System.out.print(y);
	}

}
