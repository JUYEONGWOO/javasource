import java.util.Scanner;

public class Ex09_14 {
	static int Calc(int x, int y, int op) {
		int result = -1;
		switch (op) {
		case 1 :
			result = x + y;
			break;
		case 2 :
			result = x - y;
			break;
		case 3 :
			result = x * y;
			break;
		case 4 :
			if(y == 0) {
				break;
			}
			result = x / y;
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int first;
		int second;
		int operator;
		
		System.out.print("�����ڸ� �����Ͻÿ�. <1> + <2> - <3> * <4> / :");
		operator = sc.nextInt();
		System.out.print("ù ���� ���� �Է��Ͻÿ� : ");
		first = sc.nextInt();
		System.out.print("�� ���� ���� �Է��Ͻÿ� : ");
		second = sc.nextInt();
		
		System.out.printf("��� : %d", Calc(first, second, operator));
		
		
		
	}

}
