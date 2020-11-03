import java.util.Scanner;

public class test03 {

	public static char function(String input) {
		return input.charAt(input.length()-1);
	}
	public static void main(String[] args) {
		
		
		System.out.println("hello world의 마지막 문자는"+function("hello world"));
		
	}

}
