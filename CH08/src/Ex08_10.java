import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		System.out.print("���Է�:");
		row = sc.nextInt();
		System.out.print("���Է�:");
		col = sc.nextInt();
		int[][] aa = new int[row][col];
		int value = 1;
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ���\n",row-1, col-1);
		for(int i =0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) {
				aa[i][j] = value;
				value++;
			}
		}
		
		for(int i =0; i < aa.length; i++) {
			for(int j = 0; j < aa[i].length; j++) {
				System.out.printf("%3d ", aa[i][j]);
			}
		System.out.println();
		}
		
	}

}
