public class Lista2 {
    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;
    private int t = 0;

    public Lista2() {
        this.pojemnosc = 10;
        this.liczby = new int[pojemnosc];
        this.rozmiar = 0;
    }

    public void dodajElement(int a) {
        if (rozmiar < pojemnosc) {
            for (int i = rozmiar; i <= rozmiar; i++) {
                this.liczby[i] = a;
            }
            rozmiar++;
        } else System.out.println("Przekroczono rozmiar tablicy!");
    }

    public int znajdz(int a) {
        for (int i = 0; i < pojemnosc; i++) {
            if (liczby[i] == a) return i;
        }
        return -1;
    }

    public void pisz() {
        System.out.println("Pojemność listy: " + pojemnosc);
        System.out.println("Rozmiar listy: " + rozmiar);
        for (int i = 0; i < rozmiar; i++)
            System.out.println(i + ". " + liczby[i]);
    }

    public void usunPierwszy(int a) {
        if (znajdz(a) >= 0) {
            for (int i = 0; i < rozmiar; i++) {
                if (liczby[i] == a) {
                    for (int j = i; j < rozmiar - 1; j++)
                        liczby[j] = liczby[j + 1];
                    rozmiar--;
                    break;
                }
            }
        } else System.out.println("Nie znaleziono liczby: " + a);
    }

    public void usunPowtorzenia() {
        for (int i = 0; i < rozmiar; i++) {
            t = 0;
            for (int j = 0; j < rozmiar; j++) {
                if (liczby[i] == liczby[j]) t++;
                if (t == 2) {
                    for (int k = i; k < rozmiar - 1; k++)
                        liczby[k] = liczby[k + 1];
                    t = 0;
                    j = 0;
                    rozmiar--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Lista2 l = new Lista2();
        l.dodajElement(9);
        l.dodajElement(3);
        l.dodajElement(-13);
        l.pisz();
        System.out.println("Szukana liczba posiada indeks : " + l.znajdz(-13));
        l.dodajElement(55);
        l.dodajElement(99);
        l.pisz();
        System.out.println("Usuń pierwszy: ");
        l.usunPierwszy(-13);
        l.pisz();
        l.dodajElement(55);
        l.dodajElement(55);
        l.dodajElement(3);
        l.dodajElement(99);
        l.dodajElement(9);
        l.dodajElement(100);
        l.dodajElement(1001);
        l.pisz();
        l.usunPierwszy(99);
        l.pisz();
        l.dodajElement(99);
        System.out.println("Usuń powtórzenia: ");
        l.usunPowtorzenia();
        l.pisz();
        l.usunPierwszy(1001);
        l.usunPierwszy(100);
        l.usunPierwszy(9);
        l.pisz();
    }

}
