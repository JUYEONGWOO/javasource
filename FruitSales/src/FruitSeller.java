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
        	  // �����Ǹ� �޼ҵ�  money! seller.saleApple(��κ�)
             int num = money/APPLE_PRICE; //
             numOfApple -=num;
             myMoney += money;
             return num;
          }
             public void showSaleResult() {
            System.out.println("���� ���:"+numOfApple);
            System.out.println("��:"+myMoney);
            
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
            System.out.println("���� ���:"+numOfApple);
            System.out.println("��:"+myMoney);
      }
      }
      class FruitSales{
         public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.print("���ϰ����� �Է��Ͻÿ�");
            int fruitSeller_Apple_Price= s.nextInt();
            System.out.print("��������� ���� �Է��Ͻÿ�");
            int fruitSeller_Money=s.nextInt();
            System.out.print("��������� �����ϰ��ִ� ����� ����");
            int fruitSeller_NumOfApple=s.nextInt();
            
        	 FruitSeller seller = new FruitSeller (fruitSeller_Apple_Price,fruitSeller_Money,fruitSeller_NumOfApple);
             System.out.print("�������� ���� �Է��Ͻÿ�");
             int fruitBuyer_Money=s.nextInt();
             System.out.print("�����ڰ� �����ϰ��ִ� ����� ����");
             int fruitBuyer_NumOfApple=s.nextInt();                   
        	 FruitBuyer buyer = new FruitBuyer(fruitBuyer_Money, fruitBuyer_NumOfApple);

             System.out.print("����� �󸶳�ġ �����Ͻðڽ���");
             int fruitBuyer_BuyApple=s.nextInt();
        	 buyer.buyApple(seller,fruitBuyer_BuyApple);
            System.out.println("�����Ǹ����� ���� ��Ȳ:");
            seller.showSaleResult();

            System.out.println("���ϱ������� ���� ��Ȳ:");
            buyer.showSaleResult();
         }
      


   }
   
   
   
   
   
   
   
   
   
   
   
   
   