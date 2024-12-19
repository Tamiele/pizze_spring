package it.epicode.esercizi_U2.W1.D1.BE.repository;

import it.epicode.esercizi_U2.W1.D1.BE.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Pizza findByNomeIgnoreCase(String nome);

    List<Pizza> findByPrezzoBetweenOrderByPrezzo(double min, double max);

    List<Pizza> findByCalorieBetweenOrderByCalorieAsc(int minCal, int maxCal);

    List<Pizza> findByOrderByCalorieAsc();


}
