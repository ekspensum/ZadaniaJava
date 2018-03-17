public abstract class Fish extends Animal {
    protected int ilepletw;
    protected boolean pecherzplawny;

    public Fish() {
    }

    public Fish(double maxpredkosc, int maxwaga, boolean drapieznik, int ilepletw, boolean pecherzplawny) {
        super(maxpredkosc, maxwaga, drapieznik);
        this.ilepletw = ilepletw;
        this.pecherzplawny = pecherzplawny;
    }

    public abstract int ilePletw();

    public abstract boolean pecherzPlawny();

}
