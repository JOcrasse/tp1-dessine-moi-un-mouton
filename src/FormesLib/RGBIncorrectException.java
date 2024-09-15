package FormesLib;

/**
 * L'Exception RGBIncorrectException
 * @author Jonathan Richer
 * @version 1.0
 *
 * Elle est utilisé quand un RGB est incorrect.
 */
public class RGBIncorrectException extends RuntimeException {
    /**
     * Constructeur de RGBIncorrectException
     * @param message le message de l'exception
     */
    public RGBIncorrectException(String message) {
        super(message);
    }
}
