import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
	
		String str;
		char ch;
		int upperCaseCount =0;
		int lowerCaseCount =0;
		int numberCount =0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� : ");
		
		str = sc.nextLine();
		for( i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
				upperCaseCount ++;
			if (ch >= 'a' && ch <= 'z')
				lowerCaseCount ++;
			if  (ch >= '0' && ch <= '9')
				numberCount ++;
			}
		System.out.printf("�빮�� %d��,�ҹ��� %d��, ���� %d��", upperCaseCount, lowerCaseCount, numberCount);
	}

}
