package z18;

import java.util.Scanner;


public class Try4 {
    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException was thrown");
        } catch (Exception e) {
            System.out.println("StringException was thrown");
        } finally {
            System.out.println("Program is over");
        }

    }
}
