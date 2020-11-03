
public class Ex10_03 {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int result;
		try {
		result = a / b;
		}catch(ArithmeticException e) {
			System.out.print("¿À·þ´Ï´Ù");
			System.out.println(e.getMessage());
			
		}
	}

}
