import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		String op;
		int firstNumber;
		int secondNumber;
		int result = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		 firstNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("계산할 연산자를 입력하세요: ");
		op = sc.nextLine();
		
		System.out.print("두번째 수를 입력하세요 : ");
			secondNumber = sc.nextInt();
		
		if(op.equals("+"))
			result = firstNumber + secondNumber;
		else if(op.equals("-"))
			result = firstNumber - secondNumber;
		else if(op.equals("*"))
			result = firstNumber * secondNumber;
		else if(op.equals("/"))
			result = firstNumber / secondNumber;
		else if(op.equals("%"))
			result = firstNumber % secondNumber;
		else { 
			System.out.println("오류 발생");
		}
		System.out.printf("%d %s %d = %d",firstNumber, op, secondNumber, result  );
		String op1 = "+";
		String op2 = "+";
		if(op1 == op2)
			System.out.println("같다.");
		if(op1 == "+")
			System.out.println("같다.");
		
		if(op1.equals(op2))
			System.out.println("같다.");
	}
	}


