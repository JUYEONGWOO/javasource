import java.util.Scanner;

public class ex4_10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		Boolean b= (year%4==0)&&!(year%100==0)||(year%400==0);
		if(b==true) {
			System.out.printf("%d 년은 윤년입니다.\n",year);
		}
		else {
			System.out.printf("%d 년은 윤년이 아닙니다.\n",year);
		}

	}

}
