package FormesLib;

/**
 * La classe Couleur
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle permet l'utilisation de couleurs pour les formes.
 */
public class Couleur {

    /**
     * Valeur du rouge (0-255)
     */
    private int rouge;
    /**
     * Valeur du vert (0-255)
     */
    private int vert;
    /**
     * Valeur du bleu (0-255)
     */
    private int bleu;

    /**
     * Permet de donner la valeur du rouge de la couleur.
     *
     * @return valeur du rouge
     */
    public int getRouge() {
        return rouge;
    }

    /**
     * Permet de changer le rouge de la couleur par un entier externe.
     * L'entier externe doit être contenu entre 0 et 255.
     *
     * @param rouge l'entier externe (0-255)
     */
    public void setRouge(int rouge) {
        if (rouge >= 0 && rouge <= 255) {
            this.rouge = rouge;
        } else {
            throw new IllegalArgumentException("La valeur du rouge doit être contenue entre 0 et" +
                    " 255.");
        }
    }

    /**
     * Permet de donner la valeur du vert de la couleur.
     *
     * @return valeur du vert
     */
    public int getVert() {
        return vert;
    }

    /**
     * Permet de changer le vert de la couleur par un entier externe.
     * L'entier externe doit être contenu entre 0 et 255.
     *
     * @param vert l'entier externe (0-255)
     */
    public void setVert(int vert) {
        if (vert >= 0 && vert <= 255) {
            this.vert = vert;
        } else {
            throw new IllegalArgumentException("La valeur du vert doit être contenue entre 0 et " +
                    "255.");
        }
    }

    /**
     * Permet de donner la valeur du bleu de la couleur.
     *
     * @return valeur du bleu
     */
    public int getBleu() {
        return bleu;
    }

    /**
     * Permet de changer le bleu de la couleur par un entier externe.
     * L'entier externe doit être contenu entre 0 et 255.
     *
     * @param bleu l'entier externe (0-255)
     */
    public void setBleu(int bleu) {
        if (bleu >= 0 && bleu <= 255) {
            this.bleu = bleu;
        } else {
            throw new RGBIncorrectException("La valeur du bleu doit être contenue entre 0 et 255.");
        }
    }

    /**
     * Constructeur de la classe Couleur
     *
     * @param rouge la variable rouge
     * @param vert  la variable vert
     * @param bleu  la variable bleu
     */
    public Couleur(int rouge, int vert, int bleu) {
        if (rouge >= 0 && rouge <= 255) {
            this.rouge = rouge;
        } else {
            throw new RGBIncorrectException("La valeur du rouge doit être contenue entre 0 et " +
                    "255.");
        }
        if (vert >= 0 && vert <= 255) {
            this.vert = vert;
        } else {
            throw new IllegalArgumentException("La valeur du vert doit être contenue entre 0 et " +
                    "255.");
        }
        if (bleu >= 0 && bleu <= 255) {
            this.bleu = bleu;
        } else {
            throw new RGBIncorrectException("La valeur du bleu doit être contenue entre 0 et 255" +
                    ".");
        }
    }
}
