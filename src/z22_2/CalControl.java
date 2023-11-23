package z22_2;

import java.awt.event.*;
import java.math.BigDecimal;

public class CalControl {
    private final CalModel model;
    private final CalView view;
    private String currentInput;
    private boolean newInput;

    public CalControl(CalModel model, CalView view) {
        this.model = model;
        this.view = view;
        currentInput = "";
        newInput = true;
        bindListeners();
    }

    private void bindListeners() {
        for (int i = 0; i < 10; i++) {
            final int digit = i;
            view.addDigitButtonListener(i, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (newInput) {
                        currentInput = "";
                        newInput = false;
                    }
                    currentInput += digit;
                    view.updateDisplay(currentInput);
                }
            });
        }

        for (int i = 0; i < 4; i++) {
            final int operatorIndex = i;
            view.addOperatorButtonListener(i, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!currentInput.isEmpty()) {
                        model.set1Operand(new BigDecimal(currentInput));
                        model.setOperator(view.getOperatorText(operatorIndex));
                        currentInput = "";
                        newInput = true;
                    }
                }
            });
        }

        view.addEqualsButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentInput.isEmpty()) {
                    model.set2Operand(new BigDecimal(currentInput));
                    BigDecimal result = model.calculate();
                    if (result != null) {
                        view.updateDisplay(result.toString());
                    } else {
                        view.updateDisplay("Error");
                    }
                    assert result != null;
                    currentInput = result.toString();
                    newInput = true;
                }
            }
        });

        view.addDecimalButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newInput) {
                    currentInput = "0";
                    newInput = false;
                }
                if (!currentInput.contains(view.getDecimalText())) {
                    currentInput += view.getDecimalText();
                    view.updateDisplay(currentInput);
                }
            }
        });
    }
}

