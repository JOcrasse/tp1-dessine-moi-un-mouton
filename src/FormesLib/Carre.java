package FormesLib;

/**
 * La classe Carre
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de carrés.
 */
public class Carre extends FormePleine{

    /**
     * Paramètre Largeur du carré
     */
    protected int largeur;

    /**
     * Permet de donner la valeur de Largeur du carré.
     *
     * @return valeur de Largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Permet de changer la Largeur du carré par un entier externe.
     *
     * @param largeur l'entier externe
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     * Constructeur de la classe Carre
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     * @param largeur           le paramètre Largeur
     */
    public Carre(int x, int y, Couleur couleurLigne, Couleur couleurInterieure, int largeur) {
        super(x, y, couleurLigne, couleurInterieure);
        this.largeur = largeur;
    }
}
