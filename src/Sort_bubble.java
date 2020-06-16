import java.util.Arrays;
import java.util.Scanner;

public class Sort_bubble {
    public static void  main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите "+ i + " значение массива");
            arr[i] = in.nextInt();
        }
        int bufer;
        for (int i = 0; i < arr.length - 1;i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    bufer = arr[j];
                    arr[j]=arr[j + 1];
                    arr[j + 1] = bufer;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
