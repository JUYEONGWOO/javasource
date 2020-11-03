
public class Test21 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] aa = new int[10][10][10];
		int num = 1;
		int total = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <10; j++) {
				for(int k = 0; k < 10; k++) {
					aa[i][j][k] = num;
					num++;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <10; j++) {
				for(int k = 0; k < 10; k++) {
					total += aa[i][j][k];
				}
			}
		}
		System.out.printf("1~1000까지 합계 : 500500", total);
	}

}
