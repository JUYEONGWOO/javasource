
public class Stack < T > implements IStack<T>{
	private T [] v;
	private int count;
	
	public Stack(int size) {
		v =  (T [])new Object[size];
		count = 0;
	
	
	}
	public void push(T o) {
		v[count++] = o;
	}
	
	public T pop() {
		return v[--count];
	}
	public int size() {
		return count;
	}
	
	@Override
	public boolean CompareSize(Stack<?> o) {
		return size() > o.size() ? true : false;
	}
	@Override
	public <T extends Comparable<T>> T max(T x, T y) {
		// TODO Auto-generated method stub
		return x.compareTo(y) > 0 ? x : y;
	}
	
	

}
