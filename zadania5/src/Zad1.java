import java.io.*;
import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        File plik = new File("jakisPlik.txt");
        FileWriter zapis;
        Scanner odczyt;
        Scanner daneWe = new Scanner(System.in);

        System.out.println("Wprowadź linię tekstu:");
        String tekst = daneWe.nextLine();
        try {
            zapis = new FileWriter(plik, true);
            zapis.write(tekst + "\r\n");
            zapis.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            odczyt = new Scanner(plik);
            while (odczyt.hasNextLine())
                System.out.println(odczyt.nextLine());
            odczyt.close();

        } catch (FileNotFoundException fr) {
            System.out.println();
        } catch (IOException f) {
            System.out.println(f);
        }

    }
}
