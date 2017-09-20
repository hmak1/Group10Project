import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class DrawCircle extends JComponent {

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(20, 20, 80, 80);
	}
	/*
	public interface Painter {
		public void paint(Graphics g);
	}*/
		
	private static final long serialVersionUID = 1L;
}
