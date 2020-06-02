import java.util.Arrays;
import java.util.Scanner;

public class Array_input_output {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Укажите " + (i+1) + " элемент массива");
            arr[i] = in.nextInt()*2;
       }
        System.out.println(Arrays.toString(arr));
    }
}
