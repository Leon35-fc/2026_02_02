package fabiocarlino.__02_02.config;

import fabiocarlino.__02_02.entities.Bevanda;
import fabiocarlino.__02_02.entities.Ingrediente;
import fabiocarlino.__02_02.entities.Menu;
import fabiocarlino.__02_02.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ConfigClass {

    @Bean
    public Menu menu() {


        //BEVANDE
        Bevanda limonata = new Bevanda("limonata (0.33l)", 128, 1.29);
        Bevanda acqua = new Bevanda("acqua (0.5l)", 0, 1.29);
        Bevanda vino = new Bevanda("vino (0.75l, 13%)", 607, 7.49);

        //INGREDIENTI
        Ingrediente ananas = new Ingrediente("ananas", 24, 0.79);
        Ingrediente cipolla = new Ingrediente("cipolla", 22, 0.69);
        Ingrediente mozzarella = new Ingrediente("mozzarella", 92, 0.69);
        Ingrediente prosciutto = new Ingrediente("prosciutto", 35, 0.99);
        Ingrediente salame = new Ingrediente("salame", 86, 0.99);
        Ingrediente pomodoro = new Ingrediente("pomodoro", 0, 0.99);

        //PIZZE
        Pizza margherita = new Pizza("margherita", 1104, 4.99, Arrays.asList(pomodoro, mozzarella));
        Pizza hawaiana = new Pizza("hawaiana", 1024, 6.49, Arrays.asList(pomodoro, mozzarella, prosciutto, ananas));
        Pizza salami = new Pizza("salami", 1160, 5.99, Arrays.asList(pomodoro, mozzarella, salame));

        Menu menu = new Menu(Arrays.asList(margherita, hawaiana, salami), Arrays.asList(ananas, cipolla, mozzarella, prosciutto, salame, pomodoro), Arrays.asList(acqua, vino, limonata));

        return menu;
    }


}
