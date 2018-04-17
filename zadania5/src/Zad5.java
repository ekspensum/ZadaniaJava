import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad5 {


    public void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {
        File plikWe = new File(nazwaPlikWe);
        FileWriter plikWy = new FileWriter(nazwaPlikWy, true);
        Scanner we = new Scanner(plikWe);
        String linia;
        try {
            for (Integer i = 1; we.hasNextLine(); i++) {
                linia = we.nextLine();
                if (linia.matches(".*"+slowo+".*")){
                    plikWy.write(i.toString() + ": " + linia + "\r\n");
                    System.out.println(i.toString() + ": " + linia);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            we.close();
            plikWy.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String nazwaPlikWe = "nazwaPlikWe.txt";
        String nazwaPlikWy = "nazwaPlikWy.txt";
        Zad5 z5 = new Zad5();
        z5.szukaj(nazwaPlikWe, nazwaPlikWy, "egzamin");


    }
}
