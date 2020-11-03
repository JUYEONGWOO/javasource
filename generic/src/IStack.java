
public interface IStack <T>{
	void push(T o);
	T pop();
	int size();
	<T extends Comparable<T>> T max(T x, T y);
	boolean CompareSize(Stack<?> o);
}
