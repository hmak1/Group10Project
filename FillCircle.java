import java.awt.Graphics;

import javax.swing.JComponent;

public class FillCircle extends JComponent {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics k) {
		k.fillOval(20, 20, 80, 80);
	}
	
	public interface Painter {
		public void paint(Graphics g);
	}
	
}
