package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	Random r = new Random();
	
	int counter= 0;
	int score=0;
	
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
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		counter=counter+1;
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(buttonPressed.getText().equals("mole!")) {
			System.out.println("Nice job!");
			playSound("ding.wav");
			score=score+1;
			panel.removeAll();
			drawButtons(r.nextInt(24));
			frame.pack();
		}
		
		else {
			speak("Missed");
			
			panel.removeAll();
			drawButtons(r.nextInt(24));
					frame.pack();
		}
		if(counter==10) {
			
			
			JOptionPane.showMessageDialog(null, "Your score is: "+score);
			
			
			System.exit(0);
			
			
			
		}
	}
		
	}


