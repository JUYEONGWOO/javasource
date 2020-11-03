import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select,num=0;
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		select = s.nextInt();
		System.out.print("값 입력:");
		str = s.next();
		boolean b= true;
		if(select==1) {
			num = Integer.parseInt(str,10);
			}
		else if(select==2) {

			num = Integer.parseInt(str,16);
				
		}
		else if(select==3) {

			num = Integer.parseInt(str,8);
			}
		else {
			b = false;
		}
		if(b==true) {
		System.out.printf("10진수 ==> %d\n", num);
		System.out.printf("16진수 ==> %x\n", num);
		System.out.printf("8진수 ==> %o\n", num);
		}
		else
			System.out.print("jinsu가 틀렸습니다.");
		
		
	}

}
