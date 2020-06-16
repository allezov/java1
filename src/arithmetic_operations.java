import java.util.Scanner;

public class arithmetic_operations {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double num_x = in.nextInt();
        System.out.println("Введите число y: ");
        double num_y = in.nextInt();
        System.out.println("Введите число z: ");
        double num_z = in.nextInt();
        double averageNum = (num_x + num_y + num_z)/3;
        System.out.println("Среднее арифметическое трех чисел x,y,z = "+ averageNum);
        if (averageNum/2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
