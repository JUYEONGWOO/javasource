import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select = -1;
		char[] stack = new char[5];
		
		int rear = 0;
		char carName = 'A';
		while(select != 3){
			System.out.print("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝");
			select = sc.nextInt();
			switch (select) {
			case 1 : if(rear >= 5) {
				System.out.println("자동차 꽉참");
			}
					else {
						stack[rear] = carName++;
						System.out.printf("%s 자동차가 터널에 들어감\n", stack[rear]);
						rear++;
					}
				break;
			case 2 : if(rear <= 0) {

				System.out.println("자동차 없음");
			}
					else {
						for(int i = 0; i <4; i++) {
						stack[i] = stack[ i+1];
						rear--;
						}
						System.out.printf("%s , %s \n1", stack[0], stack[1]);
						
						System.out.printf("%s 자동차가 터널에서 나감\n1", stack[0]);
					}
				break;
			case 3 : System.out.println("끝");
				break;
			default : System.out.println("잘못입력하셨습니다.");
		}
	}

	}
}
