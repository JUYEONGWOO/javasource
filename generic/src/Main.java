
public class Main {

	public static void main(String[] args) {

		IStack<Integer> si = new Stack<Integer>(10);

		IStack<Integer> si2 = new Stack<Integer>(10);
		si2.push(10);
		si.push(30);
		si.push(300);
		si.push(3000);
		int size = si.size();
		for(int i = 0; i < size; i++) {

			System.out.println(si.pop());

		}
		System.out.println(si.size());
		IStack<Character> ci = new Stack<Character>(10);

		ci.push('a');
		ci.push('b');
		ci.push('c');
		int sizec = ci.size();
		for(int i = 0; i < sizec; i++) {

			System.out.println(ci.pop());

		}
		int a = si.max(100,200);
		System.out.println(a);
		IStack<Point> sp = new Stack<Point>(5);
		
		boolean b = si.CompareSize(sp);
		
	}

}
