package it.epicode.esercizi_U2.W1.D1.BE.entities;

import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoOrdine;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;



    @Column(name ="stato_ordine", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoOrdine statoOrdine;

    @Column(name ="numero_coperti", nullable = false)
    private int numeroCoperti;

    @Column(name ="ora_acquisizione", nullable = false)
    private LocalTime oraAcquisizione;

    @Column(name ="importo_totale", nullable = false)
    private double importoTotale;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

}