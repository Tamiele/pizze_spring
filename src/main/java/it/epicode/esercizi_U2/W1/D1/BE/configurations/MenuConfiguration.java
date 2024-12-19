package it.epicode.esercizi_U2.W1.D1.BE.configurations;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfiguration {

    @Bean
    public Menu menu(){
        Menu menu = new Menu();
        return menu;
    }

}
