public class GoldFish extends Fish {
    private String imie;

    public GoldFish() {
    }

    public GoldFish(double maxpredkosc, int maxwaga, boolean drapieznik, int ilepletw, boolean pecherzplawny, String imie) {
        super(maxpredkosc, maxwaga, drapieznik, ilepletw, pecherzplawny);
        this.imie = imie;
    }

    @Override
    public int ilePletw() {
        return ilepletw;
    }

    @Override
    public boolean pecherzPlawny() {
        return pecherzplawny;
    }

    @Override
    public double maxPredkosc(double przelicz) {
        System.out.println("Max prędkość: " + maxpredkosc * przelicz + " km/h");
        return maxpredkosc;
    }

    @Override
    public boolean drapieznik() {
        return drapieznik;
    }

    @Override
    public int maxWaga() {
        System.out.println("Max weight: " + maxwaga * pound + " punds");
        return maxwaga;
    }

    @Override
    public String toString() {
        return "Baza danych zwierząt " +
                " Gatunek: " + getClass().getSuperclass().getName() +
                " Imie: " + imie +
                " Podstawowe dane: " +
                " Max waga: " + maxWaga() + " g" +
                " Max prędkość: " + maxPredkosc(kmh) + " m/s " +
                " Drapieżnik: " + drapieznik() +
                " Ilość płetw: " + ilePletw() +
                " Pęcherz pławny: " + pecherzPlawny();
    }
}
