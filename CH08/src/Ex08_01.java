import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		int [] aa = new int[10];
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��° ���� �Է�");
		aa[1] = sc.nextInt();
		System.out.print("2��° ���� �Է�");
		aa[2] = sc.nextInt();
		System.out.print("3��° ���� �Է�");
		aa[3] = sc.nextInt();
		System.out.print("4��° ���� �Է�");
		aa[4] = sc.nextInt();
		
		total = aa[1] + aa[2] + aa[3] + aa[4];
		
		System.out.printf("�հ� :%d", total);
		

	}

}
