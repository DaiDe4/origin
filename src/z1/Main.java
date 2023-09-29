package z1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int factorial(int f){
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        int j = 0;
        int i;
        int sum = 0;
        int sr_zn = 0;
        for(j = 0; j < 10;j++)
        {
            System.out.print("Введите_целое_число: ");
            if(sc.hasNextInt()) {
                i = sc.nextInt();
                b[j] = i;
                sum += i;
            }
        }
        sc.next();
        System.out.print("Среднее значение:");
        System.out.print(sum / 10);
        System.out.print('\n');

        ArrayList<Integer> list = new ArrayList<>();
        int l;
        int k = 1;
        int maxi = 0;
        int mini = 0;
        boolean Flag = true;
        System.out.print("Для заверщения работы напишите 'Y' ");
        while(Flag)
        {

            System.out.print("Введите_целое_число или Y: ");
            if(sc.hasNextInt()) {
                l = sc.nextInt();
                if (k == 1){
                    k = 0;
                    maxi = l;
                    mini = l;
                }
                list.add(l);
                maxi = Integer.max(l, maxi);
                mini = Integer.min(l, mini);
            }
            else{
                break;
            }
        }
        System.out.print("Минимальное значение:");
        System.out.print(mini);
        System.out.print("\n");
        System.out.print("Максимальное значение:");
        System.out.print(maxi);
        System.out.print("\n");

        for (i = 1; i < 11; i++) {
            System.out.print(1./i);
            System.out.print("\n");
        }

        for (int q = 0; q < args.length; q++) {
            System.out.println("Аргумент " + (q+1) + ": " + args[q]);
        }
        System.out.print("Введите_целое_число_для_подсчёта_факториала:\n");
        sc.next();
        l = sc.nextInt();
        System.out.print("Факториал:" + factorial(l));

    }

}
