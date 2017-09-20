import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class FillCircle extends JComponent {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics k) {
		k.fillOval(10, 10, 100, 100);
	}
	
}
