package z18;

import java.util.Scanner;

public class Try4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException was thrown");
        }
        catch (Exception e){
            System.out.println("StringException was thrown");
        }
        finally {
            myScanner.close();
            System.out.println("Program is over");
        }

    }
}
