public class NonVegPizza extends Pizza {
    private static final double CHEESE_PRICE = 2.0;
    private static final double TOPPINGS_PRICE = 4.0;
    private static final double TAKEAWAY_PRICE = 1.0;

    public NonVegPizza() {
        super("Non-Veg", 10.0);
    }

    @Override
    public double calculatePrice() {
        double price = basePrice;
        if (extraCheese) price += CHEESE_PRICE;
        if (extraToppings) price += TOPPINGS_PRICE;
        if (takeAway) price += TAKEAWAY_PRICE;
        return price;
    }
}
