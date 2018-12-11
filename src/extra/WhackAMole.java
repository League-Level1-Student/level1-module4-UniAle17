package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	
	
	
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
			button.addActionListener(this);
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
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed.getText().equals("mole!")) {
			System.out.println("Nice job!");
			frame.dispose();
			drawButtons(18);
			frame.add(panel);
		}
		
		else {
			speak("Missed");
			
			frame.dispose();
			drawButtons(18);
			frame.add(panel);
		}
	}
		
	}


