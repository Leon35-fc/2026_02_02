package fabiocarlino.__02_02.entities;

import java.util.List;

public class Pizza extends Prodotto {
    private List<Ingrediente> ingrediente;

    public Pizza(String name, int calories, double price, List<Ingrediente> ingrediente) {
        super(name, calories, price);
        this.ingrediente = ingrediente;
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "\nPizza{" +
                "nome=" + getName() +
                ", ingredienti=" + getIngrediente() +
                " }";
    }
}
