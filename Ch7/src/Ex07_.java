import java.util.Scanner;

public class Ex07_ {

	public static void main(String[] args) {
		int first;
		int second;
		int total = 0;
		int i ;
		int m ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�հ��� ���۰� : ");
		
		first = sc.nextInt();
		
		System.out.print("�հ��� ���� : ");
		
		second = sc.nextInt();
		
		System.out.print("��� :");
		
		m = sc.nextInt();
				
		for( i = first; i <= second; i++) {
			if( i % m != 0) 
				continue;	
			
			total += i;
			
		}
		
		System.out.printf("%d���� %d������ %d����� �հ� : %d ", first, second, m, total);

	}

}
