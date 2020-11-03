import java.util.Scanner;

public class ex04_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("## 교환할 돈은?");
		int money = sc.nextInt();
		
		int 오백원 = money/500;
		 money = money%500;
		System.out.printf("오백원짜리 ==>%d\n", 오백원);
		int 백원 = money/100;
		 money = money%100;
		System.out.printf("백원짜리 ==>%d\n", 백원);
		int 오십원 = money/50;
		 money = money%50;
		System.out.printf("오십원짜리 ==>%d\n", 오십원);
		int 십원 = money/10;
		 money = money%10;
		System.out.printf("십원짜리 ==>%d\n", 십원);
		System.out.printf("바꾸지 못한 잔돈 ==>%d\n", money);
		
	}

}
