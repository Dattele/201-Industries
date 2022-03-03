import java.awt.*;
import javax.swing.*;

public class JFrame_Page extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;
	
	
	public static void main(String[] args) {
		
		String[] artists = {"Eminem","Elvis Presley","Adele","Beyonce","Elton John","Bob Dylan"};
		
		JFrame frame = new JFrame("Artist Page");
		frame.setLayout(new GridLayout());
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		menuFile.add(menuItemExit);
		menuBar.add(menuFile);
		JList<?> a_list = new JList(artists);
		
		
		//Adding to frame section
		frame.setJMenuBar(menuBar);
		frame.add(a_list);
		frame.setVisible(true);
	}

}

