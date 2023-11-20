package z26;


import java.util.Stack;

public class t1 {
    public static void invertArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        invertArray(arr);

        System.out.println("\nИнвертированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
