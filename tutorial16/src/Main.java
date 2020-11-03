import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 몇 명의 정보를 입력하시겠습니까 ?");
		int number = sc.nextInt() ;
		Student[] students = new Student[number];
		
		for(int i=0; i < number; i++) {
			
			String name;
			int age;
			int height;
			int weight;
			String studenID;
			int grade;
			int gPA;
			System.out.print("학생의 이름을 입력하시오.");
			name = sc.next();
			System.out.print("학생의 나이을 입력하시오.");
			age = sc.nextInt();
			System.out.print("학생의 키을 입력하시오.");
			height = sc.nextInt();
			System.out.print("학생의 몸무게을 입력하시오.");
			weight = sc.nextInt();
			System.out.print("학생의 학번을 입력하시오.");
			studenID = sc.next();
			System.out.print("학생의 학년을 입력하시오.");
			grade = sc.nextInt();
			System.out.print("학생의 성적을 입력하시오.");
			gPA = sc.nextInt();
		 students[i] = new Student(name, age, height, weight, studenID, grade, gPA);
			
		}
		for(int j = 0; j < number; j++ ) {
			students[j].show();
		}
		
	}

}
