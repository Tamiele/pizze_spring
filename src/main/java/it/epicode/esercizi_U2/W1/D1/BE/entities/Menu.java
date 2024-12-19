package it.epicode.esercizi_U2.W1.D1.BE.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @OneToMany(mappedBy = "menu")
    List<Pizza> pizze = new ArrayList<>();


    @OneToMany(mappedBy = "menu")
    List<Bevanda> bevande = new ArrayList<>();

    @OneToMany(mappedBy = "menu")
    List<Topping> toppings = new ArrayList<>();



    public void stampaMenu(){

        for(Pizza pizza : pizze){
            System.out.println(pizza.getNome()+" "+ pizza.getPrezzo()+" "+pizza.getCalorie());
        }


        for(Topping topping : toppings){
            System.out.println(topping.getNome()+" "+ topping.getPrezzo()+" "+topping.getCalorie());
        }

        for(Bevanda bevanda : bevande){
            System.out.println(bevanda.getNome()+" "+ bevanda.getPrezzo()+" "+bevanda.getCalorie());
        }
    }



}