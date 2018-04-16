import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zad6 {

    String plikKobiety = "kobiety.txt";
    String plikMezczyzni = "mezszczyzni.txt";
    String linia;
    String [] slowa;
    Integer eK, eM;


    public void emerytura(String nazwaPliku)throws IOException {
        File plik = new File(nazwaPliku);
        Scanner we = new Scanner(plik);
        FileWriter fwK = new FileWriter(plikKobiety);
        FileWriter fwM = new FileWriter(plikMezczyzni);
        while (we.hasNextLine()){
            linia = we.nextLine();
            slowa = linia.split("\\s");
            if(slowa[2].equals("K")){
                eK = 60 - Integer.valueOf(slowa[3]);
                fwK.write(slowa[1]+" "+slowa[0]+" "+eK.toString()+"\r\n");
            }
            if(slowa[2].equals("M")){
                eM = 65 - Integer.valueOf(slowa[3]);
                fwM.write(slowa[1]+" "+slowa[0]+" "+eM.toString()+"\r\n");
            }
        }
        we.close();
        fwK.close();
        fwM.close();
    }

    public static void main(String[] args) throws IOException {
        String nazwaPliku = "pracownicy.txt";
        Zad6 z6 = new Zad6();
        z6.emerytura(nazwaPliku);

    }
}
