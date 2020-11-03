
public class test20 {

	public static void main(String[] args) {
		int[][] mt = new int[9][8];
		for(int i=0; i < mt.length; i++) {
			for(int j = 0; j < mt[i].length; j++) {
				mt[i][j] = (j+2)*(i+1);
				System.out.printf("%dX%d= %d\t",j+2,i+1,mt[i][j]);
			}
			System.out.println();
		}
		

	}

}
