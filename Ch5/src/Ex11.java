import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		String op;
		int firstNumber;
		int secondNumber;
		int result = -1;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		 firstNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("����� �����ڸ� �Է��ϼ���: ");
		op = sc.nextLine();
		
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
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
			System.out.println("���� �߻�");
		}
		System.out.printf("%d %s %d = %d",firstNumber, op, secondNumber, result  );
		String op1 = "+";
		String op2 = "+";
		if(op1 == op2)
			System.out.println("����.");
		if(op1 == "+")
			System.out.println("����.");
		
		if(op1.equals(op2))
			System.out.println("����.");
	}
	}


