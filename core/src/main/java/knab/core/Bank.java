package knab.core;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:28:56
 */
public class Bank {

    private BIC bic;

    public Bank(final String bic) throws InvalidBICException {
        this.bic = new BIC(bic);
    }

    public BIC getBIC() {
        return bic;
    }

    public boolean hasAccounts() {
        // TODO: implement me
        return false;
    }

}
