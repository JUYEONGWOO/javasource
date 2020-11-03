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
		
		System.out.print("연산자를 선택하시오. <1> + <2> - <3> * <4> / :");
		operator = sc.nextInt();
		System.out.print("첫 번쨰 수를 입력하시오 : ");
		first = sc.nextInt();
		System.out.print("두 번쨰 수를 입력하시오 : ");
		second = sc.nextInt();
		
		System.out.printf("결과 : %d", Calc(first, second, operator));
		
		
		
	}

}
