package extra;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	WhackAMole() {
		frame.add(panel);
		frame.setVisible(true);

		frame.setSize(200, 200);
		frame.setTitle("Whack A Button For Fame And Glory");

		

	}
	void drawButtons(int randomNum) {
		for (int i = 0; i <24; i++) {

			JButton button = new JButton();
			
			if(i==randomNum) {
				button.setText("mole!");
			}
			
			panel.add(button);
			
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.drawButtons(18);
	}
	}


