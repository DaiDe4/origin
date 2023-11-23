package z22_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalView {
    private final JTextField display;
    private final JButton[] digitButtons;
    private final JButton[] operatorButtons;
    private final JButton decimalButton;
    private final JButton equalsButton;

    public CalView() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        decimalButton = new JButton(".");

        equalsButton = new JButton("=");

        buttonPanel.add(digitButtons[7]);
        buttonPanel.add(digitButtons[8]);
        buttonPanel.add(digitButtons[9]);
        buttonPanel.add(operatorButtons[3]);
        buttonPanel.add(digitButtons[4]);
        buttonPanel.add(digitButtons[5]);
        buttonPanel.add(digitButtons[6]);
        buttonPanel.add(operatorButtons[2]);
        buttonPanel.add(digitButtons[1]);
        buttonPanel.add(digitButtons[2]);
        buttonPanel.add(digitButtons[3]);
        buttonPanel.add(operatorButtons[1]);
        buttonPanel.add(digitButtons[0]);
        buttonPanel.add(decimalButton);
        buttonPanel.add(operatorButtons[0]);
        buttonPanel.add(equalsButton);

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void addDigitButtonListener(int digit, ActionListener listener) {
        digitButtons[digit].addActionListener(listener);
    }

    public void addOperatorButtonListener(int operatorIndex, ActionListener listener) {
        operatorButtons[operatorIndex].addActionListener(listener);
    }

    public void addEqualsButtonListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public void addDecimalButtonListener(ActionListener listener) {
        decimalButton.addActionListener(listener);
    }

    public void updateDisplay(String text) {
        display.setText(text);
    }

    public String getOperatorText(int operatorIndex) {
        return switch (operatorIndex) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            case 3 -> "/";
            default -> "";
        };
    }

    public String getDecimalText() {
        return ".";
    }
}


