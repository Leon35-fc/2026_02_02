package fabiocarlino.__02_02.config;

import fabiocarlino.__02_02.entities.Ingrediente;
import fabiocarlino.__02_02.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public class Menu() {

        //INGREDIENTI
        Ingrediente ananas = new Ingrediente("ananas", 24, 0.79);
        Ingrediente cipolla = new Ingrediente("cipolla", 22, 0.69);
        Ingrediente formaggio = new Ingrediente("formaggio", 92, 0.69);
        Ingrediente prosciutto = new Ingrediente("prosciutto", 35, 0.99);
        Ingrediente salame = new Ingrediente("salame", 86, 0.99);

        //PIZZE
        Pizza margherita = new Pizza("margherita", 1104, 4.99);
        Pizza hawaiana = new Pizza("hawaiana", 1024, 6.49);
        Pizza margherita = new Pizza("margherita", 1104, 4.99);
    }


}
