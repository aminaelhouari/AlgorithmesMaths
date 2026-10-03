package maths;

public class Arithmetique {

    /**
     * Calcule l'exponentiation rapide sous modulo a^r mod m
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

    /**
     * Execute l'algorithme d'Euclide entre 2 entiers et affiche la relation de Bezout
     * @param a Le premier entier
     * @param b Le deuxieme entier
     * @return Un tableau d'entier contenant le PGCD, et les coefficients x et y
     */
    public int[] algoEuclideEtendu(int a, int b) {
        int a_init = a;
        int b_init = b;

        int x0 = 1, y0 = 0;
        int x1 = 0, y1 = 1;
        int q, r;

        while (b > 0) {
            q = a / b;
            r = a % b;
            a = b;
            b = r;

            int xtemp = x1;
            x1 = x0 - q * x1;
            x0 = xtemp;

            int ytemp = y1;
            y1 = y0 - q * y1;
            y0 = ytemp;
        }

        System.out.println("Relation de Bezout : " + a_init + " * " + x0 + " + " + b_init + " * " + y0 + " = " + a);
        return new int[] { a, x0, y0 };
    }
}
