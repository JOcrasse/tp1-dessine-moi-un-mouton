package FormesLib;

/**
 * La classe Triangle
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de triangles.
 */
public class Triangle extends FormePleine {

    /**
     * Paramètre X2
     */
    private int x2;
    /**
     * Paramètre Y2
     */
    private int y2;
    /**
     * Paramètre X3
     */
    private int x3;
    /**
     * Paramètre Y3
     */
    private int y3;

    /**
     * Permet de donner la valeur de X2 du triangle.
     *
     * @return valeur de X2
     */
    public int getX2() {
        return x2;
    }

    /**
     * Permet de changer le X2 du triangle par un entier externe.
     *
     * @param x2 l'entier externe
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Permet de donner la valeur de Y2 du triangle.
     *
     * @return valeur de Y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * Permet de changer le Y2 du triangle par un entier externe.
     *
     * @param y2 l'entier externe
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Permet de donner la valeur de X3 du triangle.
     *
     * @return valeur de X3
     */
    public int getX3() {
        return x3;
    }

    /**
     * Permet de changer le X3 du triangle par un entier externe.
     *
     * @param x3 l'entier externe
     */
    public void setX3(int x3) {
        this.x3 = x3;
    }

    /**
     * Permet de donner la valeur de Y3 du triangle.
     *
     * @return valeur de Y3
     */
    public int getY3() {
        return y3;
    }

    /**
     * Permet de changer le Y3 du triangle par un entier externe.
     *
     * @param y3 l'entier externe
     */
    public void setY3(int y3) {
        this.y3 = y3;
    }

    /**
     * Constructeur de la classe Triangle
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     * @param x2                le paramètre X2
     * @param y2                le paramètre Y2
     * @param x3                le paramètre X3
     * @param y3                le paramètre Y3
     */
    public Triangle(int x, int y, Couleur couleurLigne, Couleur couleurInterieure, int x2, int y2,
                    int x3, int y3) {
        super(x, y, couleurLigne, couleurInterieure);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
}
