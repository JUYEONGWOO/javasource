import java.util.Scanner;

public class Ex08_sense {

	public static void main(String[] args) {
		int studentNumber;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오 : ");
		studentNumber = sc.nextInt();
		int[][] exams = new int[studentNumber][4];
		
		for(int i = 0; i < exams.length; i++) {
			for(int j = 0; j < exams[i].length; j++) {
				System.out.printf("%d번째 시험 성적 입력 : ", j+1);
				exams [i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < exams.length; i++) {
			System.out.printf("%d번째 학생의 성적--------------------------\n", i+1);
			System.out.println("1학기중간 1학기기기말 2학기중간 2학기기말  평균");
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


