import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==>");
		int a = s.nextInt();

		System.out.printf("10진수 ==> %d\n" , a);
		System.out.printf("16진수 ==> %x\n" , a);
		System.out.printf("8진수 ==> %o" , a);
	}

}
