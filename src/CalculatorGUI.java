import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField inputField;
    String operator;
    double num1, num2, result;

    public CalculatorGUI() {
        setTitle("Calculatorr");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        inputField.setFont(new Font("Arial", Font.BOLD, 24));
        add(inputField, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
            inputField.setText(inputField.getText() + input);
        } else if (input.equals("C")) {
            inputField.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (input.equals("=")) {
            num2 = Double.parseDouble(inputField.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        inputField.setText("Error");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            inputField.setText(String.valueOf(result));
        } else {
            operator = input;
            num1 = Double.parseDouble(inputField.getText());
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
