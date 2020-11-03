import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		String str;
		String str2="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력하시오:");
		str = sc.nextLine();
		
		for(int i = 0; i <str.length(); i++) {
			if('a'<= (char) str.charAt(i)&& (char) str.charAt(i)<= 'z' ) {
				str2 += (char)(str.charAt(i)-32);
			}
			else if('A'<= (char) str.charAt(i)&& (char) str.charAt(i)<= 'Z' ) {
				str2 += (char)(str.charAt(i)+32);
			}
			else {
				str2 += str.charAt(i);
			}
			
			
		}
		System.out.print(str2);

	}

}
