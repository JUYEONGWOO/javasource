import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		char[] stack = new char[5];
		char carName = 'A';
		int top = 0;
		int select =-1;
		
		while(select != 3){
			Scanner sc = new Scanner(System.in);
			System.out.print("<1>푸슈 <2>풉 <3>엔도 :");
			select = sc.nextInt();
			
			switch(select){
			case 1 : 
				if(top == 5) {
					System.out.println("주차장 꽉참");
					
				}
				else {
					stack[top] = carName;
					carName++;
					System.out.printf("%s 이름의 차가 주차되었다\n",stack[top]);
					top++;
				}
				break;
			case 2 :
				if(top == 0) {
					System.out.println("나갈 차가 없다.");
				}
				else {
					top--;
					System.out.printf("%s 이름의 차가 빠져나갔다.\n",stack[top]);
				}
				break;
			case 3 :
				System.out.println("프로그램 끝");
				break;
			default :
				System.out.println("숫자를 똑바로 입력하시오");
			}
	}

}
}
