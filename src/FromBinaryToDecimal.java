import java.util.Arrays;
import java.util.Scanner;

public class FromBinaryToDecimal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите длину бинарного числа");
        int arrSize = in.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Укажите " + (i + 1) + " бит бинарного числа");
            arr[i]=in.nextInt();
         if (arr[i] > 1 | arr[i] < 0){
             System.out.println("Введите либо 1 либо 0");
             i--;
         }
        }
        System.out.println("Введеное бинарное число "+Arrays.toString(arr));
        int sum = 0;
        int count = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 1) {
                    sum += count;
                }
                count *= 2;
            }
            System.out.println("Бинарное число в десятичном виде " + sum);
        }
    }

