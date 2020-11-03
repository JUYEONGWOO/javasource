
public class Map<T extends Number, V> {

	private T[] key;
	private V[] value;
	private int count;
	public Map(int size) {
		key = (T [])new Number[size];
		value = (V [])new Object[size];
		count = 0;
	}
	
	public void push(T key, V value) {
		this.key[count] = key;
		this.value[count] = value;
		count++;
	}
	public V get(T key) {
		for(int i = 0; i < count; i++) {
			if(this.key[i].equals(key)) {
				return value[i];
			}
		}
		return null;
	}
	public int size() {
		return count;
	}
	
	
}
