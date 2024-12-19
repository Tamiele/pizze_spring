package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Bevanda;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Topping;
import it.epicode.esercizi_U2.W1.D1.BE.repository.PizzaRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ToppingsRunner implements ApplicationRunner {

    @Autowired
    private ToppingRepository toppingRepository;

    @Autowired
    private Topping newToppingCheese;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        toppingRepository.save(newToppingCheese);
    }
}
