package FormesLib;

/**
 * La classe Rectangle
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de rectangles.
 */
public class Rectangle extends Carre {

    /**
     * Paramètre Hauteur du rectangle
     */
    protected int hauteur;

    /**
     * Permet de donner la valeur de Hauteur du rectangle.
     *
     * @return valeur de Hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Permet de changer la Hauteur du rectangle par un entier externe.
     *
     * @param hauteur l'entier externe
     */
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * Constructeur de la classe Rectangle
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     * @param largeur           le paramètre Largeur
     * @param hauteur           le paramètre Hauteur
     */
    public Rectangle(int x, int y, Couleur couleurLigne, Couleur couleurInterieure, int largeur,
                     int hauteur) {
        super(x, y, couleurLigne, couleurInterieure, largeur);
        this.hauteur = hauteur;
    }


}
