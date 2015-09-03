package triangleDrawer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6306105342187769632L;
	public JPanel fläche;
	public JFrame jF;
	public static ArrayList<Point> pointList = new ArrayList<Point>();
	public static ArrayList<Triangle> triangleList = new ArrayList<Triangle>();

	public GUI() {

		jF = new JFrame("Test");
		jF.setSize(300, 300);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fläche = new Zeichnung();
		fläche.setLayout(null);
		jF.setContentPane(fläche);
		fläche.addMouseListener(new clickMouseListener());
		

		Thread painter = new Thread(new drawer());
		painter.start();

		jF.setVisible(true);
	}

	private class drawer implements Runnable {

		@Override
		public void run() {
			while (true) {
				fläche.repaint();
				// System.out.println(pointList.size()+" "+triangleList.size());
				if (pointList.size() % 3 == 0 && pointList.size() / 3 == triangleList.size() + 1) {
					triangleList.add(new Triangle(pointList.get(pointList.size() - 1),
							pointList.get(pointList.size() - 2), pointList.get(pointList.size() - 3)));
					// System.out.println("triangle added to list");
				}

			}

		}

	}

	private class clickMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			Point p = new Point(arg0.getX(), arg0.getY());
			// System.out.println(arg0.getX()+" "+arg0.getY());
			// fläche.add(p);

			pointList.add(p);
			// fläche.repaint();
			// p.setPreferredSize(new Dimension(10,10));
			// jF.repaint();
			// jF.setVisible(true);

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
}
