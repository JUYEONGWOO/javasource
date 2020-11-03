
public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			if(x <= o.x && y < o.y) return -1;
			if(x == o.x && y == o.y) return 0;
			return 1;
	}

}
