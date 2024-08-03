public class DeluxVegPizza extends Pizza {
    public DeluxVegPizza() {
        super("Delux Veg", 15.0);
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
