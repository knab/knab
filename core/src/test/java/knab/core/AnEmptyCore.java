package knab.core;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 22:55:58
 */
public class AnEmptyCore {

    private Core core = new Core();

    @Test
    public void hasNoClients() {
        assertFalse(core.hasClients());
    }

    @Test
    public void hasAClientAfterAddingOne() {
        core.addClient(new Client("client.name"));
        assertTrue(core.hasClients());
    }

}
