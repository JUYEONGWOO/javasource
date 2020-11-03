
public class Ex08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = {100, 200, 300, 400};
		int [] bb = {100, 200, 300};
		int [] cc = {100, 200};
		int [] dd = {100};
		
		for(int i = 0; i < aa.length; i++)
			System.out.printf("aa[%d] = %d\t", i, aa[i]);
		
		System.out.println();
		for(int i = 0; i < bb.length; i++)
			System.out.printf("bb[%d] = %d\t", i, aa[i]);
		
		System.out.println();
		for(int i = 0; i < cc.length; i++)
			System.out.printf("cc[%d] = %d\t", i, aa[i]);
		
		System.out.println();
		for(int i = 0; i < dd.length; i++)
			System.out.printf("dd[%d] = %d\t", i, aa[i]);
		
		System.out.println();
		
	}

}
