import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 ==>");
		str = sc.nextLine();

		System.out.print("출력 문자열 ==>");
		if(!str.startsWith("(")){
			System.out.print("(");
			
		}
		for(int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i));
		}
		if(!str.endsWith(")")) {
			System.out.print(")");
			
		}

	}

}
