import java.io.IOException;

public class Ex10_08 {

	public static void main(String[] args) {
		String userName = "jinhyeonju";
		String input = "";
		int key;
		
		try {
			System.out.print("�̸� = > ");
			while((key =System.in.read()) !=13){
				input += Character.toString((char)key);
			}
			if(userName.equals(input)) {
				System.out.println("���־� �����");
			}
			else {
				System.out.println(input + "���� �ȵ�� �Ǿ��ֽ���");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
