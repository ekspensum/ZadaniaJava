public class Exchange {

    double ratio;

    public Exchange(double ratio) {
        this.ratio = ratio;
    }

    public double dollarToEuroRatio() {
        return this.ratio;
    }

    public double euroToDollarRatio() {
        return 1.0 / ratio;
    }

    public Euro dollarToEuro(Dollar dollar) {
        Euro euro = new Euro();
        euro.amount = dollar.amount / euroToDollarRatio();
        return euro;
    }

    public Dollar euroToDollar(Euro euro) {
        Dollar dollar = new Dollar();
        dollar.amount = euro.amount / dollarToEuroRatio();
        return dollar;
    }


    public static void main(String[] args) {
//        Exchange exchange = new Exchange(0.8);
//        System.out.println(exchange.dollarToEuroRatio());
//        System.out.println(exchange.euroToDollarRatio());

        Dollar dollar1 = new Dollar(6.25);
        Exchange exchange = new Exchange(0.8);
        Euro euro1 = exchange.dollarToEuro(dollar1);
        System.out.println(euro1.getAmount());
        Dollar dollar2 = exchange.euroToDollar(euro1);
        System.out.println(dollar2.getAmount());

//        Dollar dollar = new Dollar(4);
//        Euro euro = new Euro(7);
//        dollar.add(euro);
//        System.out.println(dollar);

        Dollar dollar = new Dollar(4);
        Euro euro = new Euro(7);
        euro.add(dollar);
        System.out.println(euro);
    }
}
