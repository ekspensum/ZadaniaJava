import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {
    private List<Integer> liczby;
    private int pojemnosc;

    public Lista(int poj){
        this.pojemnosc=poj;
        liczby = new ArrayList<Integer>();
    }
    public void dodajElement(int li){
            if (liczby.size()<pojemnosc) liczby.add(li);
            else System.out.println("Nie można dodać liczby do listy - przekroczona pojemność.");
    }
    public int znajdz(int li){
        if (liczby.indexOf(li)>=0) System.out.println("Index znalezionej liczby "+li+" to: "+liczby.indexOf(li));
        else System.out.println("Nie znaleziono liczby: "+li);
        return liczby.indexOf(li);
    }
    public void pisz(){
        System.out.println("Maxymalna pojemność listy: "+pojemnosc);
        System.out.println("Aktualny rozmiar listy: "+liczby.size());
        System.out.println("Zawartość listy:");
        for (int i=0; i<liczby.size(); i++){
            System.out.println("Index: "+i+" liczba: "+liczby.get(i));
        }
    }
    public void usunPierwszy(int li){
        if (znajdz(li)>=0) liczby.remove(znajdz(li));
        else znajdz(li);
    }

    public void usunPowtorzenia() {

        for (int i = 0; i < liczby.size(); i++) {
            int n = 0;
            for (int j = 0; j < liczby.size(); j++) {
                if (liczby.get(i) == liczby.get(j)) {
                    n++;
                    if (n == 2) {
                        liczby.remove(liczby.indexOf(liczby.get(i)));
                        n--;
                    }
                }
            }
        }
    }
}
