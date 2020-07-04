import java.util.Arrays;
import java.util.Scanner;

public class FromBinaryToDecimal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int[] myIntArray;
        String inputBinary;
        do {
            System.out.println("Введите бинарное число");
            inputBinary = in.nextLine();
            String[] arrayBinary = inputBinary.split("");
            myIntArray = Arrays.stream(arrayBinary).mapToInt(Integer::parseInt).toArray();
            for (int value : myIntArray) {
                if (value > 1 | value < 0) {
                    System.out.println("Введенное число не является бинарным");
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        } while (!flag);

        System.out.println("Введеное бинарное число " + inputBinary);

        int sum = 0;
        int count = 1;
            for (int i = myIntArray.length - 1; i >= 0; i--) {
                if (myIntArray[i] == 1) {
                    sum += count;
                }
                count *= 2;
            }
            System.out.println("Бинарное число в десятичном виде " + sum);
    }
    }


