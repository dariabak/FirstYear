package week19;

import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Calculator");
		f.setSize(400, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(new CalculatorPanel());
		
		f.setVisible(true);
	}

}
