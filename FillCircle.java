import java.awt.Graphics;
import javax.swing.JComponent;

public class FillCircle extends JComponent {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics k) {
		k.fillOval(30, 10, 90, 90);
	}	
}
