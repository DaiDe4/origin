package z3;

import java.util.Scanner;

public class MainConv extends ConvValue {
    public static void main(String[] args) {
        System.out.println("Ведите сумму в рублях:");
        Scanner sc = new Scanner(System.in);
        double ruble;
        if (sc.hasNextInt()) {
            ruble = sc.nextDouble();
            ConvValue ien = new ConvValue();
            ien.setValue(ruble);
            System.out.println("Сумма в йенах:");
            ien.RublToIen();
        }
    }
}