
public class Main {

	public static void main(String[] args) {
		
		Node one = new Node(20,30);
		Node two = new Node(10,20);
		
		Node result = one.getCenter(two);
		
		System.out.println("x: "+ result.getX() + "y:"  + result.getY());
	
	}

}
