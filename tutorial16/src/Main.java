import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �� ���� ������ �Է��Ͻðڽ��ϱ� ?");
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
			System.out.print("�л��� �̸��� �Է��Ͻÿ�.");
			name = sc.next();
			System.out.print("�л��� ������ �Է��Ͻÿ�.");
			age = sc.nextInt();
			System.out.print("�л��� Ű�� �Է��Ͻÿ�.");
			height = sc.nextInt();
			System.out.print("�л��� �������� �Է��Ͻÿ�.");
			weight = sc.nextInt();
			System.out.print("�л��� �й��� �Է��Ͻÿ�.");
			studenID = sc.next();
			System.out.print("�л��� �г��� �Է��Ͻÿ�.");
			grade = sc.nextInt();
			System.out.print("�л��� ������ �Է��Ͻÿ�.");
			gPA = sc.nextInt();
		 students[i] = new Student(name, age, height, weight, studenID, grade, gPA);
			
		}
		for(int j = 0; j < number; j++ ) {
			students[j].show();
		}
		
	}

}
