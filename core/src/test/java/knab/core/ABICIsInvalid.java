package knab.core;

import org.junit.Test;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 15-Aug-2010 00:10:04
 */
public class ABICIsInvalid {

    @Test(expected=InvalidBICException.class)
    public void whenNull() throws Exception {
        new BIC(null);
    }

    @Test(expected=InvalidBICException.class)
    public void whenTooShort() throws Exception {
        new BIC("KNABDEZ"); // missing optional branch code and missing 2nd locality character.
    }

}
