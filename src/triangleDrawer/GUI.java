package triangleDrawer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class GUI {

	public JPanel fläche;
	public ArrayList<Point> pointList=new ArrayList<Point>();
	public GUI(){
		
		JFrame jF=new JFrame("Test");
		jF.setSize(300,300);
		fläche = new JPanel();
		jF.add(fläche);
		jF.addMouseListener(new clickMouseListener());
		
		Thread painter = new Thread(new drawer());
		painter.start();
		
		jF.setVisible(true);
	}
	
	private class drawer implements Runnable{

		@Override
		public void run() {
			while(true){
				
				
				
			}
			
		}
		
	}
	
	private class clickMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			pointList.add(new Point(arg0.getX(),arg0.getY()));
			fläche.add(pointList.get(pointList.size()-1));
			
			
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
