package FormesLib;

/**
 * La classe Cercle
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de cercles.
 */
public class Cercle extends FormePleine {

    /**
     * Paramètre Rayon du cercle
     */
    private int rayon;

    /**
     * Permet de donner la valeur de Rayon du cercle.
     *
     * @return valeur du Rayon
     */
    public int getRayon() {
        return rayon;
    }

    /**
     * Permet de changer le Rayon du cercle par un entier externe.
     *
     * @param rayon l'entier externe
     */
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    /**
     * Constructeur de la classe Cercle
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     * @param rayon             le paramètre Rayon
     */
    public Cercle(int x, int y, Couleur couleurLigne, Couleur couleurInterieure,int rayon) {
        super(x, y, couleurLigne, couleurInterieure);
        this.rayon = rayon;
    }
}
