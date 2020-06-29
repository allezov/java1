import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FromScreentoFile {
    public static void main(String[] args) {
    String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода введите: \"stop\"");
        try(FileWriter fw = new FileWriter("test2.txt")) {
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
