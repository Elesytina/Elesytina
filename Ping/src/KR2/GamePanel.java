package KR2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {
    
	
	int ballX= (750/2)-(20/2);
	int ballY= (450/2)-(20/2);
	
	 int speed =5;
	 
	 int locateX=1;
	 int locateY=-1;
	 
	Timer timer ;
	
	public GamePanel() {
		init();
	}
	
	public void init() {
		timer = new Timer (1000/70, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		 g.setColor(Color.pink);
		 g.fillRect(0, 0, 750, 450);
		 
		 g.setColor(Color.black);
		 g.fillRect(ballX, ballY, 20, 20);
		 
	}
	
	public void updateBall() {
		ballX+=speed*locateX;
		ballY+=speed*locateY;
	}
	
	public void ballCollision() {
		if (ballX<=0) {
			locateX=1;
		}
		if (ballX>=750-20) {
			locateX=-1;
		}
		if (ballY<=0) {
			locateY=1;
		}
		if (ballY>=450-20) {
			locateY=-1;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ballCollision();
		updateBall();
		repaint();
		
	}
	
	


		
	}
	

