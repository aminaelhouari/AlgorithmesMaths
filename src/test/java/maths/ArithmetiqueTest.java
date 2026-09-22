package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmetiqueTest {

    @Test
    public void testAlgoCarre(){
        Arithmetique arithmetique = new Arithmetique();
        int resultat = arithmetique.algoCarré(27, 35, 65);
        assertEquals(53, resultat);
    }
}
