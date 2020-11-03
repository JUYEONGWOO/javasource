import java.util.Scanner;

class FruitSales{
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("사과장수가 갖고있는 사과 수 입력 : ");
	   int numOfApple = sc.nextInt();
	   System.out.print("사과의 가격 입력 : ");
	   int price = sc.nextInt();
      FruitSeller seller = new FruitSeller(numOfApple, price);
      System.out.print("손님의 돈 입력 : ");
      int money = sc.nextInt();
      FruitBuyer buyer = new FruitBuyer(money);
      
      int buy = sc.nextInt();
      buyer.buyApple(seller,buy*price);

      seller.showSaleResult();
      buyer.showSaleResult();
   }
}