import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		char[] stack = new char[5];
		char carName = 'A';
		int top = 0;
		int select =-1;
		
		while(select != 3){
			Scanner sc = new Scanner(System.in);
			System.out.print("<1>Ǫ�� <2>Ǳ <3>���� :");
			select = sc.nextInt();
			
			switch(select){
			case 1 : 
				if(top == 5) {
					System.out.println("������ ����");
					
				}
				else {
					stack[top] = carName;
					carName++;
					System.out.printf("%s �̸��� ���� �����Ǿ���\n",stack[top]);
					top++;
				}
				break;
			case 2 :
				if(top == 0) {
					System.out.println("���� ���� ����.");
				}
				else {
					top--;
					System.out.printf("%s �̸��� ���� ����������.\n",stack[top]);
				}
				break;
			case 3 :
				System.out.println("���α׷� ��");
				break;
			default :
				System.out.println("���ڸ� �ȹٷ� �Է��Ͻÿ�");
			}
	}

}
}
