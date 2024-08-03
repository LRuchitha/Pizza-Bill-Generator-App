public class VegPizza extends Pizza {
    private static final double CHEESE_PRICE = 2.0;
    private static final double TOPPINGS_PRICE = 3.0;
    private static final double TAKEAWAY_PRICE = 1.0;

    public VegPizza() {
        super("Veg", 8.0);
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
