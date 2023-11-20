package z29;

import java.util.Scanner;

public class z29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < n * n; i++) {
            temp = scanner.nextInt();
            sum += temp;
        }
        scanner.close();
        System.out.println(sum / 2);
    }
}