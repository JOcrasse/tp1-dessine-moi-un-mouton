package FormesLib;

/**
 * La classe FormePleine
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de formes pleines.
 */
public class FormePleine extends Forme {

    /**
     * Valeur de la couleur intérieure de la forme
     */
    protected Couleur couleurInterieure;

    /**
     * Permet de donner la valeur de la couleur intérieure de la forme.
     *
     * @return valeur de la couleur intérieure
     */
    public Couleur getCouleurInterieure() {
        return couleurInterieure;
    }

    /**
     * Permet de changer la couleur intérieure de la forme par une valeur externe.
     *
     * @param couleurInterieure la valeur externe
     */
    public void setCouleurInterieure(Couleur couleurInterieure) {
        this.couleurInterieure = couleurInterieure;
    }

    /**
     * Constructeur de la classe FormePleine
     * avec deux paramètres de couleur
     *
     * @param x                 le paramètre X
     * @param y                 le paramètre Y
     * @param couleurLigne      le paramètre de couleur de ligne
     * @param couleurInterieure le paramètre de couleur intérieure
     */
    public FormePleine(int x, int y, Couleur couleurLigne, Couleur couleurInterieure ) {
        super(x, y, couleurLigne);
        this.couleurInterieure = couleurInterieure;
    }

    /*
      ----------NOTE : TROP GROS------------
      --- Les classes couleurs devrait   ---
      --- être créés avant (utiliser ↑)  ---
      --------------------------------------
    */
    /**
     * Constructeur de la classe FormePleine
     * avec six valeurs constituant deux couleurs
     *
     * @param x              le paramètre X
     * @param y              le paramètre Y
     * @param rougeLigne     la valeur rouge
     * @param vertLigne      la valeur verte
     * @param bleuLigne      la valeur bleue
     * @param rougeInterieur la valeur rouge
     * @param vertInterieur  la valeur verte
     * @param bleuInterieur  la valeur bleue
     */
    public FormePleine(int x, int y, int rougeLigne, int vertLigne, int bleuLigne,
                       int rougeInterieur, int vertInterieur, int bleuInterieur ) {
        super(x, y, rougeLigne, vertLigne, bleuLigne);
        this.couleurInterieure = new Couleur(rougeInterieur, vertInterieur, bleuInterieur);
    }
}
