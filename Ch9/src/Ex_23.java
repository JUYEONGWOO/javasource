import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		String str;
		String[] str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�");
		str = sc.nextLine();
		str2 = str.split("");
		for(int i = 0; i <str.length(); i++){
			System.out.print(str2[str.length()-1-i]);
			}
		
	}

}
