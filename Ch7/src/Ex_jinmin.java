import java.util.Scanner;

public class Ex_jinmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Put your first number. ==> ");
			int first = sc.nextInt();

			System.out.print("Put your second number. ==> ");
			int second = sc.nextInt();	
		
			sc.nextLine();
			
			System.out.print("Select operator that you want.\n"
					+ "(if you want to terminate, push '!' ==> ");
			String operator = sc.nextLine();
			
			
			
			
			switch(operator) {
			case "+":
				System.out.printf("%d + %d = %d \n", first, second, first + second);
				break;
			case "-":
				System.out.printf("%d - %d = %d \n", first, second, first - second);
				break;
			case "*":
				System.out.printf("%d * %d = %d \n", first, second, first * second);
				break;
			case "/":
				System.out.printf("%d / %d = %d \n", first, second, first / second);
				break;
			case "%":     //나머지 연산자는 %를 2개 붙여야 한다.
				System.out.printf("%d %% %d = %d \n", first,second, first % second);
				break;
			default :
				System.out.println("Calculation Finished.");
			}
				if(operator.equals("!")) {
					System.out.println("You put the wrong calculation, it's I.");
				break;
				}
			
			
		}
	}
}
