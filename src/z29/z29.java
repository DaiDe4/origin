package z29;

import java.util.Scanner;

public class z29 {

    public static void main(String[] args) {
        int N = 5;
        int[][] roads = new int[N][N];
        for (int k = 0; k < N; k++) {
            for (int y = 0; y < N; y++) {
                roads[k][y] = 0;
            }
        }
        roads[0][1] = 1;
        roads[1][0] = 1;
        roads[2][0] = 1;
        roads[0][2] = 1;
        roads[3][1] = 1;
        roads[1][3] = 1;
        int sum = 0;
        int temp;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp = roads[i][j];
                sum += temp;
            }
        }
        System.out.println(sum / 2);
    }
}