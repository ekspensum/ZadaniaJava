public class SUV extends Car {

    public SUV(String engine){
        super(engine);
        super.refuel(133);
    }

//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//    @Override
//    public void refuel(double nr_liters) {
//        super.refuel(nr_liters);
//    }
    Vehicle v = new Vehicle();
    Car c = new Car("Sedan");

    public void wlacz4x4(){
        System.out.println("Napęd 4x4 włączony");
        new Vehicle().startEngine();
        v.startEngine();
        c.refuel(99);
    }

}
