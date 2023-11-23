package z22_2;


import java.math.BigDecimal;


public class CalModel {
    private BigDecimal f1Operand;
    private BigDecimal s2Operand;
    private String operator;

    public void set1Operand(BigDecimal firstOperand) {
        this.f1Operand = firstOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void set2Operand(BigDecimal secondOperand) {
        this.s2Operand = secondOperand;
    }

    public BigDecimal calculate() {
        if (operator == null || f1Operand == null || s2Operand == null) {
            return null;
        }

        return switch (operator) {
            case "+" -> f1Operand.add(s2Operand);
            case "-" -> f1Operand.subtract(s2Operand);
            case "*" -> f1Operand.multiply(s2Operand);
            case "/" -> {
                if (s2Operand.equals(BigDecimal.ZERO)) {
                    yield null;
                }
                yield f1Operand.divide(s2Operand, 10, BigDecimal.ROUND_HALF_UP);
            }
            default -> null;
        };
    }
}

