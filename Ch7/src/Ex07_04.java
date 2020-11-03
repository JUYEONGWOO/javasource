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
		System.out.print("계산할 첫번째 수를 입력 : ");
		first = sc.nextInt();
		System.out.print("계산할 두번째 수를 입력 : ");
		second = sc.nextInt();
		System.out.print("계산할 연산자를 입력하세요(종료:!입력) : ");
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
			System.out.println("연산자 잘못입력했슴다.");
		}
		
	}

	}
	}
