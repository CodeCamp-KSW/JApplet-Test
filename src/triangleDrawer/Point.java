package triangleDrawer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Point extends JPanel{
	

	int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("i live");
	}
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(20, 20, 100, 100);
	}
}
