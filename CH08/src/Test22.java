import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select = -1;
		char[] stack = new char[5];
		
		int rear = 0;
		char carName = 'A';
		while(select != 3){
			System.out.print("<1> �ڵ��� �ֱ� <2> �ڵ��� ���� <3> ��");
			select = sc.nextInt();
			switch (select) {
			case 1 : if(rear >= 5) {
				System.out.println("�ڵ��� ����");
			}
					else {
						stack[rear] = carName++;
						System.out.printf("%s �ڵ����� �ͳο� ��\n", stack[rear]);
						rear++;
					}
				break;
			case 2 : if(rear <= 0) {

				System.out.println("�ڵ��� ����");
			}
					else {
						for(int i = 0; i <4; i++) {
						stack[i] = stack[ i+1];
						rear--;
						}
						System.out.printf("%s , %s \n1", stack[0], stack[1]);
						
						System.out.printf("%s �ڵ����� �ͳο��� ����\n1", stack[0]);
					}
				break;
			case 3 : System.out.println("��");
				break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

	}
}
