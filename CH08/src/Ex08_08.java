
public class Ex08_08 {

	public static void main(String[] args) {
		int[][] aa = new int[3][4];
		int value = 1;
		System.out.println("a[0][0]부터 aa[2][3]까지 출력");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) {
				aa[i][j] = value;
				System.out.printf("%3d ", aa[i][j]);
				value++;
				
			}
			System.out.println();
		}
		
		
	}

}
