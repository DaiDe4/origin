package z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        System.out.println("Zad_4");
        int n = 0;
        boolean k = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число большее 0:");
        while (k) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Попросил же больше нуля, введите заново.");
                } else {
                    k = false;
                }
            }
        }
        sc.close();
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = rand.nextInt(n);
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; ++i){
            if(array[i] % 2 == 0){
                list.add(array[i]);
            }
        }
        System.out.print(list);
        System.out.println();
    }
}
