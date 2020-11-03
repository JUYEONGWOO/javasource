
public class test05 {
	int sum = 1;
	public static int factorial(int num) {
		int sum = 1;
		for(int i = num; i>0; i--) {
			 sum*=i;
		}
			return sum;
	}
	public static void main(String[] args) {

		System.out.println(factorial(6));
	}

}
