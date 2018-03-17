public abstract class Mammal extends Animal {
    protected int ilenog;
    protected boolean kopytne;

    public Mammal() {
    }

    public Mammal(double maxpredkosc, int maxwaga, boolean drapieznik, int ilenog, boolean kopytne) {
        super(maxpredkosc, maxwaga, drapieznik);
        this.ilenog = ilenog;
        this.kopytne = kopytne;
    }
    public abstract int ileNog();
    public abstract boolean isKopytne();
}
