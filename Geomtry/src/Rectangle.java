
public class Rectangle extends Geometry {
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.printf("사각형: (%d , %d)으로부터 가로 : %d , 세로 : %d \n", x, y, width, height);
	}

}
