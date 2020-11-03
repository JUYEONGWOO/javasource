import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		String[] str;
		char op;
		int result = -1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
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
			System.out.println("연산자를 잘못 입력했습니다.");
		}
		System.out.printf("%d %s %d = %d", firstNumber, op, secondNumber, result);
		
	}
	}


