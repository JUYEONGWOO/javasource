
public class Circle extends Geometry {
	protected int radius;
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void draw() {
		System.out.printf("���� ���� : (%d, %d) ������: %d\n", x, y, radius);
	}

}
