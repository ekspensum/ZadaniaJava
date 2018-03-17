public class Human extends Mammal {
    protected String imie;

    public Human() {
    }

    public Human(double maxpredkosc, int maxwaga, boolean drapieznik, int ilenog, boolean kopytne, String imie) {
        super(maxpredkosc, maxwaga, drapieznik, ilenog, kopytne);
        this.imie = imie;
    }

    @Override
    public int ileNog() {
        return ilenog;
    }

    @Override
    public boolean isKopytne() {
        return kopytne;
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
                " Ilość nóg: " + ileNog() +
                " Kopytne: " + isKopytne();
    }
}
