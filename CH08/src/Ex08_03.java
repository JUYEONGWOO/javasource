import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] aa = new int[4];
		int total = 0;
		for(int i = 0; i < aa.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��Ͻÿ� : ", i+1);
			aa[i] = sc.nextInt();
			total += aa[i];
		}
		System.out.printf("�հ� : %d " ,total);

	} 

}
