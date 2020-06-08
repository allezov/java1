import java.util.Scanner;

public class spaceDelete {

    public static void main(String[] args){

        System.out.println("Введите любую строку: ");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(inputStr.replaceAll("\\s+",""));
        }
    }
