import java.util.Scanner;

public class Ex09_12 {
	
	static void CoffeeMachine(int coffee) {
		
		System.out.println("뜨거운물 준비~");
		System.out.println("종이컵을 준비~");
		switch(coffee) {
		case 1: 
			System.out.println("보통 커피");
			break;
		case 2:
			System.out.println("크림 커피");
			break;
		case 3:
			System.out.println("블랙 커피");
			break;
		default :
			System.out.println("알 수 없는 오류가 발생되었습니다. 동전이 반환됩니다. 처음부터 다시해주시기 바랍니다.");
			
		}
		System.out.println("물 붙기~");
		System.out.println("스윽 스윽 ~");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("동전을 넣어주시기 바랍니다.");
		System.out.print("커피를 선택해주시기 바랍니다.");
		int coffee = sc.nextInt();
		
		CoffeeMachine(coffee);
		
		System.out.println("커피 대령이요");
		
		
		
	}

}
