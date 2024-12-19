package it.epicode.esercizi_U2.W1.D1.BE.configurations;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TavoloConfiguration {

    @Bean
    Tavolo newTavolo(){
        Tavolo tavolo = new Tavolo();
        tavolo.setStatoTavolo(StatoTavolo.OCCUPATO);
        tavolo.setNumeroCopertiMassimo(3);
        return tavolo;
    }
}
