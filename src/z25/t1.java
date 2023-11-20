package z25;

import java.util.Arrays;
import java.util.Scanner;

public class t1 {

    public static class StringSplitter {
        public static void main(String[] args) {
            System.out.println("Введите строку:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("Введите паттерн:");
            String p = sc.nextLine();
            sc.close();
            System.out.println(Arrays.toString(str.split(p)));
        }
    }
}
