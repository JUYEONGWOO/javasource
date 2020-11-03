
public class Ex09_08 {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";

		System.out.println("원문자열 ==>"+str1);
		System.out.println("원문자열 ==>"+str2);
		
		System.out.println(str1.compareTo(str2)>0);
		System.out.println(str1.contains("Java"));
	}

}
