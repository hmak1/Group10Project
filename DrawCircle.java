import java.awt.Graphics;
import javax.swing.JComponent;

public class DrawCircle extends JComponent {

	protected void paintComponent(Graphics g) {
		g.fillOval(30, 10, 90, 90);
	}
	
	private static final long serialVersionUID = 1L;
}
