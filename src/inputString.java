import java.util.Scanner;

public class inputString {
    public static void main(String[] args){
        System.out.println("Введите любую строку: ");
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        System.out.println(inStr);
    }
}
