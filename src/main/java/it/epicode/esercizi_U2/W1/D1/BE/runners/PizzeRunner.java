package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Bevanda;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D1.BE.repository.PizzaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class PizzeRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private Pizza newPizzaMargherita;

    @Autowired
    private Pizza newPizzaHawaaiiana;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        pizzaRepository.save(newPizzaMargherita);

        pizzaRepository.save(newPizzaHawaaiiana);

        System.out.println(pizzaRepository.findByNomeIgnoreCase("margherita").getNome());

        pizzaRepository.findByPrezzoBetweenOrderByPrezzo(2.0, 6.0).forEach(pizza -> System.out.println(pizza.getNome()));

        System.out.println("query per  pizze in ordine ascendete calorie con range tra 300 e 1200 calorie");
        pizzaRepository.findByCalorieBetweenOrderByCalorieAsc(300, 1300).forEach(pizza -> System.out.println(pizza.getNome() + " " + pizza.getCalorie()));

        System.out.println("query per tutte le pizze in ordine ascendete calorie");
        pizzaRepository.findByOrderByCalorieAsc().forEach(pizza -> System.out.println(pizza.getNome()));
    }
}
