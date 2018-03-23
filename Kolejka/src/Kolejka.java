import java.util.ArrayList;
import java.util.Date;

public class Kolejka<T1, T2, T3> {
    public T1 obiekt;
    public T2 priorytet;
    public T3 data;
    private Integer rozmiar=0;
    ArrayList<T1> kolejka = new ArrayList<>(5);

    public Kolejka() {
    }

    public Kolejka(T1 obiekt, T2 priorytet) {
        this.obiekt = obiekt;
        this.priorytet = priorytet;
    }

    public static void main(String[] args) {
        Kolejka<String, Integer, Date> k = new Kolejka<>();
        k.dodajNaKoniec("E");
        k.dodajNaKoniec("F");
        k.dodajNaKoniec("G");
        k.wstawDoKolejki("A", 0);
        k.zwolnijPierwszy();
        k.wstawDoKolejki("B", 1);
        k.dodajNaKoniec("C");
        k.zwolnijPierwszy();
        k.dodajNaKoniec("H");
//        k.dodajNaKoniec("I");
//        k.zwolnijPierwszy();

        for (int i=0; i<k.rozmiar; i++){
            System.out.println(i+". "+k.kolejka.get(i));
        }
    }

    public void wstawDoKolejki(T1 obiekt, T2 priorytet){
        kolejka.add((Integer) priorytet, obiekt);
        rozmiar++;
    }

    public void dodajNaKoniec(T1 obiekt){
        if (rozmiar<5){
            kolejka.add(obiekt);
            rozmiar++;
        } else System.out.println("Kolejka jest pełna");

    }

    public void zwolnijPierwszy(){
        kolejka.remove(0);
        rozmiar--;
    }
}
