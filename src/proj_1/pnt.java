package proj_1;

public class pnt {

	public static void main(String[] args) {
		Point point1 = new Point(x:1, y:1);
		Point point2 = point1;
		point1.x=2;
		
		System.out.println(point2);

	}

}
