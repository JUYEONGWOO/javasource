import java.util.Scanner;

public class Test7 {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("문자열을 입력==>");
			String str;
			str= s.nextLine();
			int i;
			
			for(i= str.length()-1; i>=0; i--) {
				System.out.printf("%c", str.charAt(i));
				
			}
			
			
			
			
			
			
			
			
		}
}
