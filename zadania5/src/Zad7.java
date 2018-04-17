import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zad7 {
    String linia;
    String[] tab;
    FileReader fileTxt;
    BufferedReader bufRead;
    FileWriter fileHtml;

    public void zapisDoHTML(String plikWe) throws IOException {
        try {
            fileTxt = new FileReader(plikWe);
            bufRead = new BufferedReader(fileTxt);
            fileHtml = new FileWriter("plik.html", true);
            fileHtml.write("<style> td { border: 1px solid black; } </style>\r\n");
            fileHtml.write("<html><body><table>\r\n");
            fileHtml.write("<tr><td>\"Waga\"</td><td>\"Wzrost\"</td><td>\"BMI\"</td><td>\"Nadwaga\"</td></tr>\r\n");
            for (int i = 0; bufRead.ready(); i++) {
                linia = bufRead.readLine();
                System.out.println(linia);
                tab = linia.split("\\s");
                if (i > 0)
                    fileHtml.write("<tr><td>" + tab[0] + "</td><td>" + tab[1] + "</td><td>" + tab[2] + "</td><td>" + tab[3] + "</td></tr>\r\n");
            }
            fileHtml.write("</table></body></html>\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufRead.close();
            fileHtml.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String plikWe = "plikBMI.txt";
        Zad7 z7 = new Zad7();
        z7.zapisDoHTML(plikWe);
    }
}
