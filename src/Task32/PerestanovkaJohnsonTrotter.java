package Task32;

import java.util.Scanner;

public class PerestanovkaJohnsonTrotter {
    public static int maxk(int n, int[] array, boolean[] f) {
        int k = -1, max = 0;
        for(int i = 0; i < n; i++) {
            if(!f[i]) {
                if(i > 0 && array[i] > array[i - 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
            else {
                if(i < n - 1 && array[i] >array[i + 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
        }
        return k;
    }
    public static int[] swap2(int[] array, boolean[] f, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        boolean temp1 = f[i];
        f[i] = f[j];
        f[j] = temp1;
        return array;
    }
    public static boolean[] reverseid(int[] array, int k, boolean[] f) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] > array[k]) {
                f[i] = !f[i];
            }
        }
        return f;
    }

    public static void perestanovka(int n) {
        boolean[] flag = new boolean[n];
        int[] idata = new int[n];
        int k;
        for(int i = 0; i < n; i++) {
            idata[i] = i + 1;
            flag[i] = false;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(idata[i]);
            System.out.print(flag[i]);
        }
        System.out.println();
        k = maxk(n, idata, flag);
        while(k != -1) {
            if(flag[k]) {
                swap2(idata, flag, k, k + 1);
                k++;
            }
            else {
                swap2(idata, flag, k, k - 1);
                k--;
            }
            reverseid(idata, k, flag);
            for(int i = 0; i < n; i++) {
                System.out.print(idata[i]);
                System.out.print(flag[i]);
            }
            System.out.println();
                         k = maxk (n, idata, flag);
        }
    }

    public static void main(String[] args) {
        System.out.print("Please put in n :");
        try (Scanner sc = new Scanner(System.in)) {
                 int n = sc.nextInt ();
            perestanovka(n);
        }
    }
}
