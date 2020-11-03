import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		int [] aa = new int[10];
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 숫자 입력");
		aa[1] = sc.nextInt();
		System.out.print("2번째 숫자 입력");
		aa[2] = sc.nextInt();
		System.out.print("3번째 숫자 입력");
		aa[3] = sc.nextInt();
		System.out.print("4번째 숫자 입력");
		aa[4] = sc.nextInt();
		
		total = aa[1] + aa[2] + aa[3] + aa[4];
		
		System.out.printf("합계 :%d", total);
		

	}

}
