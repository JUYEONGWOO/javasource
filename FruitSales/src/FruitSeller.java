import java.util.Scanner;

class FruitSeller {
          
          int APPLE_PRICE;
          int myMoney;
          int numOfApple;
          
          public FruitSeller(int aP,int mM, int nOA) {
               APPLE_PRICE=aP;
               myMoney=mM;
               numOfApple=nOA;

          }
          
          public int saleApple(int money) {
        	  // 과일판매 메소드  money! seller.saleApple(요부분)
             int num = money/APPLE_PRICE; //
             numOfApple -=num;
             myMoney += money;
             return num;
          }
             public void showSaleResult() {
            System.out.println("남은 사과:"+numOfApple);
            System.out.println("돈:"+myMoney);
            
         }
          }
      class FruitBuyer{
         int myMoney;
         int numOfApple;
    
         public FruitBuyer(int mM,int nOA) {
        	 myMoney=mM;
        	 numOfApple=nOA;
         }
         public void buyApple(FruitSeller seller, int money) {
            numOfApple += seller.saleApple(money);
            myMoney-=money;
         }
         public void showSaleResult() {
            System.out.println("남은 사과:"+numOfApple);
            System.out.println("돈:"+myMoney);
      }
      }
      class FruitSales{
         public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.print("과일가격을 입력하시오");
            int fruitSeller_Apple_Price= s.nextInt();
            System.out.print("과일장수의 돈을 입력하시오");
            int fruitSeller_Money=s.nextInt();
            System.out.print("과일장수가 보유하고있는 사과의 개수");
            int fruitSeller_NumOfApple=s.nextInt();
            
        	 FruitSeller seller = new FruitSeller (fruitSeller_Apple_Price,fruitSeller_Money,fruitSeller_NumOfApple);
             System.out.print("구매자의 돈을 입력하시오");
             int fruitBuyer_Money=s.nextInt();
             System.out.print("구매자가 보유하고있는 사과의 개수");
             int fruitBuyer_NumOfApple=s.nextInt();                   
        	 FruitBuyer buyer = new FruitBuyer(fruitBuyer_Money, fruitBuyer_NumOfApple);

             System.out.print("사과를 얼마너치 구매하시겠습까");
             int fruitBuyer_BuyApple=s.nextInt();
        	 buyer.buyApple(seller,fruitBuyer_BuyApple);
            System.out.println("과일판매자의 현재 상황:");
            seller.showSaleResult();

            System.out.println("과일구매자의 현재 상황:");
            buyer.showSaleResult();
         }
      


   }
   
   
   
   
   
   
   
   
   
   
   
   
   