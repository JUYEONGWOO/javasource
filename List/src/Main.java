import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("Three");
		
		for(int i = 0; i < 10; i++) {
			list.add("List"+i);
		}
		
		list.get(2);
		
		list.remove(0);
		list.remove("two");
		
		for(String s: list) {
			System.out.println(s);
		}
		int size = list.size();
		String[] arl = new String[list.size()];
		arl = list.toArray(arl);
		for(String s: arl) {
			System.out.println(s);
		}
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		

	}
}
