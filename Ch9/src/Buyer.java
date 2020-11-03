import java.util.Scanner;

public class Buyer {
	int myMoney;
	int nomalCoffee;
	int creamCoffee;
	int blackCoffee;
	public Buyer(int money) {
		myMoney = money;
	}
	
	static void BuyCoffee(int money) {
		System.out.printf("돈 %d원을 넣으셨습니다.", money);
		System.out.println("커피를 선택해주시기바랍니다.");
		System.out.print("<1>보통 커피 <2>크림 커피 <3>블랙 커피 : ");
		Scanner sc = new Scanner(System.in);
		int coffee = sc.nextInt();
		switch
		}
}
