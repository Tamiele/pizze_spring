package it.epicode.esercizi_U2.W1.D1.BE.runners;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Alimenti;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D1.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D1.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.OrdineRepository;
import it.epicode.esercizi_U2.W1.D1.BE.repository.TavoloRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(6)
public class OrdiniRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private OrdineRepository oridineRepository;

    @Autowired
    private Ordine newOrdine;

@Value("${costo.coperto}")
private double costoCoperto;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {


        newOrdine.setMenu(menuRepository.findAll().getFirst());

       newOrdine.setImportoTotale(100 + costoCoperto);

        newOrdine.setNumeroCoperti(6);

        oridineRepository.save(newOrdine);

        System.out.println(oridineRepository.findById(1L));


    }
}
