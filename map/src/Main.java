
public class Main {
	public static void main(String[] args) {
	Map<Integer, String> m2 = new Map<Integer, String>(5);
	
	for(int i = 0; i < 5; i++) {
		m2.push(i, "value"+i);
		System.out.printf("%d , %s\n" , i, m2.get(i));
	}
}
}