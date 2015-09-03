package triangleDrawer;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Zeichnung extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6215221255886300987L;

	public void paintComponent(Graphics g) {

		// g.setColor(new
		// Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));

		for (Point p : GUI.pointList) {

			g.fillRect(p.x - 2, p.y - 2, 4, 4);
		}
		for (Triangle t : GUI.triangleList) {
			g.drawPolygon(new Polygon(t.getXCoords(), t.getYCoords(), 3));
			// System.out.println("triangle painted");
		}

	}

}
