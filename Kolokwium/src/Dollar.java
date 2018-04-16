public class Dollar extends Money {
    public Dollar() {
    }

    public Dollar(double amount) {
        super(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dollar)
        return super.equals(obj);
        return false;
    }

    public double add(Dollar dollar){
        return this.amount += dollar.amount;
    }

    public double add(Euro euro){
        Exchange exchange = new Exchange(0.8);
        Dollar dollar = new Dollar();
        dollar.amount = euro.amount * exchange.euroToDollarRatio();
        return this.amount += dollar.amount;
    }

    @Override
    public String toString() {
        return Double.toString(amount);
    }

    public static void main(String[] args) {
        System.out.println(new Dollar(6).equals(new Euro(6)));

        Dollar dollar = new Dollar(2.7);
        System.out.println(dollar.getAmount());
        dollar.add(new Dollar(5.3));
        System.out.println(dollar.getAmount());
    }

}
