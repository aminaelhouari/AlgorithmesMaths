package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmetiqueTest {

    @Test
    public void testAlgoCarre(){
        Arithmetique arithmetique = new Arithmetique();
        int resultat = arithmetique.algoCarré(55, 11, 65);
        assertEquals(35, resultat);
    }

    @Test
    public void testAlgoEuclideEtendu(){
        Arithmetique arithmetique = new Arithmetique();
        int resultat[] = arithmetique.algoEuclideEtendu(298, 36);
        assertEquals(2, resultat[0]);
        assertEquals(-7, resultat[1]);
        assertEquals(58, resultat[2]);
    }
}
