package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	private User[] users = new User[2]; //�����
	private Product[] products = new Product[10]; // ��ϻ�ǰ����
	ArrayList<Product> carts = new ArrayList<Product>();//��ٱ���
	Scanner scan = new Scanner(System.in);//Ű���� �Է� ó��
	int selUser;
	private String title; // ���θ� �̸�
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() { // ���θ� ����� ���� �迭�� ���
		
		users[0] = new User("�ֿ���", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("������1", 100, "KT");
		products[1] = new CellPhone("������2", 200, "KT");
		products[2] = new CellPhone("������3", 300, "KT");
		products[3] = new CellPhone("������4", 400, "KT");
		products[4] = new CellPhone("������5", 500, "KT");
		products[5] = new SmartTV("LG1",600,"���");
		products[6] = new SmartTV("LG2",700,"1K");
		products[7] = new SmartTV("LG3",800,"2K");
		products[8] = new SmartTV("LG4",900,"3K");
		products[9] = new SmartTV("LG5",1000,"���");
	}

	@Override
	public void start() {
		System.out.println(title + " : ���� ȭ�� - ���� ����");
		System.out.println("=============================");
		int i = 0;
		for( User u : users ) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(),u.getPayType() );
		}	
		System.out.println("[x]����");
		System.out.print("���� : ");
		String selectAcc = scan.next();
		switch (selectAcc) {
		case "0" : case "1" :
			System.out.println("## " + selectAcc + "���� ##");
			productList();
			selUser = Integer.parseInt(selectAcc);
			break;
		case "x" : case "X":
			System.out.println("Shop�� �����մϴ�.");
			break;
			default:
				System.out.println("\n�Է°��� Ȯ���� �ּ���\n");
				start();
				break;
		}	
		}
	public void productList() {

		System.out.println(title + " : ��ǰ��� - ��ǰ ����");
		System.out.println("=============================");
		int i = 0;
		for(Product p : products) {
		System.out.printf("[%d]",i++);
		p.printDetail();
		
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("���� :");
		String selectPro = scan.next();
		switch (selectPro) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		case "0":case "1":case "2":case "3":case "4":
		case "5":case "6":case "7":case "8":case "9":
			//īƮ�� ���
			carts.add(products[Integer.parseInt(selectPro)]); //��Ʈ������ �ٲ�����Ѵ�
			//�ٽ� ��ǰ���� �����ֱ�
			productList();
			break;
		default:
			System.out.println("�Է°��� Ȯ���� �ּ���.");
			productList();
			break;
		}
		}
		public void checkOut() {

			System.out.println(title + " : üũ�ƿ�");
			System.out.println("=============================");
			int i = 0;
			int total = 0; //��ٱ��� �ݾ� �հ�
			for(Product c: carts) {
				System.out.printf("[%d]%s(%d)\n",i++,c.getPname(),c.getPrice());
				total += c.getPrice();//��ٱ��� ���� �� �հ� ���ϱ�
			}
			System.out.println("=============================");
			System.out.println("���� ��� : " + users[selUser].getPayType());
			System.out.println("�հ� :" +total+ " �� �Դϴ�.");
			System.out.println("[p] ����, [q] ���� �Ϸ�");
			System.out.print("���� : ");
			
			String select = scan.next();
			switch (select) {
			case "p" :
				productList();
				break;
			case "q" :
				System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ�. ##");
				break;
			default :
				System.out.println("�Է°��� Ȯ�����ּ���.");
				checkOut();
			}
			
		
		}
}

