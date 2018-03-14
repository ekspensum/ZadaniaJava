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

        Vehicle v= new Vehicle("Pojazd", 3);

        Vehicle vs = new Car("Pojazd2");
        vs.startEngine();

        Car cs = new SUV("Terenowka");
        cs.startEngine();

        SUV s = new SUV("Terenowka");
        ((SUV)cs).wlacz4x4();

        if (s instanceof Car) System.out.println("OK");
        if (s instanceof Vehicle) System.out.println("OK");
        if (cs instanceof SUV) System.out.println("OK");
        if (v instanceof SUV)  System.out.println("OK"); else System.out.println("NO");
        if (vs instanceof SUV)  System.out.println("OK"); else System.out.println("NO");
        ((SUV)cs).wlacz4x4();
//        s = v;
        v = s;
//        ((SUV)v).wlacz4x4();
        Vehicle v99 = s;
//        ((SUV)v99).refuel(5);
//        Car c1 = (Car) v1;


    }
}
