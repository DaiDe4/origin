package z22;

import java.util.Stack;

public class CalculatorPolska {
    public static double rpncal(String expression) {
        String[] ts = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String t : ts) {
            if (isNumber(t)) {
                stack.push(Double.parseDouble(t));
            } else if (isOperator(t)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid RPN expression");
                }
                double o2 = stack.pop();
                double o1 = stack.pop();
                double res = performOperation(o1, o2, t);
                stack.push(res);
            } else {
                throw new IllegalArgumentException("Invalid token: " + t);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression");
        }

        return stack.pop();
    }

    private static boolean isNumber(String t) {
        try {
            Double.parseDouble(t);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String t) {
        return "+".equals(t) || "-".equals(t) || "*".equals(t) || "/".equals(t);
    }

    private static double performOperation(double o1, double o2, String o) {
        return switch (o) {
            case "+" -> o1 + o2;
            case "-" -> o1 - o2;
            case "*" -> o1 * o2;
            case "/" -> {
                if (o2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield o1 / o2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + o);
        };
    }

    public static void main(String[] args) {
        String prim = "8 2 * 3 + ";
        double result = rpncal(prim);
        System.out.println("Result: " + result);
    }
}