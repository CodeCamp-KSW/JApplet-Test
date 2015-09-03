package triangleDrawer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Point extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4308090517393152868L;
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		// System.out.println("i do live");
	}

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 100, 100);
		// System.out.println("i've been painted at"+x+"/"+y);
	}
}
