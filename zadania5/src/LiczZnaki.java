import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiczZnaki {

    public static void main(String[] args) {
        File f = new File("jakisPlik.txt");
        int tab[] = new int[4];
        String temp;
        Scanner fs, fs2, fs3, fs4, fs5;
        char [] znaki;
        Pattern wzorzec = Pattern.compile("^([a-zA-Z0-9]+\\s+){1} || (\\s+[a-zA-Z0-9]+\\s+)+ || (\\s+[a-zA-Z0-9]+)$");
        Matcher dopasuj;
        try {
            fs = new Scanner(f);
            fs2 = new Scanner(f);
            fs3 = new Scanner(f);
            fs4 = new Scanner(f);
            fs5 = new Scanner(f);
            while (fs.hasNextLine()) {
                tab[0]++;
                tab[1] += fs.nextLine().length();
                znaki = fs2.nextLine().toCharArray();
                for (int i=0; i<znaki.length; i++){
                    if (znaki[i] == ' ' || znaki[i] == '\t' || znaki[i] == '\n') tab[2]++;

                }
                dopasuj = wzorzec.matcher(fs5.nextLine());
                if (dopasuj.find()) tab[3] += dopasuj.groupCount();
//                System.out.println(dopasuj.groupCount());
//                if (fs3.nextLine().matches("^[a-zA-Z0-9]+\\s+(\\s+[a-zA-Z0-9]+\\s+)*\\s?[a-zA-Z0-9]+$")) tab[3]++;
//                System.out.println(fs4.nextLine().matches("^([a-zA-Z0-9]+\\s+){1} | (\\s+[a-zA-Z0-9]+\\s+)+ | (\\s+[a-zA-Z0-9]+)$"));
                System.out.println(fs3.nextLine());

            }

            fs.close();
            fs2.close();
            fs3.close();
            fs4.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
        System.out.println();
        System.out.println("Liczba linii: " + tab[0]);
        System.out.println("Liczba znaków: " + tab[1]);
        System.out.println("Liczba białych znaków: " + (tab[2]+tab[0]));
        System.out.println("Liczba słów: " + tab[3]);

    }
}