public enum Coffee {
    ESPRESSO("Espresso", 400),
    AMERICANO("Americano", 400),
    LATTE("Latte", 800),
    CAPPUCCINO("Cappuccino", 750),
    MOCHA("Mocha", 900);

    private final String name;
    private final double price;

    Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isMilkBased() {
        return this == LATTE || this == CAPPUCCINO || this == MOCHA;
    }
}