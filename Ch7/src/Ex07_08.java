import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			System.out.print("ù ��° �� �Է�:");
			a = sc.nextInt();
			System.out.print("�� ��° �� �Է�:");
			b = sc.nextInt();
			if(a==0)
				break;
			System.out.printf("%d + %d = %d\n",a,b,a+b);
		}
		System.out.println("0�� �Է��ؼ� �ݺ��� Ż������.");
	}

}
