package KR2;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MainWindow {
  
	JFrame frame = new JFrame("ping pong");
	public MainWindow() {
		frame.setSize(750, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.add(new GamePanel());
		frame.setVisible(true);
	}
}
