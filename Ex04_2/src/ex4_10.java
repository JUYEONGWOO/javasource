import java.util.Scanner;

public class ex4_10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		Boolean b= (year%4==0)&&!(year%100==0)||(year%400==0);
		if(b==true) {
			System.out.printf("%d ���� �����Դϴ�.\n",year);
		}
		else {
			System.out.printf("%d ���� ������ �ƴմϴ�.\n",year);
		}

	}

}
