import java.util.Scanner;

public class Ex09_12 {
	
	static void CoffeeMachine(int coffee) {
		
		System.out.println("�߰ſ �غ�~");
		System.out.println("�������� �غ�~");
		switch(coffee) {
		case 1: 
			System.out.println("���� Ŀ��");
			break;
		case 2:
			System.out.println("ũ�� Ŀ��");
			break;
		case 3:
			System.out.println("�� Ŀ��");
			break;
		default :
			System.out.println("�� �� ���� ������ �߻��Ǿ����ϴ�. ������ ��ȯ�˴ϴ�. ó������ �ٽ����ֽñ� �ٶ��ϴ�.");
			
		}
		System.out.println("�� �ٱ�~");
		System.out.println("���� ���� ~");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �־��ֽñ� �ٶ��ϴ�.");
		System.out.print("Ŀ�Ǹ� �������ֽñ� �ٶ��ϴ�.");
		int coffee = sc.nextInt();
		
		CoffeeMachine(coffee);
		
		System.out.println("Ŀ�� ����̿�");
		
		
		
	}

}
