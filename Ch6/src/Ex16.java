import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		String str;
		int stringCount;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� :");
		str = sc.nextLine();
		
		stringCount = str.length();
		
		System.out.println();
		System.out.printf("�Է��� ���ڿ� ==>%s\n", str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		
		for(int i = stringCount - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
		
	}

}
