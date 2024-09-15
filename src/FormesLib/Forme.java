package FormesLib;

/**
 * La classe Forme
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de formes.
 */
public class Forme {

    /**
     * Paramètre X
     */
    protected int x;
    /**
     * Paramètre Y
     */
    protected int y;
    /**
     * Valeur de la couleur de ligne de la forme (Contour)
     */
    protected Couleur couleurLigne;

    /**
     * Permet de donner la valeur de X de la forme.
     *
     * @return valeur de X
     */
    public int getX2() {
        return x;
    }

    /**
     * Permet de changer le X de la forme par un entier externe.
     *
     * @param x2 l'entier externe
     */
    public void setX2(int x2) {
        this.x = x2;
    }

    /**
     * Permet de donner la valeur de Y de la forme.
     *
     * @return valeur de Y
     */
    public int getY2() {
        return y;
    }

    /**
     * Permet de changer le Y de la forme par un entier externe.
     *
     * @param y2 l'entier externe
     */
    public void setY2(int y2) {
        this.y = y2;
    }

    /**
     * Permet de donner la valeur de la couleur de ligne de la forme.
     *
     * @return valeur de la couleur de ligne
     */
    public Couleur getCouleurLigne() {
        return couleurLigne;
    }

    /**
     * Permet de changer la couleur de ligne de la forme par une valeur externe.
     *
     * @param couleurLigne la valeur externe
     */
    public void setCouleurLigne(Couleur couleurLigne) {
        this.couleurLigne = couleurLigne;
    }

    /**
     * Constructeur de la classe Forme
     * avec un paramètre de couleur
     *
     * @param x            le paramètre X
     * @param y            le paramètre Y
     * @param couleurLigne le paramètre Couleur de ligne
     */
    public Forme(int x, int y, Couleur couleurLigne) {
        this.x = x;
        this.y = y;
        this.couleurLigne = couleurLigne;
    }

    /*
      ----------NOTE : TROP GROS------------
      --- Les classes couleurs devrait   ---
      --- être créés avant (utiliser ↑)  ---
      --------------------------------------
    */
    /**
     * Constructeur de la classe Forme
     * avec trois valeurs constituant la couleur
     *
     * @param x     le paramètre X
     * @param y     le paramètre Y
     * @param rouge la valeur rouge
     * @param vert  la valeur verte
     * @param bleu  la valeur bleue
     */
    public Forme(int x, int y, int rouge, int vert, int bleu) {
        this.x = x;
        this.y = y;
        this.couleurLigne = new Couleur(rouge, vert, bleu);
    }
}
