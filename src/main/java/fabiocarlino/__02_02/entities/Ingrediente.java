package fabiocarlino.__02_02.entities;

public class Ingrediente extends Prodotto {

    public Ingrediente(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "\n" + this.getName() + ", " + this.getCalories() + " Cal, " + this.getPrice();
    }
}
