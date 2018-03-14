package firma;

public class Firma {

    private Pracownik p = new Pracownik();
    public void wyswietl() {
        for (int i = 0; i < p.getImie().length; i++)
            System.out.println(p.getImie()[i] + " " + p.getNazwisko()[i] + " " + p.getWiek()[i]);
        System.out.println();
    }

    private String[] imie = {"Gutek", "Stefa", "Ola", "Maniek"};
    private Pracownik p1 = new Pracownik(imie);
    public void wyswietl1() {
        for (int i = 0; i < p1.getImie().length; i++)
            System.out.println(p1.getImie()[i] + " " + p1.getNazwisko()[i] + " " + p1.getWiek()[i]);
        System.out.println();
    }

    private String[] nazwisko = {"Frankowski", "Poznańska", "Zięba", "Markowski"};
    private Pracownik p2 = new Pracownik(imie, nazwisko);
    public void wyswietl2() {
        for (int i = 0; i < p2.getImie().length; i++)
            System.out.println(p2.getImie()[i] + " " + p2.getNazwisko()[i] + " " + p2.getWiek()[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        Firma f = new Firma();
        f.wyswietl();
        f.wyswietl1();
        f.wyswietl2();

        Firma f1 = new Firma();
        String[] imie = {"Franek", "Zosia", "Marta", "Marek"};
        String[] nazwisko = {"Frankowski", "Poznańska", "Zięba", "Markowski"};
        int[] wiek = {33, 43, 53, 63};
        f1.p1.setImie(imie);
        f1.p1.setNazwisko(nazwisko);
        f1.p1.setWiek(wiek);
        f1.wyswietl1();
    }
}
