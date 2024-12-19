package it.epicode.esercizi_U2.W1.D1.BE.test;

import it.epicode.esercizi_U2.W1.D1.BE.repository.MenuRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TestMenu {

    @Autowired
    private MenuRepository menuRepository;

    @Test
    @DisplayName("Test salvataggio menu")

    public void testSaveMenu(){

        Long menuSalvati =  menuRepository.count();

        assertEquals(1,menuSalvati);
    }
}
