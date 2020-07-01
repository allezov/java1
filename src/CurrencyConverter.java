import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара");
        double currentRate = in.nextDouble();
        System.out.println("Введите кол-во рублей для обмена");
        long rubForChange = in.nextLong();
        double countOfDollar = rubForChange/currentRate;
        String result = String.format("%.2f",countOfDollar);
        System.out.print("Итого после перевода "+ result + " Долларов");
    }
}
