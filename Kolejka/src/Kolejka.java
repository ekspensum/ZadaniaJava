import java.util.ArrayList;
import java.util.Date;

public class Kolejka<T1, T2, T3> {
    public T1 obiekt;
    public T2 priorytet;
    public T3 data;
    ArrayList<T1> kolejka;

    public Kolejka() {
    }

    public Kolejka(T1 obiekt, T2 priorytet) {
        this.obiekt = obiekt;
        this.priorytet = priorytet;
        kolejka = new ArrayList<>();
    }

    public static void main(String[] args) {
        Kolejka<String, Integer, Date> k = new Kolejka<>();
        k.push("A", 3);
        k.push("B", 4);

        for (int i=0; i<k.kolejka.size(); i++){
            System.out.println();
        }

    }

    public void push(T1 obiekt, T2 priorytet){
        kolejka.add(priorytet, obiekt);
    }


}
