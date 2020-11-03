
public class test02 {

	public static int function(int num, int k) {
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				k--;
				if(k==0) {
					return i;
					
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=	function(3050,10);
		System.out.print(result);
	}

}
