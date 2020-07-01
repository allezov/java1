import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите длину массива");
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Укажите " + (i+1) + " элемент массива");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
}
