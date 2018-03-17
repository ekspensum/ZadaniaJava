public class Main {
    public static void main(String[] args) {

//        System.out.println("Klasa bazowa");
//        LZesp l0 = new LZesp();
//        LZesp l1 = new LZesp(3, 7);
//        LZesp l2 = new LZesp(11, 23);
//        l0.pisz();
//        l1.pisz();
//        l2.pisz();
//        System.out.println(l1.plus(l2).jakoLancuch());
//        //System.out.println(l1.plus2(l2));
//        l1.plus(l2).pisz();
//        l2.razy(l1).pisz();
//        l1.pisz();
//        l1 = new LZesp(100, 100);
//        l1.pisz();
//        System.out.println("Klasa pochodna");
//        LZesp2 lp0 = new LZesp2();
//        lp0.pisz();
//        LZesp2 lp1 = new LZesp2(33,44);
//        lp1.pisz();
//        lp0 = new LZesp2(l1);
//        lp0.pisz();
//        new LZesp2(0,0).pisz();
//        l0.plus(l1).razy(l2).plus(lp0).minus(lp1).pisz();

//        LZesp l1 = new LZesp(3,2);
//        LZesp l2 = new LZesp(2,3);
//
//        System.out.println(l1.jakoLancuch() + " + " +
//                l2.jakoLancuch() + " = " +
//                l1.plus(l2).jakoLancuch()
//        );
//        System.out.println(l1.jakoLancuch() + " - " +
//                l2.jakoLancuch() + " = " +
//                l1.minus(l2).jakoLancuch()
//        );
//        System.out.println(l1.jakoLancuch() + " * " +
//                l2.jakoLancuch() + " = " +
//                l1.razy(l2).jakoLancuch()
//        );

//        LZesp2 l1 = new LZesp2(0,-33);
//        LZesp2 l2 = new LZesp2(2,0);
//
//        System.out.println(l1.jakoLancuch() + " + " +
//                l2.jakoLancuch() + " = " +
//                l1.plus(l2).jakoLancuch()
//        );
//        System.out.println(l1.jakoLancuch() + " - " +
//                l2.jakoLancuch() + " = " +
//                new LZesp2(l1.minus(l2)).jakoLancuch()
//        );
//        System.out.println(l1.jakoLancuch() + " * " +
//                l2.jakoLancuch() + " = " +
//                l1.razy(l2).jakoLancuch()
//        );
//        Vehicle v = new Vehicle("Silnik", 4);
//        v.startEngine();
//        Car c = new Car("Silnik");
//        c.startEngine();
//        c.refuel(45.5);

//        Vehicle v = new Vehicle("muscles", 2);
//        Vehicle v1 = new Car("electric");
//        Car c = new Car("internal combustion");
//
//        v.startEngine();
//        System.out.println();
//        v1.startEngine();
//        System.out.println();
////        v1.refuel(5); // blad
//        ((Car)v1).refuel(5);
//
//        System.out.println();
//        c.startEngine();
//        System.out.println();
//
//        if (v1 instanceof Car) {
//            Car c1 = (Car) v1;
//            c1.startEngine();
//            c1.refuel(7);
//        }
//
//        System.out.println();
//        Vehicle v2 = c;
//        System.out.println();
////         v2.refuel(5);  // blad
//        ((Car)v2).refuel(10);

        Vehicle v = new Vehicle("Pojazd", 3);

        Vehicle vs = new Car("Pojazd2");
        vs.startEngine();

        Car cs = new SUV("Terenowka");
        cs.startEngine();

        SUV s = new SUV("Terenowka");
        ((SUV) cs).wlacz4x4();

        if (s instanceof Car) System.out.println("OK");
        else System.out.println("NO");
        if (s instanceof Vehicle) System.out.println("OK");
        else System.out.println("NO");
        if (cs instanceof SUV) System.out.println("OK");
        else System.out.println("NO");
        if (v instanceof SUV) System.out.println("OK");
        else System.out.println("NO");
        if (vs instanceof SUV) System.out.println("OK");
        else System.out.println("NO");
        ((SUV) cs).wlacz4x4();
//        s = v;
        v = s;
        ((SUV) v).wlacz4x4();
        Vehicle v99 = s;
        ((SUV) v99).refuel(5);

        Car c1 = (Car) v;
        s.v.startEngine();
        s.c.startEngine();

        Pies p = new Pies("Azor");
        Kot k = new Kot("Tom");

        p.speak();
        System.out.println(p.getName());
        System.out.println(p.getType());
        System.out.println(p.getVoice());
        k.speak();
        Zwierz z = new Pies("Burek");
        Zwierz z1 = new Kot("Filemon");
        System.out.println(z);
        z1.speak();

//        GoldFish gf1 = new GoldFish(0.4, 6000, true, 9, true, "Gruba ryba");
//        GoldFish gf2 = new GoldFish(0.1, 10, false, 6, true, "Rybcia");
//        GoldFish gf3 = new GoldFish();
////        GoldFish gf3 = new Fish();
//        System.out.println(gf1);
//        System.out.println(gf2);
//        System.out.println(gf3);
        Animal[] anim = new Animal[10];
        anim[0] = new GoldFish(0.1, 10, false, 6, true, "Ryba 0");
        anim[1] = new GoldFish(4, 1000, true, 4, true, "Ryba 1");
        anim[2] = new GoldFish(0.3, 200, false, 8, true, "Ryba 2");
        anim[3] = new Human(10, 120000, true, 2, false, "Człowiek 3");
        anim[4] = new Human(10, 120000, true, 2, false, "Człowiek 4");
        anim[5] = new Human(10, 120000, true, 2, false, "Człowiek 5");
//        System.out.println(anim[0]);
//        System.out.println(anim[1]);
//        System.out.println(anim[2]);
        for(Animal a: anim){
            System.out.println(a);
        }

    }
}
