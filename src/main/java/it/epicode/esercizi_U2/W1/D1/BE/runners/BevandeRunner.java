package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Bevanda;
import it.epicode.esercizi_U2.W1.D1.BE.repository.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BevandeRunner implements ApplicationRunner {
    @Autowired
    private BevandaRepository bevandaRepository;

    @Autowired
    private Bevanda newBevandaLemonade;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        bevandaRepository.save(newBevandaLemonade);


    }
}
