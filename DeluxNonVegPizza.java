public class DeluxNonVegPizza extends Pizza {
    public DeluxNonVegPizza() {
        super("Delux Non-Veg", 18.0);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        double price = basePrice;
        if (takeAway) price += 1.0;
        return price;
    }
}
