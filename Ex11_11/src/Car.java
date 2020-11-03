
public class Car {
	static private int count = 0;
	
	Car() {
		count++;
	}
	
	static int getCount() {
		return count;
	}
}
