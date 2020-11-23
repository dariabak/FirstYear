
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel implements ActionListener {

	JButton getDay;

	JTextField day;
	JTextField month;
	JTextField year;

	JLabel dayLabel;
	JLabel monthLabel;
	JLabel yearLabel;
	JLabel answer;

	CalculatorPanel() {
		day = new JTextField(2);
		month = new JTextField(2);
		year = new JTextField(4);


		getDay = new JButton("Get day");

		getDay.addActionListener(this);

		dayLabel = new JLabel("Day");
		monthLabel = new JLabel("Month");
		yearLabel = new JLabel("Year");
		answer = new JLabel("");

		add(day);
		add(dayLabel);
		add(month);
		add(monthLabel);
		add(year);
		add(yearLabel);
		add(getDay);
		add(answer);
	}

	void Calculation() {
		try {
			int val1 = Integer.parseInt( day.getText() ); 
			int val2 = Integer.parseInt( month.getText() );
			int val3 = Integer.parseInt( year.getText() );

			String dayName = ""; 
			if (Doomsday.ValidDate(val1, val2, val3) == true) {

			switch (Doomsday.GetDayOfWeek(val1, val2, val3)) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 0:
				dayName = "Sunday";
			}
			
			answer.setText(val1 + "/" + val2 + "/" + val3 + " is a " + dayName);
		
			} else {
				answer.setText(val1 + "/" + val2 + "/" + val3 + " is not a valid date");
			}
			
		} catch (Exception e) {
			answer.setText("Invalid input");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getDay) {

			Calculation();


		}
	}
}

