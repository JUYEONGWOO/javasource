import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		String str;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 여려개 입력 : ");
		
		str = sc.nextLine();
		int star ;
		for( int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			star = (int)ch - 48;
			for(int j = 0; j < star; j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
