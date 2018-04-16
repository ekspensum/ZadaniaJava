interface IMoney {
    double getAmount();
}

class Money implements IMoney {
    protected double amount;

    public Money() {
    }

    public Money(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.amount == ((Money)obj).amount) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Money(7).equals(new Money(7)));
        System.out.println(new Money(7).equals(new Money(4)));
    }
}
