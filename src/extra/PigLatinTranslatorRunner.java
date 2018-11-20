package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner implements ActionListener {


	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(10);
	JTextField text = new JTextField(10);
	
	PigLatinTranslator a = new PigLatinTranslator();
	
	PigLatinTranslatorRunner(){
	
		frame.add(panel);
		frame.setVisible(true);
		
		panel.add(field);
		field.setVisible(true);
;
		
		button.setText("Translate");
		button.addActionListener(this);
		panel.add(button);
		
		panel.add(text);
		text.setVisible(true);
		
		frame.pack();
		frame.setTitle("Pig Latin Translator");

}

public static void main(String[] args) {
	
	PigLatinTranslatorRunner pltr = new PigLatinTranslatorRunner();
	
}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String input = field.getText();
		
		String translation = a.translate(input);
		
		text.setText(translation);
		}


}
