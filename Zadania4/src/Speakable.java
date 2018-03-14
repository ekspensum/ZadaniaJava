interface Speakable {
    int QUIET = 0; // publiczne stałe statyczne
    int LOUD  = 1; // domyślnie public static final

    String getVoice(int voice); // metoda abstrakcyjna;
    // ponieważ w interfejsie mogą być
    // tylko publiczne metody abstrakcyjne,
    // specyfikatory public i abstract niepotrzebne
}

interface Moveable {
    void start();
    void stop();
}


abstract class Zwierz {
    private String name = "bez imienia";

    public Zwierz() {}

    public Zwierz(String s) {
        name = s;
    }

    public abstract String getTyp();

    public String getName() {
        return name;
    }

    public void speak(int ... v) {
        int vol = Speakable.QUIET;
        if (v.length == 1) vol = v[0];
        String voice;
        if (this instanceof Speakable) voice = ((Speakable) this).getVoice(vol);
        else voice = "... (cisza) ...";
        System.out.println(getTyp()+" "+getName()+ " mówi " + voice);
    }
}


class Pies extends Zwierz implements Speakable, Moveable {

    public Pies() {}

    public Pies(String s) {
        super(s);
    }

    public String getTyp() {
        return "Pies";
    }

    public String getVoice(int voice) { // metody interfejsu są zawsze publiczne!
        if (voice == LOUD)
            return "HAU... HAU... HAU... ";
        else
            return "hau... hau...";
    }

    public void start() {
        System.out.println("Pies " + getName() + " biegnie");
    }

    public void stop() {
        System.out.println("Pies " + getName() + " stanął");
    }

    public void merda() { System.out.println("Merda ogonem"); }
}

class Kot extends Zwierz {
    Kot() { }
    Kot(String s) {super(s);}

    public String getTyp() {return "Kot";}
    public String getVoice() {return "Miauuuu...";}
}

class Main2{

    static void say(String str) { System.out.println(str);}

    static void info(Zwierz z) {
        say(z.getTyp() + z.getName());
        if (z instanceof Speakable) {
            Speakable zs = (Speakable) z;
            say(zs.getVoice(Speakable.LOUD));
        }
        if (z instanceof Pies)  ((Pies) z).merda();
    }

    static void wyscig(Moveable ... moveables) {
        for (Moveable m : moveables) {
            m.start();
        }
    }

    static void animalDialog(Zwierz z1, Zwierz z2) {
        z1.speak();
        z2.speak();
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Pies kuba = new Pies("Kuba");
        kuba.start();
        System.out.println(kuba.getVoice(Speakable.LOUD));
        kuba.stop();

        info(kuba);


        Pies reksio = new Pies("Reksio");
        Kot kot = new Kot("Mruczek");

        animalDialog(kuba, reksio);
        animalDialog(kuba, kot);

        wyscig(kuba, reksio, new Pies("Azor"));
    }
}
