import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spoofify extends JFrame {
	
	// ================================================================== Properties
	private JButton hello;
	
	// ================================================================== Constructors
	public Spoofify() {
		hello = new JButton("Hello");
		constructDisplay();
	}
	
	// ================================================================== Methods
	private void constructDisplay() {
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel temp = new JPanel();
		temp.add(hello);
		container.add(temp);
	}
	
	// ================================================================== Gett/Setters
	

	public static void main(String[] args) {
		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 700;
		Spoofify s = new Spoofify();
		s.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		s.setTitle("Spoofify");
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
		s.setVisible(true);

	}

}
