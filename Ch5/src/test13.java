import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		String[] str;
		char op;
		int result = -1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ ���ٷ� ����� �Է��ϼ��� : ");
		str = sc.nextLine().split(" ");

		firstNumber = Integer.parseInt(str[0]);
		op = str[1].charAt(0);
		secondNumber = Integer.parseInt(str[2]);
		
		switch	(op){
		case '+' :
			result = firstNumber + secondNumber;
			break;
		case '-' :
			result = firstNumber - secondNumber;
			break;
		case '*' :
			result = firstNumber * secondNumber;
			break;		
		case '/' :
			result = firstNumber / secondNumber;
			break;
		case '%' :
			result = firstNumber % secondNumber;
			break;
		default :
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
		}
		System.out.printf("%d %s %d = %d", firstNumber, op, secondNumber, result);
		
	}
	}


