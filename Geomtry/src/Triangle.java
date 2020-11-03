
public class Triangle extends Geometry{
	protected int x2;
	protected int y2;
	protected int x3;
	protected int y3;
	public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	
	}
	
	public void draw() {
		System.out.printf("»ï°¢Çü : (%d,%d) ,(%d,%d) ,(%d,%d)\n", x, y, x2, y2, x3, y3);
	}

}
