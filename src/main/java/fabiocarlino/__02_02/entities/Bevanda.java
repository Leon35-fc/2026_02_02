package fabiocarlino.__02_02.entities;

public class Bevanda extends Prodotto {

    public Bevanda(String name, int calories, double price) {
        super(name, calories, price);
    }

    public String toStringall() {
        return "Bevanda{" +
                "nome: " + this.getName() +
                "calorie: " + this.getCalories() +
                "prezzo: " + this.getPrice();
    }

    @Override
    public String toString() {
        return "Bevanda{}" + this.getName();
    }
}
