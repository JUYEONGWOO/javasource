
public class Ex09_09 {

	public static void main(String[] args) {
		

		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");

		System.out.println("�� ���ڿ�1");
		System.out.println("�� ���ڿ�2");
		System.out.println("�� ���ڿ�3");

		System.out.println("���ڿ�1==���ڿ�2 ���:	"+ (str1==str2));
		System.out.println("���ڿ�1.equls(���ڿ�2) ���:	"+ str1.equals(str2));
		System.out.println("���ڿ�1==���ڿ�3 ���:	"+( str1==str3));
		System.out.println("���ڿ�1.equls(���ڿ�3) ���:	"+ str1.equals(str3));
	
	}

}
