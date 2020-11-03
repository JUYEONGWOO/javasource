import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("¸î ´Ü:");
		int level = sc.nextInt();
		
		for(int i = 1; i <= 9; ++i) {
				System.out.printf("%d * %d = %d\n", level , i , level*i );
			}
		}
	}

