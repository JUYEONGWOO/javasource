import java.util.Scanner;

public class Ex08_sense {

	public static void main(String[] args) {
		int studentNumber;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
		studentNumber = sc.nextInt();
		int[][] exams = new int[studentNumber][4];
		
		for(int i = 0; i < exams.length; i++) {
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d��° ���� ���� �Է� : ", j+1);
				exams [i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d��° �л��� ����--------------------------\n", i+1);
			System.out.println("1�б��߰� 1�б��⸻ 2�б��߰� 2�б�⸻  ���");
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%3d\t", exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("%3d\t", total/exams[i].length);
			total =0;
			System.out.println();
	}
	}
}


