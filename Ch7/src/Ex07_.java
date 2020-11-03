import java.util.Scanner;

public class Ex07_ {

	public static void main(String[] args) {
		int first;
		int second;
		int total = 0;
		int i ;
		int m ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합계의 시작값 : ");
		
		first = sc.nextInt();
		
		System.out.print("합계의 끝값 : ");
		
		second = sc.nextInt();
		
		System.out.print("배수 :");
		
		m = sc.nextInt();
				
		for( i = first; i <= second; i++) {
			if( i % m != 0) 
				continue;	
			
			total += i;
			
		}
		
		System.out.printf("%d부터 %d까지의 %d배수의 합계 : %d ", first, second, m, total);

	}

}
