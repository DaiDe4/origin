import java.util.Scanner;
public class Main {
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
            System.out.print("Введитецелоечисло: ");
            if(sc.hasNextInt()) {
                i = sc.nextInt();
                b[j] = i;
                sum += i;
            }
        }
        System.out.print("Среднее значение:");
        System.out.print(sum / 10);
        System.out.print('\n');

        Scanner scr = new Scanner(System.in);
        int[] bi = new int[10];
        int k = 0;
        int l;
        int maxi = -101011;
        int mini = 101001;
        while(k < 10)
        {
            System.out.print("Введитецелоечисло: ");
            if(sc.hasNextInt()) {
                l = sc.nextInt();
                bi[k] = l;
                maxi = Integer.max(l, maxi);
                mini = Integer.min(l, mini);
                k++;
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
    }
}