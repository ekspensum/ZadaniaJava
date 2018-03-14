package firma;

public class Pracownik {
    private String imie[] = {"Adam", "Ewa", "Danuta", "Anatol"};
    private String nazwisko[] = {"Kowalski", "Nowak", "Krakowska", "Górski"};
    private int wiek[] = new int[imie.length];

    public Pracownik() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        for (int j = 0, k = 25; j < imie.length; j++, k = k + 5)
            this.wiek[j] = k;
    }

    public Pracownik(String[] i) {
        this.imie = i;
        this.nazwisko = nazwisko;
        for (int j = 0, k = 35; j < imie.length; j++, k = k + 5)
            this.wiek[j] = k;
    }

    public Pracownik(String[] i, String[] n) {
        this.imie = i;
        this.nazwisko = n;
        for (int j = 0, k = 30; j < imie.length; j++, k = k + 6)
            this.wiek[j] = k;
    }

    public Pracownik(String[] i, String[] n, int[] w) {
        this.imie = i;
        this.nazwisko = n;
        this.wiek = w;
    }

    public String[] getImie() {
        return imie;
    }

    public String[] getNazwisko() {
        return nazwisko;
    }

    public int[] getWiek() {
        return wiek;
    }

    public void setImie(String[] imie) {
        this.imie = imie;
    }

    public void setNazwisko(String[] nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int[] wiek) {
        this.wiek = wiek;
    }
}
