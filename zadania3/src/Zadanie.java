import java.util.Scanner;

public interface Zadanie {
    void wykonaj();
}

class Zadanie1 implements Zadanie {
    private String txt = "Jestem Zadanie 1";

    @Override
    public void wykonaj() {
        System.out.println(txt);
    }
}

class Zadanie2 implements Zadanie {
    private double val;

    public Zadanie2(double val) {
        this.val = val;
    }

    @Override
    public void wykonaj() {
        System.out.println("log(" + val + ") = " + Math.log(val));
    }
}

class Procesor {
    private Zadanie[] zadania;
    private int ilemam;

    public Procesor(int ilezadan) {
        zadania = new Zadanie[ilezadan];
        ilemam = 0;
    }

    public void dodajZadanie(Zadanie z) {
        if (ilemam >= zadania.length)
            System.out.println("Za dużo zadań - mam już " + ilemam);
        else {
            zadania[ilemam] = z;
            ilemam++;
        }
    }

    public void wykonajZadania() {
        for (int i = 0; i < ilemam; i++)
            zadania[i].wykonaj();
        System.out.println("\n");
    }
}

class Temp {
    private Procesor p;

    public Temp() {
        p = new Procesor(10);
    }

    public void menu() {
        String wybor;

        System.out.println("1 - Dodaj nowe Zadanie1");
        System.out.println("2 - Dodaj nowe Zadanie2");
        System.out.println("3 - Wykonaj zadania");
        System.out.println("4 - Koniec");
        System.out.println("------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź liczbę int: ");
        wybor = input.next();
        System.out.println();
        if(wybor.equals("1"))
            p.dodajZadanie(new Zadanie1());
        else if (wybor.equals("2")){
            double v;
            System.out.println("Podaj liczbę do zlogarytmowania: ");
            v = input.nextDouble();
            p.dodajZadanie(new Zadanie2(v));
        }
        else if(wybor.equals("3")){
            p.wykonajZadania();
//            return;
        }
        else if(wybor.equals("4"))
            System.exit(0);
    }

    public static void main(String[] args) {
        Temp t = new Temp();
        while (true){
            t.menu();
        }
    }
}
