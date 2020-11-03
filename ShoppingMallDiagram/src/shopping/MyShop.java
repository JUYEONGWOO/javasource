package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	private User[] users = new User[2]; //사용자
	private Product[] products = new Product[10]; // 등록상품정보
	ArrayList<Product> carts = new ArrayList<Product>();//장바구니
	Scanner scan = new Scanner(System.in);//키보드 입력 처리
	int selUser;
	private String title; // 쇼핑몰 이름
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() { // 쇼핑몰 사용자 생성 배열에 담기
		
		users[0] = new User("주영우", PayType.CARD);
		users[1] = new User("진현주", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("아이폰1", 100, "KT");
		products[1] = new CellPhone("아이폰2", 200, "KT");
		products[2] = new CellPhone("아이폰3", 300, "KT");
		products[3] = new CellPhone("아이폰4", 400, "KT");
		products[4] = new CellPhone("아이폰5", 500, "KT");
		products[5] = new SmartTV("LG1",600,"흑백");
		products[6] = new SmartTV("LG2",700,"1K");
		products[7] = new SmartTV("LG3",800,"2K");
		products[8] = new SmartTV("LG4",900,"3K");
		products[9] = new SmartTV("LG5",1000,"흑백");
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("=============================");
		int i = 0;
		for( User u : users ) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(),u.getPayType() );
		}	
		System.out.println("[x]종료");
		System.out.print("선택 : ");
		String selectAcc = scan.next();
		switch (selectAcc) {
		case "0" : case "1" :
			System.out.println("## " + selectAcc + "선택 ##");
			productList();
			selUser = Integer.parseInt(selectAcc);
			break;
		case "x" : case "X":
			System.out.println("Shop을 종료합니다.");
			break;
			default:
				System.out.println("\n입력값을 확인해 주세요\n");
				start();
				break;
		}	
		}
	public void productList() {

		System.out.println(title + " : 상품목록 - 상품 선택");
		System.out.println("=============================");
		int i = 0;
		for(Product p : products) {
		System.out.printf("[%d]",i++);
		p.printDetail();
		
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 :");
		String selectPro = scan.next();
		switch (selectPro) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		case "0":case "1":case "2":case "3":case "4":
		case "5":case "6":case "7":case "8":case "9":
			//카트에 담기
			carts.add(products[Integer.parseInt(selectPro)]); //인트형으로 바꿔줘야한다
			//다시 상품몽록 보여주기
			productList();
			break;
		default:
			System.out.println("입력값을 확인해 주세요.");
			productList();
			break;
		}
		}
		public void checkOut() {

			System.out.println(title + " : 체크아웃");
			System.out.println("=============================");
			int i = 0;
			int total = 0; //장바구니 금액 합계
			for(Product c: carts) {
				System.out.printf("[%d]%s(%d)\n",i++,c.getPname(),c.getPrice());
				total += c.getPrice();//장바구니 물건 값 합계 구하기
			}
			System.out.println("=============================");
			System.out.println("결제 방법 : " + users[selUser].getPayType());
			System.out.println("합계 :" +total+ " 원 입니다.");
			System.out.println("[p] 이전, [q] 결제 완료");
			System.out.print("선택 : ");
			
			String select = scan.next();
			switch (select) {
			case "p" :
				productList();
				break;
			case "q" :
				System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
				break;
			default :
				System.out.println("입력값을 확인해주세요.");
				checkOut();
			}
			
		
		}
}

