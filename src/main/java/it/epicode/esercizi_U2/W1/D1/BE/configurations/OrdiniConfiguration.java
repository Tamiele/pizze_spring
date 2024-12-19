package it.epicode.esercizi_U2.W1.D1.BE.configurations;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoOrdine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class OrdiniConfiguration {

    @Bean
    Ordine newOrdine(){
    Ordine ordine = new Ordine();
    ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
    ordine.setNumeroCoperti(5);
    ordine.setOraAcquisizione(LocalTime.now());
    return ordine;
    }
}
