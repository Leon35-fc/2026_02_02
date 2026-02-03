package fabiocarlino.__02_02.entities;

public class Bevanda extends Prodotto {

    public Bevanda(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "\n" + this.getName() + ", " + this.getCalories() + " Cal, " + this.getPrice();
    }
}
