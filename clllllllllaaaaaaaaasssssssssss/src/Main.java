import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ����� ���� �Է��Ͻʽÿ� : ");
		int num = sc.nextInt();
		Employee [] employee = new Employee[num];
		System.out.println("ȸ��� �����Է��� �����մϴ�. ");
		
		for(int i = 0; i < num; i++) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			String name = sc.next();
			System.out.print("�μ��� �Է��Ͻÿ� : ");
			String department = sc.next();
			System.out.print("��ȭ��ȣ�� -���� �Է��Ͻÿ� ex)01011112222 : ");
			int phoneNum = sc.nextInt();
				
			employee[i] = new Employee(name,department,phoneNum);
			
			employee[i].showInfo();

			System.out.println("�Է¿Ϸ�!!");

			System.out.println("------------------------------------------");
		}
		System.out.println("ȸ��� ã�⸦ �����մϴ�.");
		System.out.print("ȸ����� �̸��� �Է����ּ��� : ");
		String sname = sc.next();
		for(int i = 0; i < num; i++) {
			if(employee[i].name.equals(sname)) {
				employee[i].showInfo();
			}			
		}
	}

}
