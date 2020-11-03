import java.io.IOException;

public class Ex10_08 {

	public static void main(String[] args) {
		String userName = "jinhyeonju";
		String input = "";
		int key;
		
		try {
			System.out.print("이름 = > ");
			while((key =System.in.read()) !=13){
				input += Character.toString((char)key);
			}
			if(userName.equals(input)) {
				System.out.println("현주야 어서오고");
			}
			else {
				System.out.println(input + "님은 안등록 되어있슴둥");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
