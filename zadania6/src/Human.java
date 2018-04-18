public class Human {
    String imie;
    int wiek;
    enum KolorOczu{ZIELONY, NIEBIESKI, BRAZOWY, PIWNY};
    enum KolorWlosow2{BLOND, CZARNE, RUDE, SZATYN};


    public static void main(String[] args) {
        Human h = new Human();

        for (int i=0; i<KolorOczu.values().length; i++)
        System.out.println(KolorOczu.values()[i]);

        for (int i=0; i<KolorWlosow2.values().length; i++)
            System.out.println(KolorWlosow2.values()[i]);

        System.out.println(KolorWlosow2.class.getName());

        for (int i=0; i<KolorWlosow.values().length; i++)
            System.out.println(KolorWlosow.values()[i].rodzaj2);

        System.out.println(KolorWlosow.valueOf("BLOND2"));

        System.out.println(KolorWlosow.BLOND2.rodzaj1);
    }
}
