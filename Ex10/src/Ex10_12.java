import java.io.File;
import java.util.Scanner;

public class Ex10_12 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\�ֿ���\\Desktop\\�������� ����\\data1.txt"));
		
		int total = 0; 
		
		while(sc.hasNextLine()) {
			total += sc.nextInt();
			
		}
		System.out.println(total);
		sc.close();
	}
}
