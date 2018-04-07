import java.awt.*;

public class DialogFile {

    public static void main(String[] args) {
        Frame a = new Frame("Okno macierzyste");
        a.setBounds(20, 20, 400, 500);
//        a.setVisible(true);
        a.setVisible(false);

        FileDialog fd = new FileDialog(a, "Wczytaj", FileDialog.LOAD);
        // FileDialog fd =new FileDialog(a,"Zapisz",FileDialog.SAVE);
        fd.setVisible(true);
        String katalog = fd.getDirectory();
        String plik = fd.getFile();
        System.out.println("Wybrano plik: " + plik);
        System.out.println("w katalogu: " + katalog);
        System.out.println("Ścieżka: " + katalog + plik);
    }
}
