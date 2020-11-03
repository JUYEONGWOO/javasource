import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		String str;
		int stringCount;
		Scanner sc = new Scanner(System.in);
		System.out.print("글자를 입력 :");
		str = sc.nextLine();
		
		stringCount = str.length();
		
		System.out.println();
		System.out.printf("입력한 문자열 ==>%s\n", str);
		System.out.printf("변환된 문자열 ==> ");
		
		for(int i = stringCount - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
		
	}

}
