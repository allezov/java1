import java.util.Scanner;

public class binaryToInt {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.println("Введи число в бинарном формате: ");
       String binaryNum = in.nextLine();
       int numer = Integer.parseInt(binaryNum,2);

       System.out.println(numer);

}
}
