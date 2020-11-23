package week19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel implements ActionListener {

	JButton buttonTimes;
	JButton buttonPlus;
	JButton buttonDivide;
	JButton buttonMinus;
	
	JTextField input1;
	JTextField input2;
	
	JLabel answer;
	
	CalculatorPanel() {
		input1 = new JTextField(8);
		input2 = new JTextField(8);
		
		buttonTimes = new JButton("*");
		buttonPlus = new JButton("+");
		buttonDivide = new JButton("/");
		buttonMinus = new JButton("-");
		
		buttonTimes.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonMinus.addActionListener(this);
		
	
		answer = new JLabel("Answer");
		
		add(input1);
		add(input2);
		add(buttonTimes);
		add(buttonPlus);
		add(buttonDivide);
		add(buttonMinus);
		add(answer);
	}
	
	
	enum Operation {
		TIMES, PLUS, DIVIDE, MINUS;
	}
	
	void Calculation(Operation op) {
		try
		{
		
		// get the operands
		float val1 = Float.parseFloat( input1.getText() ); 
		float val2 = Float.parseFloat( input2.getText() );
		float result = 0;
		
		switch(op)
		{
		case PLUS:
			result = val1 + val2;
			break;
			
		case TIMES:
			result = val1 * val2;
			break;
			
		case DIVIDE:
			result = val1/val2;
			break;
			
		case MINUS:
			result = val1 - val2;
			break;
		
		}
		
		answer.setText( "Answer: " + result);
		
		} catch (Exception e) {
			answer.setText("invalid input");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonTimes) {
			Calculation(Operation.TIMES);
		} else if (e.getSource() == buttonPlus) {
			Calculation(Operation.PLUS);
		} else if (e.getSource() == buttonMinus) {
			Calculation(Operation.MINUS);
		} else if (e.getSource() == buttonDivide) {
			Calculation(Operation.DIVIDE);
		}
		
	}

	
}
