package knab.core;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 15-Aug-2010 00:06:31
 */
public class InvalidBICException extends Exception {

    public InvalidBICException(final String bic) {
        super("[" + bic + "]");
    }

}
