public class Vehicle {
    private int numberOfWheels;
    private String engine;

    public Vehicle(){

    }

    public Vehicle(String engine, int numberOfWheels){
        this.engine=engine;
        this.numberOfWheels=numberOfWheels;
    }
    public void startEngine(){
        System.out.println("Engine starts. Brum brum brum");
    }

}
