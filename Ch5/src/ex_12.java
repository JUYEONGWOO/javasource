import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ãâ»ı³âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		int year;
		year = sc.nextInt();
		
		switch(year%12) {
		case 1 :
			System.out.println("´ß¶ì"); 
			break;
		case 2 :
			System.out.println("°³¶ì"); 
			break;
		case 3 :
			System.out.println("µÅÁö¶ì"); 
			break;
		case 4 :
			System.out.println("Áã¶ì"); 
			break;
		case 5 :
			System.out.println("¼Ò¶ì"); 
			break;
		case 6 :
			System.out.println("È£¶ûÀÌ¶ì"); 
			break;
		case 7 :
			System.out.println("Åä³¢¶ì"); 
			break;
		case 8 :
			System.out.println("¿ë¶ì"); 
			break;
		case 9 :
			System.out.println("¹ì¶ì"); 
			break;
		case 10 :
			System.out.println("¸»¶ì"); 
			break;
		case 11 :
			System.out.println("¾ç¶ì"); 
			break;
		case 0 :
			System.out.println("¿ø¼şÀÌ¶ì"); 
			break;
		default :
			System.out.println("Àß¸øÀÔ·ÂÇÏ¿´½À´Ï´Ù.");
		}

	}

}
