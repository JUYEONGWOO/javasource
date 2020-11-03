import java.util.Scanner;

public class ex4_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요. ==>");
		double num1 = sc.nextDouble();
		System.out.print("두번째 계산할 값을 입력하세요. ==>");
		double num2 = sc.nextDouble();

		System.out.printf("%.2f + %.2f = %.2f\n",num1,num2,num1+num2);
		System.out.printf("%.2f - %.2f = %.2f\n",num1,num2,num1-num2);
		System.out.printf("%.2f * %.2f = %.2f\n",num1,num2,num1*num2);
		System.out.printf("%.2f / %.2f = %.2f\n",num1,num2,num1/num2);
		System.out.printf("%.2f %% %.2f = %.2f\n",num1,num2,num1%num2);
	}

}