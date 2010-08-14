package knab.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:10:24
 */
public class AnEmptyClient {

    private Client client = new Client("client.name");

    @Test
    public void hasAName() {
        assertEquals("client.name", client.getName());
    }

    @Test
    public void equalsAnOtherClientIfTheNameEquals() {
        Client otherClient = new Client("client.name");
        assertTrue(client.equals(otherClient));
    }

    @Test
    public void notEqualsAnotherClientWithOtherName() {
        Client otherClient = new Client("other.name");
        assertFalse(client.equals(otherClient));
    }

    @Test
    public void hasNoBanks() {
        assertFalse(client.hasBanks());
    }

    @Test
    public void hasABankAfterAddingOne() throws Exception {
        client.addBank(new Bank(KnabBank.BIC));
        assertTrue(client.hasBanks());
    }

}
