import java.io.*;
import java.util.Scanner;

public class FromFileToScreen {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("postok.txt" );
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}


