package maths;

public class Algebre {

    /**
     * Calcule la factorielle d'un nombre n de manière itérative
     * @param n Un entier
     * @return La factorielle de n
     */
    public int factorielleIterative(int n){
        int resultat = 1;
        for (int i = 1; i <= n; i++ ){
            resultat *= i;
        }
        return resultat;
    }
}
