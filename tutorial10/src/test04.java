
public class test04 {
	public static int max(int num1, int num2) {
		return (num1>num2) ? num1:num2;
		
	}
	public static int function(int num1, int num2, int num3) {
		int result = max(num1,num2);
		result = max(result,num3);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(function(5,2,3));
	}

}
