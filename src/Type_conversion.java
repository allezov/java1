import java.util.Scanner;

public class Type_conversion {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        String S = in.nextLine();

        System.out.println(S+ ": Переменная S типа String");
        System.out.println(Integer.parseInt(S) + ": Переменная X типа int");
        System.out.println((double)Integer.parseInt(S) + ": Переменная Y типа double");

    }
}
