import java.util.Scanner;

class FruitSales{
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("�������� �����ִ� ��� �� �Է� : ");
	   int numOfApple = sc.nextInt();
	   System.out.print("����� ���� �Է� : ");
	   int price = sc.nextInt();
      FruitSeller seller = new FruitSeller(numOfApple, price);
      System.out.print("�մ��� �� �Է� : ");
      int money = sc.nextInt();
      FruitBuyer buyer = new FruitBuyer(money);
      
      int buy = sc.nextInt();
      buyer.buyApple(seller,buy*price);

      seller.showSaleResult();
      buyer.showSaleResult();
   }
}