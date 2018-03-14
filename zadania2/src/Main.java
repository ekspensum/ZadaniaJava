import java.util.Random;
import java.util.Scanner;
import telefony.Telefony;
import telefony.Telefon;

public class Main {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

//        Human h = new Human(30, 75, 170, "Adam", "Mal");
//        System.out.println("Imię "+h.getImie()+" wiek "+h.getWiek()+" wzrost "+h.getWzrost()+" płeć "+h.getPlec()+" waga "+h.getWaga());
//        h.setImie("Anatol");
//        h.setWiek(35);
//        System.out.println("Imię "+h.getImie()+" wiek "+h.getWiek()+" wzrost "+h.getWzrost()+" płeć "+h.getPlec()+" waga "+h.getWaga());

//        Prostokat p = new Prostokat();
//        System.out.println("Długość: "+p.getDl());
//        System.out.println("Szerokość: "+p.getSzer());
//        System.out.println("Wprowadź nową długość:");
//        p.setDl(we.nextInt());
//        System.out.println("Wprowadź nową szerokość:");
//        p.setSzer(we.nextInt());
//        System.out.println("Pole: "+p.pole());
//        System.out.println("Obwód: "+p.obwod());
//        System.out.println("Przekatna: "+p.przekatna());

//        Punkt punkt1 = new Punkt(10, 10);
//        Punkt punkt2 = punkt1;
//        Punkt punkt3 = new Punkt(10, 10);
//        Punkt punkt4 = new Punkt(punkt1.getX(), punkt1.getY());
//        Punkt punkt5 = new Punkt(punkt1);
//
//        boolean porownanie1 = punkt1==punkt2;
//        boolean porownanie2 = punkt1==punkt3;
//
//        System.out.println("Porownanie1: "+porownanie1);
//        System.out.println("Porownanie2: "+porownanie2);
//        wyswietl(punkt1, punkt2, punkt3, punkt4, punkt5);
//
//        punkt2.setX(11);
//        punkt3.setX(12);
//        punkt4.setX(13);
//        punkt5.setX(14);
//        wyswietl(punkt1, punkt2, punkt3, punkt4, punkt5);

        MyNumber m = new MyNumber();
        MyNumber x = new MyNumber();
        System.out.println("Atrybut klasy MyNumber obiekt m: "+m.getNum());
        System.out.println("Parzysta: "+m.isEven());
        System.out.println("Nieparzysta: "+m.isOdd());
        System.out.println("Atrybut klasy MyNumber - obiekt x: "+x.getNum());
//        if (m.getNum()<0) System.out.println("Pierwiastkowanie niemożliwe - liczba mniejsza od 0");
//        else System.out.println("Pierwiastek: "+Math.sqrt(m.getNum()));
        System.out.println(m.sqrt());
        System.out.println("Podstawa - atrybut obiektu m: "+m.getNum()+", wykładnik - atrybut obiektu x: "+x.getNum()+" potęga: "+m.pow(x));
        System.out.println("Suma atrybutów obiektów m i x: "+m.add(x));
        System.out.println("Różnica atrybutów obiektów m i x: "+m.subtract(x));

//        int n = 10;
//        Telefon[] telefony = new Telefon[n];
//        for (int i = 0; i < n; i++) {
//            telefony[i] = new Telefon("113");
//            telefony[i].zadzwon("112");
//        }

//        final int N=10;
//        Lista l = new Lista(N);
//        l.dodajElement(13);
//        l.dodajElement(23);
//        l.dodajElement(33);
//        l.dodajElement(33);
//        l.dodajElement(33);
//        l.dodajElement(33);
//        //l.znajdz(33);
//        l.dodajElement(13);
//        l.dodajElement(13);
//        l.dodajElement(13);
//        l.pisz();
//        //l.usunPierwszy(13);
//        l.usunPowtorzenia();
//        l.pisz();
        final int N = 10;
        Lista l = new Lista(N);

        for (int i = 0; i < N/2; ++i) {
            // Dzialanie n << s to przesuniecie s bitow w n z uwzglednieniem bitu znaku
            // Przyklad: 11 << 3 = 11 * 2^3 = 11 * 8 = 88
            // 11 (binarnie)  =    0000 1011
            // przesuniecie o 3    0101 1000
            l.dodajElement( (1 << i) );
        }
        l.dodajElement(2);
        l.dodajElement(8);
        l.pisz();
        l.usunPierwszy(2);
        l.pisz();
        for (int i = 0; i < N/2; ++i) {
            l.dodajElement( (1 << i) );
        }
        l.pisz();
        System.out.println("Po usunieciu powtorzen:");
        l.usunPowtorzenia();
        l.pisz();

        Punkt2D p2D1 = new Punkt2D();
        System.out.println("pkt 2D: "+p2D1.getX()+" "+p2D1.getY());
        p2D1 = new Punkt2D(23,14);
        System.out.println("pkt 2D: "+p2D1.getX()+" "+p2D1.getY());
        Punkt3D p3D1 = new Punkt3D();
        System.out.println("pkt 3D: "+p3D1.getX()+" "+p3D1.getY()+" "+p3D1.getZ());
        p3D1 = new Punkt3D(33, 147);
        p2D1.setX(1);
        p2D1.setY(2);
        System.out.println("pkt 2D: "+p2D1.getX()+" "+p2D1.getY());
        System.out.println("pkt 3D: "+p3D1.getX()+" "+p3D1.getY()+" "+p3D1.getZ());
        p3D1.setX(13);
        p3D1.setY(1313);
        System.out.println("pkt 3D: "+p3D1.getX()+" "+p3D1.getY()+" "+p3D1.getZ());
        p3D1.setX(77);
        p3D1.setY(88);
        p3D1.setZ(99);
        System.out.println("pkt 3D: "+p3D1.getX()+" "+p3D1.getY()+" "+p3D1.getZ());
        p2D1.setX(44);
        p2D1.setY(55);
        System.out.println("pkt 3D: "+p3D1.getX()+" "+p3D1.getY()+" "+p3D1.getZ());
    }

    public static void wyswietl(Punkt... punkty) {
        int size = punkty.length;
        for(int i=0; i<size; i++) {
            System.out.println("Punkt "+(i+1)+" x:"+punkty[i].getX()+" ; y:"+punkty[i].getY());
        }
        System.out.println();
    }
}
