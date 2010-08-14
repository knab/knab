package knab.core;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 22:58:05
 */
public class Core {

    private Collection<Client> clients = new ArrayList<Client>();

    public boolean hasClients() {
        return !clients.isEmpty();
    }

    public void addClient(final Client client) {
        clients.add(client);
    }

}
