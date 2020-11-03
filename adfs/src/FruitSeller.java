public class FruitSeller {
	int price;
    int myMoney;
    int numOfApple;
    public FruitSeller(int apple, int price) {
 	   myMoney = 0;
 	   numOfApple = apple;
 	   this.price = price;
    }
    public int saleApple(int money) {
       int num = money/price;
       numOfApple -=num;
       myMoney += money;
       return num;
    }
       public void showSaleResult() {
      System.out.println("³²Àº »ç°ú:"+numOfApple);
      System.out.println("µ·:"+myMoney);
      
   }
    }