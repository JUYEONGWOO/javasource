
public class Ex10_04 {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int result;
		try {
			if(b==0) {
				throw new Exception("0���� ��������� ? �ȵ˴ϴ�.");
			}
			result = a / b;
		}catch(Exception e) {

			System.out.print("�����ϴ�");
			System.out.println(e.getMessage());
		}

	}

}
