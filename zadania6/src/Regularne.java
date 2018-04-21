import java.util.Scanner;

public class Regularne {
    String liczba = "-2,4-5";
    String nrDomu;
    String nazwaMiasta = "krakow";

    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        Regularne r = new Regularne();
        System.out.println(r.sprawdzLiczbe(r.liczba));
        System.out.println("Podaj nr domu: ");
        r.nrDomu = we.next();
        System.out.println(r.nrDomu+" "+r.sprawdzNrDomu(r.nrDomu));
        System.out.println(r.sprawdzNazweMiasta(r.nazwaMiasta));
    }

    public boolean sprawdzLiczbe(String liczba){
        return liczba.matches("^-?[0-9]+,[0-9]+");
    }

    public boolean sprawdzNrDomu(String nrDomu){
        return nrDomu.matches("^[0-9]+\\\\[0-9]+[a-zA-Z0-9]?");
    }

    public boolean sprawdzNazweMiasta(String nazwaMiasta){
        return nazwaMiasta.matches("^[A-Z]{1}[a-z]+$");
    }
}
