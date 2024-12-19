package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Bevanda;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Menu;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Topping;
import it.epicode.esercizi_U2.W1.D1.BE.repository.BevandaRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.PizzaRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(4)
public class MenusRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepository;


    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private BevandaRepository bevandaRepository;

    @Autowired
    private ToppingRepository toppingRepository;

    @Autowired
    private Menu menu;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Pizza> pizze = pizzaRepository.findAll();


        List<Topping> toppings = toppingRepository.findAll();


        List<Bevanda> bevande = bevandaRepository.findAll();

        menu.setPizze(pizze);

        menu.setBevande(bevande);

        menu.setToppings(toppings);

        menuRepository.save(menu);

        menu.stampaMenu();

    }
}
