import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
		
		
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(10);
	
	
		
	Calculator(){

			
		
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
	
	


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String one = field1.getText();
	String two =field2.getText();
	
	int a= Integer.parseInt(one);
	
	int b= Integer.parseInt(two);
	
	
	if(e.getSource()==button1) {
		
	
	int total= a+b;
	
	JOptionPane.showMessageDialog(null, "Total= " + total);
	
	}
	
	if(e.getSource()==button2) {
	
	int total= a-b;
	
	JOptionPane.showMessageDialog(null, "Total=" + total );
	}
	
	if(e.getSource()==button3) {
	
		int total=a*b;
		
		JOptionPane.showMessageDialog(null, "Total= " + total);
	}
	
	if(e.getSource()==button4) {
		
		int total= a/b;
		
		JOptionPane.showMessageDialog(null, "Total= " + total);
	}
	
}
}
