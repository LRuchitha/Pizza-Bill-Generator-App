public abstract class Pizza {
    protected String name;
    protected double basePrice;
    protected boolean extraCheese;
    protected boolean extraToppings;
    protected boolean takeAway;

    public Pizza(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.extraCheese = false;
        this.extraToppings = false;
        this.takeAway = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void optForTakeAway() {
        this.takeAway = true;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return name + " Pizza";
    }
}
