import java.util.Scanner;

public class ex4_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ���. ==>");
		double num1 = sc.nextDouble();
		System.out.print("�ι�° ����� ���� �Է��ϼ���. ==>");
		double num2 = sc.nextDouble();

		System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,num1+num2);
		System.out.printf("%.2f - %.2f = %.2f\n",num1,num2,num1-num2);
		System.out.printf("%.2f * %.2f = %.2f\n",num1,num2,num1*num2);
		System.out.printf("%.2f / %.2f = %.2f\n",num1,num2,num1/num2);
		System.out.printf("%.2f %% %.2f = %.2f\n",num1,num2,num1%num2);
	}

}