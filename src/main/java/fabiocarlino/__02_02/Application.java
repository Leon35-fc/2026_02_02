package fabiocarlino.__02_02;

import fabiocarlino.__02_02.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Menu menu = context.getBean(Menu.class);

//        Pizza margherita = context.getBean("margherita", Pizza.class);

        System.out.println(menu);
    }

}
