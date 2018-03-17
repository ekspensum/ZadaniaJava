import java.util.ArrayList;
import java.util.Scanner;

public interface Zadanie10 {
    void wykonaj();
}

class Zadanie11 implements Zadanie10 {
    private String txt = "Jestem Zadanie 1";

    @Override
    public void wykonaj() {
        System.out.println(txt);
    }
}

class Zadanie21 implements Zadanie10 {
    private double val;

    public Zadanie21(double val) {
        this.val = val;
    }

    @Override
    public void wykonaj() {
        System.out.println("log(" + val + ") = " + Math.log(val));
    }
}

class Procesor1 {
    private ArrayList<Zadanie10> zadania;
    private int ilemam, ilezadan;

    public Procesor1(int ilezadan) {
        zadania = new ArrayList<>(ilezadan);
        this.ilezadan=ilezadan;
        ilemam = 0;
    }

    public void dodajZadanie(Zadanie10 z) {
        if (ilemam >= ilezadan)
            System.out.println("Za dużo zadań - mam już " + ilemam);
        else {
            zadania.add(z);
            ilemam++;
        }
    }

    public void wykonajZadania() {
        for (int i = 0; i < ilemam; i++)
            zadania.get(i).wykonaj();
        System.out.println("\n");
    }

    public void usunZadania(){
        zadania.clear();
        ilemam=0;
        System.out.println("Zadań do wykonania: "+ilemam);
    }
}

class Temp1 {
    private Procesor1 p;

    public Temp1() {
        p = new Procesor1(10);
    }

    public void menu() {
        String wybor;

        System.out.println("1 - Dodaj nowe Zadanie1");
        System.out.println("2 - Dodaj nowe Zadanie2");
        System.out.println("3 - Wykonaj zadania");
        System.out.println("4 - Usuń wykonane zadania");
        System.out.println("5 - Koniec");
        System.out.println("------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź liczbę int: ");
        wybor = input.next();
        System.out.println();
        if(wybor.equals("1"))
            p.dodajZadanie(new Zadanie11());
        else if (wybor.equals("2")){
            double v;
            System.out.println("Podaj liczbę do zlogarytmowania: ");
            v = input.nextDouble();
            p.dodajZadanie(new Zadanie21(v));
        }
        else if(wybor.equals("3")){
            p.wykonajZadania();
//            return;
        }
        else if (wybor.equals("4"))
            p.usunZadania();
        else if(wybor.equals("5"))
            System.exit(0);
    }

    public static void main(String[] args) {
        Temp1 t = new Temp1();
        while (true){
            t.menu();
        }
    }
}
