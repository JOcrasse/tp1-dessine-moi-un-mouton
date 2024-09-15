package FormesLib;

/**
 * La classe Ligne
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de lignes.
 */
public class Ligne extends Forme {

    /**
     * Paramètre X2
     */
    private int x2;
    /**
     * Paramètre Y2
     */
    private int y2;

    /**
     * Permet de donner la valeur de X2 de la forme.
     *
     * @return valeur de X2
     */
    public int getX2() {
        return x2;
    }

    /**
     * Permet de changer le X2 de la forme par un entier externe.
     *
     * @param x2 l'entier externe
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Permet de donner la valeur de Y2 de la forme.
     *
     * @return valeur de Y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * Permet de changer le Y2 de la forme par un entier externe.
     *
     * @param y2 l'entier externe
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Constructeur de la classe Ligne
     *
     * @param x            le paramètre X
     * @param y            le paramètre Y
     * @param couleurLigne le paramètre Couleur de ligne
     * @param x2           le paramètre X2
     * @param y2           le paramètre Y2
     */
    public Ligne(int x, int y, Couleur couleurLigne, int x2, int y2) {
        super(x, y, couleurLigne);
        this.x2 = x2;
        this.y2 = y2;
    }
}
