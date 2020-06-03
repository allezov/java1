import java.util.Arrays;
import java.util.Scanner;

public class Array_input_output_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите количество строк в массиве");
        int arr_1_Size = in.nextInt();
        System.out.println("Укажите количество столбцов в массиве");
        int arr_2_Size = in.nextInt();
        int[][] arr = new int[arr_1_Size][arr_2_Size];
        for (int i = 0; i < arr_1_Size; i++) {
            for (int j = 0; j < arr_2_Size; j++) {
                System.out.println("Введите элемент " + (i + 1) + " строки " + (j + 1) + " столбца");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Введенный массив: " + Arrays.deepToString(arr));
        int[] arrResult = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            int a = arr[0][i];
            arrResult[i] = a * 3;
        }
        System.out.println("Первая строка матрицы * 3: " + Arrays.toString(arrResult));
    }
 }


