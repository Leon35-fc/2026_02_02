package fabiocarlino.__02_02.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;
    private List<Ingrediente> ingredienteList;
    private List<Bevanda> bevandaList;

    public Menu() {
//        this.pizzaList = pizzaList;
//        this.ingredienteList = ingredienteList;
//        this.bevandaList = bevandaList;
    }

    public Menu(List<Pizza> pizzaList, List<Ingrediente> ingredienteList, List<Bevanda> bevandaList) {
        this.pizzaList = pizzaList;
        this.ingredienteList = ingredienteList;
        this.bevandaList = bevandaList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizzaList +
                "\ningredienti=" + ingredienteList +
                "\nbevande=" + bevandaList +
                '}';
    }
}
