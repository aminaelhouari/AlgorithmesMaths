package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebreTest {

    @Test
    public void testFactoIte(){
        Algebre algebre = new Algebre();
        assertEquals(720, algebre.factorielleIterative(6));
    }

    @Test
    public void testFactoRec(){
        Algebre algebre = new Algebre();
        assertEquals(720, algebre.factorielleRecursive(6));
    }
}
