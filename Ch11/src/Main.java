
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("����",100);
		Car car5 = new Car("��Ʈ");
		car1.setColor("��������");
		car1.upSpeed(90);

		Car car2 = new Car("�Ķ�",10);
		car2.upSpeed(90);
		Car car3 = new Car("�ڹ�Ʈ���",20);
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
