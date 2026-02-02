package fabiocarlino.__02_02.entities;

import java.util.List;

public class Pizza extends Prodotto {
    private List<Ingrediente> ingrediente;

    public Pizza(String name, int calories, int price, List<Ingrediente> ingrediente) {
        super(name, calories, price);
        this.ingrediente = ingrediente;
    }
    
}
