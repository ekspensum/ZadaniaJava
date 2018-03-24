import java.io.*;
import java.util.Scanner;

public class ObslugaPliku {

    public static void main(String[] args) throws FileNotFoundException {
        String nazwaPliku = "plik.txt";
        File plik = new File(nazwaPliku);
        Scanner odczyt = new Scanner(plik);
        String linia;
        PrintWriter zapis = new PrintWriter(nazwaPliku);
        zapis.print("Ala ma kota \r\n");
        zapis.print("Ala ma pojazd\r\n");
        zapis.print("Kot ma pojazd\r\n");
        zapis.close();

        while (odczyt.hasNext()) {
            linia = odczyt.nextLine();
            System.out.println(linia);
        }

        FileOutputStream fos = null;
        String str = "Gory sa wysokie i szerokie.";

        try {
            fos = new FileOutputStream("plikFOS.txt"); //Otwieranie pliku
            for (int i = 0; i < str.length(); ++i) {
                fos.write((int) str.charAt(i)); //Zapis bajt po bajcie każdego znaku
            }
        } catch (IOException ex) {
            System.out.println("Błąd operacji na pliku: " + ex);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis = null;
        int bajt;
        try {
            fis = new FileInputStream("plikFOS.txt");
            bajt = fis.read();
            while (bajt != -1) { // -1 - określa koniec pliku
                System.out.print((char) bajt);
                System.out.println(bajt);
                bajt = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
