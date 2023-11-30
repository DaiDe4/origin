package z24.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите действительную часть числа, затем комплексную: ");
        FullNumFactory number = new FullNumFactory(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        System.out.println("Число: " + number.getNum());
    }
}
