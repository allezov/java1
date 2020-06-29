import java.io.*;
import java.util.Scanner;

public class Overwriting {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test2.txt" );
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода введите: \"stop\"");
        try(FileWriter fw = new FileWriter("test2.txt", false)) {
            do {
                System.out.println("Введите текст для записи в файл: ");
                str = br.readLine();
                if (str.compareTo("stop") == 0){
                    break;
                }
                str = str + "\n";
                fw.write(str);

            } while (str.compareTo("stop") !=0);


        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
