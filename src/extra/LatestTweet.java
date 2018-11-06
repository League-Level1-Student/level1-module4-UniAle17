package extra;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JTextField field= new JTextField();
	
LatestTweet(){
	frame.add(panel);
	frame.setVisible(true);
	
	button1.setText("Search the Twitterverse");
	
	panel.add(button1);
	
	frame.pack();
	frame.setTitle("The Amazing Tweet Retriever");
	
}
}
