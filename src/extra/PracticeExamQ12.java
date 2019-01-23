package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeExamQ12 implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JTextField field = new JTextField(10);
	
	
	
	PracticeExamQ12(){
	
	frame.add(panel);
	
	frame.setVisible(true);
	
	button1.setText("Hint");
	button2.setText("Submit");
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	label.setText("What is something green on the oustside and red on the inside?");
	
	
	panel.add(button1);
	panel.add(button2);
	panel.add(label);
	panel.add(field);
	

	
	frame.pack();	
		
	
	
	}
public static void main(String[] args) {

		
	PracticeExamQ12 run = new PracticeExamQ12();
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
		String answer = field.getText();
	
		if(e.getSource().equals(button1)) {
			
			JOptionPane.showMessageDialog(null, "HINT: Its a food");
		}
	
		
		
		if(e.getSource().equals(button2)) {
			
			if(answer.equals("watermelon")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				
			}
			else {
			JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
		}
		
		}
	
		
		
		
}
	
	
}
