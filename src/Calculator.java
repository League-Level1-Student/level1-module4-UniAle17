import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Calculator implements ActionListener{
	
	Calculator(){

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(10);	
		
		frame.add(panel);
		
		frame.setVisible(true);
		
		button1.setText("add");
		button2.setText("sub");
		button3.setText("mul");
		button4.setText("div");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		panel.add(field1);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.pack();
		
		frame.setTitle("Calculator");
	}
	
	
public static void main(String[] args) {
	
	Calculator one = new Calculator();
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
