import javax.swing.JFrame;

public class DayCalculator {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Day calculator");
		f.setSize(400, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(new CalculatorPanel());
		
		f.setVisible(true);

	}

}
