import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		
		int menu;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("�մ� �ֹ��Ͻðڽ��ϱ�?");
			System.out.print("<1>ī��� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�׸���ų���� ==>");
			menu = sc.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("#ī���� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2 : 
				System.out.println("#īǪġ�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3 : 
				System.out.println("#�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 4 : 
				System.out.println("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.");
				break;
			default :
				System.out.println("�߸� �ֹ��ϼ̽��ϴ�.");
			}
			System.out.println();
		} while(menu != 4);

	}

}
