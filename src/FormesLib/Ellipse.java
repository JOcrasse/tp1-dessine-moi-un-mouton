package FormesLib;

/**
 * La classe Ellipse
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation d'ellipses.
 */
public class Ellipse extends Rectangle {

    /**
     * Constructeur de la classe Ellipse
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     * @param largeur           le paramètre Largeur
     * @param hauteur           le paramètre Hauteur
     */
    public Ellipse(int x, int y, Couleur couleurLigne, Couleur couleurInterieure, int largeur, int hauteur) {
        super(x, y, couleurLigne, couleurInterieure, largeur, hauteur);
    }
}
