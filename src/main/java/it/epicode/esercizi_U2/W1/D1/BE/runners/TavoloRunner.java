package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D1.BE.repository.TavoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class TavoloRunner implements ApplicationRunner {

    @Autowired
    private TavoloRepository tavoloRepository;

    @Autowired
    private Tavolo newTavolo;

    @Autowired
    private Ordine newOrdine;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        tavoloRepository.save(newTavolo);
    }
}
