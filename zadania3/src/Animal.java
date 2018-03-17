public abstract class Animal {
//    protected String nazwa = "bez nazwy";
    protected double maxpredkosc;
    protected int maxwaga;
    protected boolean drapieznik;
    protected final double pound=2.2/1000;
    protected final double kmh=3.6;

    public Animal() {
    }

    public Animal(double maxpredkosc, int maxwaga, boolean drapieznik) {
        this.maxpredkosc = maxpredkosc;
        this.maxwaga = maxwaga;
        this.drapieznik = drapieznik;
    }

    public abstract double maxPredkosc(double przelicz);

    public abstract boolean drapieznik();

    public abstract int maxWaga();

}
