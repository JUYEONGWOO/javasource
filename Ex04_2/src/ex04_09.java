import java.util.Scanner;

public class ex04_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("## ��ȯ�� ����?");
		int money = sc.nextInt();
		
		int ����� = money/500;
		 money = money%500;
		System.out.printf("�����¥�� ==>%d\n", �����);
		int ��� = money/100;
		 money = money%100;
		System.out.printf("���¥�� ==>%d\n", ���);
		int ���ʿ� = money/50;
		 money = money%50;
		System.out.printf("���ʿ�¥�� ==>%d\n", ���ʿ�);
		int �ʿ� = money/10;
		 money = money%10;
		System.out.printf("�ʿ�¥�� ==>%d\n", �ʿ�);
		System.out.printf("�ٲ��� ���� �ܵ� ==>%d\n", money);
		
	}

}
