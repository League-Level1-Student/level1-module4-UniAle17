package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	ImageIcon image1;
	ImageIcon image2;
	ImageIcon image3;
	
	SlotMachine(){
		
	frame.add(panel);
	frame.setVisible(true);
		
	button.setText("SPIN");	
	button.addActionListener(this);	
	panel.add(button);
	
	panel.add(image1);
	panel.add(image2);
	panel.add(image3);
	
	frame.pack();
	
	try {
		image1 = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("cherries.jpeg")));
		image2 = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("lemon.jpeg")));
		image3 = new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("orange.jpg")));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
	SlotMachine s = new SlotMachine();
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
