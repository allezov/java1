import java.util.Scanner;

public class Output_condition {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную number: ");
        int number = in.nextInt();
        switch (number){
            case 73:  // Константа Х
            case 140: // Константа Y
            case 15:  // Константа Z
                System.out.println("Данное значение имеется в константах");
                break;
            default: System.out.println("Такой константы нет");
                break;
        }


    }
}
