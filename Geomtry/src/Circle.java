
public class Circle extends Geometry {
	protected int radius;
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void draw() {
		System.out.printf("원의 원점 : (%d, %d) 반지름: %d\n", x, y, radius);
	}

}
