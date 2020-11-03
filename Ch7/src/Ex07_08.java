import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			System.out.print("첫 번째 수 입력:");
			a = sc.nextInt();
			System.out.print("두 번째 수 입력:");
			b = sc.nextInt();
			if(a==0)
				break;
			System.out.printf("%d + %d = %d\n",a,b,a+b);
		}
		System.out.println("0을 입력해서 반복문 탈출했음.");
	}

}
