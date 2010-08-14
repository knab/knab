package knab.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:37:45
 */
public class AnEmptyBank {

    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("KNABDEZ0XXX");
    }

    @Test
    public void hasABankIdentificationCode() {
        assertEquals("KNABDEZ0XXX", bank.getBIC().toString());
    }

    @Test
    public void hasNoAccounts() {
        assertFalse(bank.hasAccounts());
    }

}
