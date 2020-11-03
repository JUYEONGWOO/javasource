import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 ==> ");
		str = sc.nextLine();
		
		System.out.printf("제일 처음에 나오는 Java 위치 ==>%d \n", str.indexOf("Java"));
		System.out.printf("마지막에 나오는 Java 위치 ==>%d \n", str.lastIndexOf("Java"));
		
	}

}
