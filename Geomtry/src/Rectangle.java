
public class Rectangle extends Geometry {
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.printf("�簢��: (%d , %d)���κ��� ���� : %d , ���� : %d \n", x, y, width, height);
	}

}
