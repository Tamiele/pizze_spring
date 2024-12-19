package it.epicode.esercizi_U2.W1.D1.BE.entities;

import it.epicode.esercizi_U2.W1.D1.BE.entities.enums.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name ="numeroMax_coperti", nullable = false)
    private int numeroCopertiMassimo;


    @Column(name ="stato_tavolo", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoTavolo statoTavolo;

    @OneToOne
    private Ordine ordine;
}