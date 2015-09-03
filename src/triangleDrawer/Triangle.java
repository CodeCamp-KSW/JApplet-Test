package triangleDrawer;

import java.util.ArrayList;

public class Triangle {
	public Point x, y, z;
	public ArrayList<Point> pointList = new ArrayList<Point>();

	Triangle(Point x, Point y, Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
		pointList.add(x);
		pointList.add(y);
		pointList.add(z);

	}

	public int[] getCoordsofPoint(int i) {
		int[] result = new int[2];
		result[0] = pointList.get(i - 1).x;
		result[1] = pointList.get(i - 1).y;
		return result;
	}

	public int[] getXCoords() {
		int[] result = new int[3];
		result[0] = pointList.get(0).x;
		result[1] = pointList.get(1).x;
		result[2] = pointList.get(2).x;
		return result;
	}

	public int[] getYCoords() {
		int[] result = new int[3];
		result[0] = pointList.get(0).y;
		result[1] = pointList.get(1).y;
		result[2] = pointList.get(2).y;
		return result;
	}

}
