import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex10_9 {

	public static void main(String[] args) throws Exception {
		
		
			FileInputStream fis = new FileInputStream("C:\\Users\\�ֿ���\\Desktop\\�������� ����\\data1.txt");
		
	
	
		int ch;
		
		while((ch = fis.read()) != -1 )
			System.out.print((char)ch);
		
		fis.close();
	}
}
