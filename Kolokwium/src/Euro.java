public class Euro extends Money {
    public Euro(double amount) {
        super(amount);
    }

    public Euro() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Euro)
            return super.equals(obj);
        return false;
    }

    public double add(Euro euro){
        return this.amount += euro.amount;
    }

    public double add(Dollar dollar){
        Exchange exchange = new Exchange(0.8);
        Euro euro = new Euro();
        euro.amount = dollar.amount * exchange.dollarToEuroRatio();
        return this.amount += euro.amount;
    }

    @Override
    public String toString() {
        return Double.toString(amount);
    }

    public static void main(String[] args) {
        Euro euro = new Euro(2.7);
        System.out.println(euro.getAmount());
        euro.add(new Euro(5.3));
        System.out.println(euro.getAmount());
    }
}
