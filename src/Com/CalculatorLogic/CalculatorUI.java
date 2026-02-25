package Com.CalculatorLogic;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CalculatorUI extends JFrame implements ActionListener {

	JTextField textField;
	double num1, num2;
	String operator;

	CalculatorLogic logic = new CalculatorLogic();

	public CalculatorUI() {

		setTitle("Calculator");
		setSize(400, 500);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 30));
		add(textField, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+" };

		for (String text : buttons) {
			JButton btn = new JButton(text);
			btn.setFont(new Font("Arial", Font.BOLD, 25));
			btn.addActionListener(this);
			panel.add(btn);
		}

		add(panel, BorderLayout.CENTER);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();

		if (command.matches("[0-9]")) {
			textField.setText(textField.getText() + command);
		} else if (command.equals("C")) {
			textField.setText("");
		} else if (command.equals("=")) {
			num2 = Double.parseDouble(textField.getText());
			double result = logic.calculate(num1, num2, operator);
			textField.setText(String.valueOf(result));
		} else {
			num1 = Double.parseDouble(textField.getText());
			operator = command;
			textField.setText("");
		}
	}

	public static void main(String[] args) {
		new CalculatorUI();
	}
}
