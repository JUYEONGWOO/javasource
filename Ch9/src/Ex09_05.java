import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {

		String str;
		String str2;
		String str3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 ==>");
		str = sc.nextLine();
		
		str2 = str.replace("Java" , "자바");
		System.out.println(str2);
		str3 = str.substring(0, 4);
		System.out.println(str3);
		String str4[] = str.split(" ");
		for(int i = 0; i < str4.length; i++) {
			System.out.println(str4[i]);
		}
		

	}

}
