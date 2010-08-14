package knab.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:52:47
 */
public class ABIC {

    private BIC bic;

    @Before
    public void setUp() throws Exception {
        bic = new BIC("KNABDEZ0");
    }

    @Test
    public void hasA4CharacterBankCode() {
        final String bankCode = bic.getBankCode();
        assertEquals(4, bankCode.length());
        assertEquals("KNAB", bankCode);
    }

    @Test
    public void hasA2CharacterCountryCode() {
        final String countryCode = bic.getCountryCode();
        assertEquals(2, countryCode.length());
        assertEquals("DE", countryCode);
    }

    @Test
    public void hasA2CharacterLocality() {
        final String locality = bic.getLocality();
        assertEquals(2, locality.length());
        assertEquals("Z0", locality);
    }

    @Test
    public void hasABranchCodeEvenIfThatIsUnspecified() {
        final String branchCode = bic.getBranchCode();
        assertEquals("XXX", branchCode);
    }

}
