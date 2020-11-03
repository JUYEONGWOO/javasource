
public class Ex08_05 {

	public static void main(String[] args) {
		int[] aa = new int[100];
		int bb[] = new int[100];
		
		for(int i = 0; i < aa.length; i++)
			aa[i] = i*2;
		
		for(int i = 0; i < bb.length; i++)
			bb[i] = aa[aa.length-1-i];
		System.out.printf("b[0]은 %d, bb[99]는 %d 가 입력됩\n", bb[0], bb[99]);
	}
	

}
