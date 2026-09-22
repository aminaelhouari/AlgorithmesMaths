package maths;

public class Arithmetique {

    /**
     * Calcule l'exponentiation rapide sous modulo a^r mod m.
     *
     * @param a La base
     * @param r La puissance (exposant)
     * @param m Le modulo
     * @return Le résultat du calcul de (a^r) mod m
     */
    public int algoCarré(int a, int r, int m){
        int p = 1;
        while (r > 0){
            if (r%2 == 0){
               r /= 2;
            }
            else{
                r = (r - 1)/2;
                p = p * a % m;
            }
            a = a*a % m;
        }
        return p;
    }
}
