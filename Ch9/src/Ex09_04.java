import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� ==> ");
		str = sc.nextLine();
		
		System.out.printf("���� ó���� ������ Java ��ġ ==>%d \n", str.indexOf("Java"));
		System.out.printf("�������� ������ Java ��ġ ==>%d \n", str.lastIndexOf("Java"));
		
	}

}
