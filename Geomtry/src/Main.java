
public class Main {

	public static void main(String[] args) {
		Triangle t = new Triangle(1, 2, 3, 4, 5, 6);
		Rectangle r = new Rectangle(10, 20, 30, 40);
		Circle c = new Circle(100, 200, 300);
		
		Geometry [] geos = new Geometry[3];
		
		geos[0] = t;
		geos[1] = r;
		geos[2] = c;
		// Geometry g = new Geometry(1,2);
		//g.drwa();
	for( Geometry g : geos)
		g.draw();
	
	}
	
}
