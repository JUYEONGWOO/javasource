import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회사원의 수를 입력하십시오 : ");
		int num = sc.nextInt();
		Employee [] employee = new Employee[num];
		System.out.println("회사원 정보입력을 시작합니다. ");
		
		for(int i = 0; i < num; i++) {
			System.out.print("이름을 입력하시오 : ");
			String name = sc.next();
			System.out.print("부서을 입력하시오 : ");
			String department = sc.next();
			System.out.print("전화번호를 -없이 입력하시오 ex)01011112222 : ");
			int phoneNum = sc.nextInt();
				
			employee[i] = new Employee(name,department,phoneNum);
			
			employee[i].showInfo();

			System.out.println("입력완료!!");

			System.out.println("------------------------------------------");
		}
		System.out.println("회사원 찾기를 시작합니다.");
		System.out.print("회사원의 이름을 입력해주세요 : ");
		String sname = sc.next();
		for(int i = 0; i < num; i++) {
			if(employee[i].name.equals(sname)) {
				employee[i].showInfo();
			}			
		}
	}

}
