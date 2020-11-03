
class FruitBuyer{
   int myMoney;
   int numOfApple;
   public FruitBuyer(int money) {
	   myMoney = money;
	   numOfApple = 0;
   }
   public void buyApple(FruitSeller seller, int money) {
      numOfApple += seller.saleApple(money);
      myMoney-=money;
   }
   public void showSaleResult() {
      System.out.println("���� ���:"+numOfApple);
      System.out.println("��:"+myMoney);
   }
}