import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int first;
		int second;
		int b =0 ;
		char op;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("����� ù��° ���� �Է� : ");
		first = sc.nextInt();
		System.out.print("����� �ι�° ���� �Է� : ");
		second = sc.nextInt();
		System.out.print("����� �����ڸ� �Է��ϼ���(����:!�Է�) : ");
		op = (char)System.in.read();
		if(op == '!')
			break;
		
		switch (op) {
		case '+' :
			System.out.printf("%d + %d = %d\n", first, second, first + second);
			break;
		case '-' :
			System.out.printf("%d - %d = %d\n", first, second, first - second);
			break;
		case '*' :
			System.out.printf("%d * %d = %d\n", first, second, first * second);
			break;
		case '/' :
			System.out.printf("%d / %d = %d\n", first, second, first / second);
			break;
		case '%' :
			System.out.printf("%d %% %d = %d\n", first, second, first % second);
			break;
		
		default :
			System.out.println("������ �߸��Է��߽���.");
		}
		
	}

	}
	}
