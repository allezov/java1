import java.util.Scanner;

public class stringComparsion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = in.nextLine();
        if (str1.length()>str2.length()){
            System.out.println(str1);
        }
        else if(str1.length()==str2.length()){
            System.out.println("Введенные строки одной длины");
        }
        else {
            System.out.println(str2);
        }
    }
}
