import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class DrawArrow extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.drawLine(40, 20, 40, 50);
		g.drawLine(40, 50, 30, 50);
		g.drawLine(30, 50, 50, 80);
		g.drawLine(50, 80, 70, 50);
		g.drawLine(70, 50, 60, 50);
		g.drawLine(60, 50, 60, 20);
		g.drawLine(60, 20, 40, 20);
	}
	
	public interface Painter {
		public void paint(Graphics g);
	}
}
