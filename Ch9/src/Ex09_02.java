import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� ==>");
		str = sc.nextLine();
		System.out.print("��� ���ڿ� ==>");
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o'){
				System.out.printf("%c",'$');
			}
			else {
				System.out.printf("%c",str.charAt(i));
			}
		}

	}

}
