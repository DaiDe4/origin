import java.util.Random;
import java.util.Arrays;

public class taskik3 {
        public static void main(String[] args) {
            double[] array_1 = new double[10];
            for(int i = 0; i < array_1.length; ++i) {
                array_1[i] = Math.random() * 100;
            }
            System.out.println("Zad_1");
            System.out.println("Сортировка первым подходом");
            System.out.println(Arrays.toString(array_1));
            Arrays.sort(array_1);
            System.out.println(Arrays.toString(array_1));
            System.out.println("Сортировка вторым подходом");

            double[] array_2 = new double[10];
            Random random = new Random();
            for(int i = 0; i < array_2.length; ++i) {
                array_2[i] = random.nextDouble() * 100;
            }
            System.out.println(Arrays.toString(array_2));
            Arrays.sort(array_2);
            System.out.println(Arrays.toString(array_2));


            System.out.println("Zad_3");
            int[] array = new int[5];
            Random rand = new Random();
            for(int i = 0; i < array.length; ++i) {
                array[i] = rand.nextInt(90) + 10;
            }
            System.out.print(Arrays.toString(array));
            System.out.println();
            int k = 0;
            for(int i = 1; i < array.length; ++i) {
                if (array[i] <= array[i - 1]) {
                    k = 1;
                    System.out.println("Массив не является возрастающим");
                    break;
                }
            }
            if (k == 0)System.out.println("Массив является возрастающим");
        }
}
